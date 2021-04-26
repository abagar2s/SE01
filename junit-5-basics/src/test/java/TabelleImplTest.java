import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

<<<<<<< Updated upstream
=======
import java.lang.reflect.Array;
import java.util.Arrays;

>>>>>>> Stashed changes
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
		
<<<<<<< Updated upstream
	    char[] output = test4.isWellStored(c4);
		char[] a = {'F','B','A','C','D'} ;
		assertArrayEquals(a,output);
=======
		sequence = new TabelleImpl();
		//String[] output = sequence.Sorted(ad);
		String a = "FBACD" ;
		String b = "FABCD" ;
		String c = "ABFCD" ;
		String d = "AFBCD" ;
		String e = "BAFCD" ;
		String f = "BFACD" ;
		String g = "BFADC" ;

		//char[][] output = {{'F','B','A','C','D'}, {'F','A','B','C','D'},{'A','B','F','C','D'},{'A','F','B','C','D'},{'B','A','F','C','D'}, {'B','F','A','C','D'}};
		String[] output1 = {a,b,c,d,e,f};
		for (String hs : output1) {
		//okkkkkkkkkkkkkkkkkkkkh	
		//boolean contains = Arrays.contains(output1, a);
		
		assertTrue(Arrays.asList(output1).contains(hs));
		}
		
>>>>>>> Stashed changes
	}
	@Test
	void test1() {
		
		char[] output = test1.isWellStored(c1);
		char[] a = {'Y','B','Z','X','H'} ;
		assertArrayEquals(a,output);
	}
	

}
