-- 微程序控制器实验 
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL,IEEE.NUMERIC_STD.ALL;
USE WORK.CPU_DEFS.ALL;

ENTITY CPU IS
PORT( clock      : IN   STD_LOGIC;
      reset      : IN   STD_LOGIC;
	  mode       : IN   STD_LOGIC_VECTOR(2 DOWNTO 0);--确定output输出什么信息。       
	  mem_addr   : IN 	UNSIGNED(4 DOWNTO 0);	--内存地址,范围0-31，修改其值，可观察内存不同单元储存的内容。

	 -- output     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0); 	
 	  outbus     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --总线	
	  outpc      : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --PC	
	  outalu     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --ALU结果
	  outir     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --IR	
	  outmar     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --MAR	
	  outmdr     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   --MDR	
	  outmem     : OUT  STD_LOGIC_VECTOR(7 DOWNTO 0);   -- mem ,用mem_addr寻址。	
 
	  data_r_out : OUT  STD_LOGIC_VECTOR(19 DOWNTO 0);  --控制器输出微码。（应为实验观察用）
	  op_out     : OUT  STD_LOGIC_VECTOR(2 DOWNTO 0);  --控制器输出OP。（应为实验观察用）
	  add_r_out  : OUT  UNSIGNED(4 DOWNTO 0)  	 --控制器输出微地址。 （应为实验观察用）
	);	         
END ENTITY;

ARCHITECTURE rtl OF CPU IS	
				--程序
	TYPE mem_array IS ARRAY (0 TO 31) OF STD_LOGIC_VECTOR(7 DOWNTO 0);
	SIGNAL   mem       : mem_array;
	CONSTANT prog      : mem_array:=(
				0=> op2slv(load)  & STD_LOGIC_VECTOR(TO_UNSIGNED(4,5)),--地址码为4
				 --&是一个连接操作
				 --TO_UNSIGNED(4,5)将整数4转换成5位的unsigned类型（与std_logic_vector(4 downtown 0)类型相似）
				1=> op2slv(add)   & STD_LOGIC_VECTOR(TO_UNSIGNED(5,5)),--地址码为5
				2=> op2slv(store) & STD_LOGIC_VECTOR(TO_UNSIGNED(6,5)),--地址码为6
				3=> op2slv(bne)   & STD_LOGIC_VECTOR(TO_UNSIGNED(7,5)),--地址码为7	
				4=> STD_LOGIC_VECTOR(TO_UNSIGNED(2,8)),--存了一个数据2，将来load指令装入
				5=> STD_LOGIC_VECTOR(TO_UNSIGNED(3,8)),--存了一个数据3，将来add指令用作另一个操作数
				OTHERS => (OTHERS =>'0'));	
				--控存
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
				
				
				4=> "00100010000000000000",   --load第二条微指令
				5=> "00000000000100000000",   --store第二条微指令
				6=> "00000010100001000000",   --add第二条微指令
				7=> "00000010100000100000",   --sub第二条微指令
				8=> "00000000000110000100",   --load入口
				9=> "01000001000000000101",   --store入口
			   10=> "00000000000110000110",	  --add入口
			   11=> "00000000000110000111",   --sub入口
			   12=> "00000000000110010000",   --bne入口
       		   13=> "10000010000000000000",   --如Z_flag为“0”,bne第二条微指令
		       14=> "00000000000000000000");  --如Z_flag为“1”,bne第二条微指令

	
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
		 --add_r定义为5位UNSIGNED，将来可转换为INTEGER，用作下标,访问存放微码的数组microcode_array.
    	
    	VARIABLE data_r    : STD_LOGIC_VECTOR(19 DOWNTO 0);  --存放微码,作用相当于uIR
		VARIABLE temp      : STD_LOGIC_VECTOR(4 DOWNTO 0);
	BEGIN		
	
		IF reset='0' THEN	--初始化
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
			--微程序控制器	
			data_r  := code(TO_INTEGER(add_r));	 --根据微地址取出微代码			
			--生成下地址
			IF data_r(4 DOWNTO 0)="01111" THEN -- 如果下址是01111则根据op得到后继地址，
				                               --“01”并上OP，如load指令的op为“000”，则load指令的后继地址为01000。
			    temp:="01" & op(2 DOWNTO 0);
				add_r := UNSIGNED(temp);
			ELSIF data_r(4 DOWNTO 0)="10000"  THEN-- 如果下址是10000则根据Z_flag得到后继地址，
							                      --如Z_flag为“1”，则后继地址为01110。
							                      --如Z_flag为“0”，则后继地址为01101。
				IF z_flag='1' THEN
					add_r:="01110";
				ELSE
					add_r :="01101";
				END IF;
			ELSE
				add_r   := UNSIGNED(data_r(4 DOWNTO 0)); --由下址字段确定后继地址
			END IF;			
			data_r_out <=data_r;  --控制器输出微码。（应为实验观察用）
			add_r_out <= add_r;   --控制器输出微地址。（应为实验观察用）
			
		    --PC
			IF data_r(16)='1' THEN     --PC_bus='1'
				sysbus := rfill & STD_LOGIC_VECTOR(count);   --rfill="000"为常量,count为5位UNSIGNED(4 DOWNTO 0)信号
				                                             --转换为STD_LOGIC_VECTOR,连接后形成8位地址（PC的值）,送sysbus
			END IF;		
			IF data_r(19)='1' THEN     --load_PC='1',转移指令修改PC
				count <= UNSIGNED(mdr(4 DOWNTO 0));
			ELSIF data_r(10)='1' THEN    --INC_PC='1',取指令后PC自加1
				count <= count+1;					
			ELSE 
				count <= count;          --其他微周期count保持不变
			END IF;				
			
			--IR
			IF data_r(15)='1' THEN   --load_IR
				instr_reg := mdr;				
			END IF;
			IF data_r(9)='1' THEN    --Addr_bus='1' , 送直接地址，指令中的低5位。load、store、add用，因为本例中有3条指令用，放在译码之前一个周期（即第3个周期）。
				sysbus := rfill & instr_reg(4 DOWNTO 0);--instr_reg为STD_LOGIC_VECTOR
			END IF;	
			op     <= instr_reg(7 DOWNTO 5);			
			IR_out <= instr_reg; --控制器输出取到的指令。（应为实验观察用）
			op_out <=op;   --控制器输出OP。（应为实验观察用）
			
			--ALU
			IF data_r(17)='1' THEN    --load_ACC='1',mdr保存的数据送累加器ACC		
				acc:=UNSIGNED(mdr);
			END IF;
			IF data_r(11)='1' THEN  --ALU_ACC='1',ACC送ALU
				IF data_r(6)='1' THEN   --ALU_add='1',add指令，做加法
					acc := acc + UNSIGNED(mdr);
				ELSIF data_r(5)='1' THEN   --ALU_sub='1',sub指令，做减法
			 		acc := acc - UNSIGNED(mdr);
				END IF;
			END IF;
			IF data_r(18)='1' THEN  --ACC_bus='1',ACC送bus,store指令用来将结果保存在mem中.
				sysbus := STD_LOGIC_VECTOR(acc);
			END IF;
			IF acc=zero THEN --计算完后置标志位
				z_flag <='1';
			ELSE
				z_flag <='0';
			END IF;
			acc_out<= acc;--控制器输出计算结果ACC。（应为实验观察用）
			
			--RAM
			IF data_r(14)='1' THEN  --load_MAR='1'
				mar := UNSIGNED(sysbus(4 DOWNTO 0));
			ELSIF data_r(12)='1' THEN   --load_MDR='1'
				mdr := sysbus;
			ELSIF data_r(8)='1' THEN   --CS='1'
				IF data_r(7)='1' THEN      --R_NW='1'
					mdr := mem(TO_INTEGER(mar));	--读存储器，读出数据送MDR				
				ELSE
					mem(TO_INTEGER(mar))<=mdr; --写存储器，MDR中的数据写入存储器
				END IF;
			END IF;			
			IF data_r(13)='1' THEN   --MDR_bus='1'
				sysbus:=mdr;
			END IF;
			mdr_out <= mdr;--数据寄存器输出。（应为实验观察用）
			mar_out <= mar;--地址寄存器输出。（应为实验观察用）	
		END IF;	
		
		sysbus_out <=sysbus;--系统总线输出。（应为实验观察用）	
		
		 
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
										
										
