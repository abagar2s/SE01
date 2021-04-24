import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabelleImplTest {

	public String[][] c1 , c4;
	public TabelleImpl test1,test4;

	@BeforeEach
	void setUp() throws Exception {
          c4 = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" },{"F","C"}};
		
		 test4 = new TabelleImpl();
         c1 =new String[][] {{ "Z" , "X" }, { "X", "H" }, { "B", "X" },{"Y","X"}};
		
		 test1 = new TabelleImpl();
	}

	@Test
	void test4() {
		
	    char[] output = test4.isWellStored(c4);
		char[] a = {'F','B','A','C','D'} ;
		assertArrayEquals(a,output);
	}
	@Test
	void test1() {
		
		char[] output = test1.isWellStored(c1);
		char[] a = {'Y','B','Z','X','H'} ;
		assertArrayEquals(a,output);
	}
	

}
