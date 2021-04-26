
public class TabelleImpl implements Intertabelle {
	
	public TabelleImpl() {
	
	}

	@Override
	public char[] isWellStored (String[][] strTab ) {
		
		int i , j ;
		String s = "";
		
		for (i=0 ; i< strTab.length ;i++) {
			for (j=0 ; j< strTab[i].length ; j++) {
				s += strTab[i][j];
			} 
		}
		char c= ' ' ; 
		String v= s.substring(0,2);
		
			if( v.indexOf(s.charAt(2))!=0) {c=s.charAt(2);}
			else if ( v.indexOf(s.charAt(3))!=0){c=s.charAt(3);}
			for (i=2;i<s.length();i+=2) { 
				if (s.charAt(i) == c) { v=v+s.charAt(i+1);}
				else if  (s.charAt(i+1) == c) { v=s.charAt(i)+v;}
				
			}
			int a = v.length();
			char[] tab = new char[a];
			 
			for(int i1 = 0; i1 < a;i1++){
			     tab[i1] = v.charAt(i1);
			}
			
			
			
		
		return tab ;
		
	}
		
}
