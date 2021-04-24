import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabelleImplTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test4() {
		String [][] c = {{ "A" , "C" }, { "C", "D" }, { "B", "C" },{"F","C"}};
		
		TabelleImpl test = new TabelleImpl();
		char[] output = test.isWellStored(c);
		char[] a = {'F','B','A','C','D'} ;
		assertArrayEquals(a,output);
	}
	@Test
	void test1() {
		String [][] c = {{ "Z" , "X" }, { "X", "H" }, { "B", "X" },{"Y","X"}};
		
		TabelleImpl test = new TabelleImpl();
		char[] output = test.isWellStored(c);
		char[] a = {'Y','B','Z','X','H'} ;
		assertArrayEquals(a,output);
	}
	

}
