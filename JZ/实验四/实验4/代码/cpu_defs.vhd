LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;

PACKAGE cpu_defs IS
	TYPE     opcode IS (load, store, add, sub, bne);	
	CONSTANT rfill: STD_LOGIC_VECTOR(2 downto 0):=(others =>'0');
		FUNCTION op2slv(op:in opcode) RETURN STD_LOGIC_VECTOR;
END PACKAGE cpu_defs;

PACKAGE BODY cpu_defs IS
	TYPE     optable IS ARRAY(opcode) OF STD_LOGIC_VECTOR(2 DOWNTO 0);
	CONSTANT trans_table:optable :=("000", "001", "010", "011", "100");
	FUNCTION op2slv(op:IN opcode) RETURN STD_LOGIC_VECTOR IS
	BEGIN
			RETURN trans_table(op);
	END FUNCTION op2slv;
	
END PACKAGE BODY cpu_defs;