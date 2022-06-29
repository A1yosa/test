-- ΢���������ʵ�� 
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL,IEEE.NUMERIC_STD.ALL;
USE WORK.CPU_DEFS.ALL;

ENTITY CPU IS
PORT( clock      : IN   STD_LOGIC;
      reset      : IN   STD_LOGIC;
	  mode       : IN   STD_LOGIC_VECTOR(2 DOWNTO 0);--ȷ��output���ʲô��Ϣ��       
	  mem_addr   : IN 	UNSIGNED(4 DOWNTO 0);	--�ڴ��ַ,��Χ0-31���޸���ֵ���ɹ۲��ڴ治ͬ��Ԫ��������ݡ�

	 -- output     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0); 	
 	  outbus     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --����	
	  outpc      : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --PC	
	  outalu     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --ALU���
	  outir     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --IR	
	  outmar     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --MAR	
	  outmdr     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --MDR	
	  outmem     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   -- mem ,��mem_addrѰַ��	
 
	  data_r_out : OUT  STD_LOGIC_VECTOR(19 DOWNTO 0);  --���������΢�롣��ӦΪʵ��۲��ã�
	  op_out     : OUT  STD_LOGIC_VECTOR(2 DOWNTO 0);  --���������OP����ӦΪʵ��۲��ã�
	  add_r_out  : OUT  UNSIGNED(4 DOWNTO 0)  	 --���������΢��ַ�� ��ӦΪʵ��۲��ã�
	);	         
END ENTITY;

ARCHITECTURE rtl OF CPU IS	
				--����
	TYPE mem_array IS ARRAY (0 TO 31) OF STD_LOGIC_VECTOR(7 DOWNTO 0);
	SIGNAL   mem       : mem_array;
	CONSTANT prog      : mem_array:=(
				0=> op2slv(load)  & STD_LOGIC_VECTOR(TO_UNSIGNED(4,5)),--��ַ��Ϊ4
				 --&��һ�����Ӳ���
				 --TO_UNSIGNED(4,5)������4ת����5λ��unsigned���ͣ���std_logic_vector(4 downtown 0)�������ƣ�
				1=> op2slv(add)   & STD_LOGIC_VECTOR(TO_UNSIGNED(5,5)),--��ַ��Ϊ5
				2=> op2slv(store) & STD_LOGIC_VECTOR(TO_UNSIGNED(6,5)),--��ַ��Ϊ6
				3=> op2slv(bne)   & STD_LOGIC_VECTOR(TO_UNSIGNED(7,5)),--��ַ��Ϊ7	
				4=> STD_LOGIC_VECTOR(TO_UNSIGNED(2,8)),--����һ������2������loadָ��װ��
				5=> STD_LOGIC_VECTOR(TO_UNSIGNED(3,8)),--����һ������3������addָ��������һ��������
				OTHERS => (OTHERS =>'0'));	
				--�ش�
	TYPE microcode_array IS ARRAY (0 TO 14) OF STD_LOGIC_VECTOR(19 DOWNTO 0);
	CONSTANT code      : microcode_array:=(
				0=> "00010100010000000001",
				--   0         0         0         1        0          1        0         0         0        1      0         0   0    0   0   0   0   0   0   1
		        --  19        18        17        16       15         14       13        12        11       10      9         8   7    6   5   4   3   2   1   0
	            --load_PC    ACC_bus  load_ACC   PC_bus  load_IR   load_MAR  MDR_bus   load_MDR  ALU_ACC  INC_PC  Addr_bus   CS  R_NW  +   - ua4 ua3 ua2 ua1  ua0
				
				1=> "00000000000110000010",
				--   0         0         0         0        0          0        0         0         0        0      0         1    1   0   0   0   0   0   1   0
		        --  19        18        17        16       15         14       13        12        11       10      9         8    7   6   5   4   3   2   1   0
	            --load_PC    ACC_bus  load_ACC   PC_bus  load_IR   load_MAR  MDR_bus   load_MDR  ALU_ACC  INC_PC  Addr_bus   CS  R_NW  +   - ua4 ua3 ua2 ua1  ua0
								
				2=> "00001010000000000011",
				--   0         0         0         0        1          0        1         0         0        0      0         0    0   0   0   0   0   0   1   1
		        --  19        18        17        16       15         14       13        12        11       10      9         8    7   6   5   4   3   2   1   0
	            --load_PC    ACC_bus  load_ACC   PC_bus  load_IR   load_MAR  MDR_bus   load_MDR  ALU_ACC  INC_PC  Addr_bus   CS  R_NW  +   - ua4 ua3 ua2 ua1  ua0
				
				
				3=> "00000100001000001111",	
				--   0         0         0         0        0          1        0         0         0        0      1         0    0   0   0   0   1   1   1   1
		        --  19        18        17        16       15         14       13        12        11       10      9         8    7   6   5   4   3   2   1   0
	            --load_PC    ACC_bus  load_ACC   PC_bus  load_IR   load_MAR  MDR_bus   load_MDR  ALU_ACC  INC_PC  Addr_bus   CS  R_NW  +   - ua4 ua3 ua2 ua1  ua0
				
				
				4=> "00100010000000000000",   --load�ڶ���΢ָ��
				5=> "00000000000100000000",   --store�ڶ���΢ָ��
				6=> "00000010100001000000",   --add�ڶ���΢ָ��
				7=> "00000010100000100000",   --sub�ڶ���΢ָ��
				8=> "00000000000110000100",   --load���
				9=> "01000001000000000101",   --store���
			   10=> "00000000000110000110",	  --add���
			   11=> "00000000000110000111",   --sub���
			   12=> "00000000000110010000",   --bne���
       		   13=> "10000010000000000000",   --��Z_flagΪ��0��,bne�ڶ���΢ָ��
		       14=> "00000000000000000000");  --��Z_flagΪ��1��,bne�ڶ���΢ָ��

	
	SIGNAL count    :  UNSIGNED(4 DOWNTO 0);
	SIGNAL op       :  STD_LOGIC_VECTOR(2 DOWNTO 0);		
	SIGNAL z_flag   :  STD_LOGIC;                          
	SIGNAL mdr_out  :  STD_LOGIC_VECTOR(7 DOWNTO 0);   
	SIGNAL mar_out  :  UNSIGNED(4 DOWNTO 0);       
	SIGNAL IR_out   :  STD_LOGIC_VECTOR(7 DOWNTO 0);    	
	SIGNAL acc_out  :  UNSIGNED(7 DOWNTO 0);            	
	SIGNAL sysbus_out : STD_LOGIC_VECTOR(7 DOWNTO 0);  
	
BEGIN	
		
	PROCESS(reset,clock)
		VARIABLE instr_reg : STD_LOGIC_VECTOR(7 DOWNTO 0);	
		VARIABLE acc       : UNSIGNED(7 DOWNTO 0);
		CONSTANT zero      : UNSIGNED(7 DOWNTO 0):=(OTHERS =>'0');		
		VARIABLE mdr       : STD_LOGIC_VECTOR(7 DOWNTO 0);
		VARIABLE mar       : UNSIGNED(4 DOWNTO 0);
		VARIABLE sysbus    : STD_LOGIC_VECTOR(7 DOWNTO 0);			
		VARIABLE microcode : microcode_array;
		VARIABLE add_r     : UNSIGNED(4 DOWNTO 0);	        
		 --add_r����Ϊ5λUNSIGNED��������ת��ΪINTEGER�������±�,���ʴ��΢�������microcode_array.
    	
    	VARIABLE data_r    : STD_LOGIC_VECTOR(19 DOWNTO 0);  --���΢��,�����൱��uIR
		VARIABLE temp      : STD_LOGIC_VECTOR(4 DOWNTO 0);
	BEGIN		
	
		IF reset='0' THEN	--��ʼ��
			add_r:=(OTHERS =>'0');			         
			count     <= (OTHERS =>'0');
			instr_reg := (OTHERS =>'0');
			acc       := (OTHERS =>'0');
			mdr       := (OTHERS =>'0');
			mar       := (OTHERS =>'0');
			z_flag    <='0';
			mem       <= prog;
			sysbus    :=(OTHERS =>'0');	
			
		ELSIF RISING_EDGE(clock) THEN			
			--΢���������	
			data_r  := code(TO_INTEGER(add_r));	 --����΢��ַȡ��΢����			
			--�����µ�ַ
			IF data_r(4 DOWNTO 0)="01111" THEN -- �����ַ��01111�����op�õ���̵�ַ��
				                               --��01������OP����loadָ���opΪ��000������loadָ��ĺ�̵�ַΪ01000��
			    temp:="01" & op(2 DOWNTO 0);
				add_r := UNSIGNED(temp);
			ELSIF data_r(4 DOWNTO 0)="10000"  THEN-- �����ַ��10000�����Z_flag�õ���̵�ַ��
							                      --��Z_flagΪ��1�������̵�ַΪ01110��
							                      --��Z_flagΪ��0�������̵�ַΪ01101��
				IF z_flag='1' THEN
					add_r:="01110";
				ELSE
					add_r :="01101";
				END IF;
			ELSE
				add_r   := UNSIGNED(data_r(4 DOWNTO 0)); --����ַ�ֶ�ȷ����̵�ַ
			END IF;			
			data_r_out <=data_r;  --���������΢�롣��ӦΪʵ��۲��ã�
			add_r_out <= add_r;   --���������΢��ַ����ӦΪʵ��۲��ã�
			
		    --PC
			IF data_r(16)='1' THEN     --PC_bus='1'
				sysbus := rfill & STD_LOGIC_VECTOR(count);   --rfill="000"Ϊ����,countΪ5λUNSIGNED(4 DOWNTO 0)�ź�
				                                             --ת��ΪSTD_LOGIC_VECTOR,���Ӻ��γ�8λ��ַ��PC��ֵ��,��sysbus
			END IF;		
			IF data_r(19)='1' THEN     --load_PC='1',ת��ָ���޸�PC
				count <= UNSIGNED(mdr(4 DOWNTO 0));
			ELSIF data_r(10)='1' THEN    --INC_PC='1',ȡָ���PC�Լ�1
				count <= count+1;					
			ELSE 
				count <= count;          --����΢����count���ֲ���
			END IF;				
			
			--IR
			IF data_r(15)='1' THEN   --load_IR
				instr_reg := mdr;				
			END IF;
			IF data_r(9)='1' THEN    --Addr_bus='1' , ��ֱ�ӵ�ַ��ָ���еĵ�5λ��load��store��add�ã���Ϊ��������3��ָ���ã���������֮ǰһ�����ڣ�����3�����ڣ���
				sysbus := rfill & instr_reg(4 DOWNTO 0);--instr_regΪSTD_LOGIC_VECTOR
			END IF;	
			op     <= instr_reg(7 DOWNTO 5);			
			IR_out <= instr_reg; --���������ȡ����ָ���ӦΪʵ��۲��ã�
			op_out <=op;   --���������OP����ӦΪʵ��۲��ã�
			
			--ALU
			IF data_r(17)='1' THEN    --load_ACC='1',mdr������������ۼ���ACC		
				acc:=UNSIGNED(mdr);
			END IF;
			IF data_r(11)='1' THEN  --ALU_ACC='1',ACC��ALU
				IF data_r(6)='1' THEN   --ALU_add='1',addָ����ӷ�
					acc := acc + UNSIGNED(mdr);
				ELSIF data_r(5)='1' THEN   --ALU_sub='1',subָ�������
			 		acc := acc - UNSIGNED(mdr);
				END IF;
			END IF;
			IF data_r(18)='1' THEN  --ACC_bus='1',ACC��bus,storeָ�����������������mem��.
				sysbus := STD_LOGIC_VECTOR(acc);
			END IF;
			IF acc=zero THEN --��������ñ�־λ
				z_flag <='1';
			ELSE
				z_flag <='0';
			END IF;
			acc_out<= acc;--���������������ACC����ӦΪʵ��۲��ã�
			
			--RAM
			IF data_r(14)='1' THEN  --load_MAR='1'
				mar := UNSIGNED(sysbus(4 DOWNTO 0));
			ELSIF data_r(12)='1' THEN   --load_MDR='1'
				mdr := sysbus;
			ELSIF data_r(8)='1' THEN   --CS='1'
				IF data_r(7)='1' THEN      --R_NW='1'
					mdr := mem(TO_INTEGER(mar));	--���洢��������������MDR				
				ELSE
					mem(TO_INTEGER(mar))<=mdr; --д�洢����MDR�е�����д��洢��
				END IF;
			END IF;			
			IF data_r(13)='1' THEN   --MDR_bus='1'
				sysbus:=mdr;
			END IF;
			mdr_out <= mdr;--���ݼĴ����������ӦΪʵ��۲��ã�
			mar_out <= mar;--��ַ�Ĵ����������ӦΪʵ��۲��ã�	
		END IF;	
		
		sysbus_out <=sysbus;--ϵͳ�����������ӦΪʵ��۲��ã�	
		
		 
	END PROCESS;
	
			outbus<=sysbus_out;
			outpc(4 DOWNTO 0)<= STD_LOGIC_VECTOR(count);	
			outalu <= STD_LOGIC_VECTOR(acc_out);
			outir <= IR_out;	
			outmar(4 DOWNTO 0) <= STD_LOGIC_VECTOR(mar_out);
			outmdr <= mdr_out;	
			outpc(4 downto 0)<=STD_LOGIC_VECTOR(count);
			outmem <= mem(TO_INTEGER(mem_addr));	
									
END ARCHITECTURE;						
										
										
