import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabelleImplTest {
	TabelleImpl sequence;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		String [][] ad = {{ "A" , "C" }, { "C", "D" }, { "B", "C" },{"F","C"}};
		
		sequence = new TabelleImpl();
		//char[][] output = sequence.Sorted(ad);
		char[] a = {'F','B','A','C','D'} ;
		char[] b = {'F','A','B','C','D'} ;
		char[] c = {'A','B','F','C','D'} ;
		char[] d = {'A','F','B','C','D'} ;
		char[] e = {'B','A','F','C','D'} ;
		char[] f = {'B','F','A','C','D'} ;
		char[] g = {'B','F','A','D','C'} ;

		char[][] output = {{'F','B','A','C','D'}, {'F','A','B','C','D'},{'A','B','F','C','D'},{'A','F','B','C','D'},{'B','A','F','C','D'}, {'B','F','A','C','D'}};
		char[][] output1 = {a,b,c,d,e,f};
		for (char[] hs : output1) {
			
		boolean arrayContainsLine = Arrays.stream(output)
		.anyMatch(line -> Arrays.equals(line, hs));
		assertTrue(arrayContainsLine);
		//assertTrue(Arrays.asList(output).contains(a));
		}
		
	}
	

	@Test
	void test2() {
		sequence = new TabelleImpl();
		String [] s= {"A" , "B", "C", "D"};
		assertTrue(sequence.isWellStored(s));
	}
	

}
