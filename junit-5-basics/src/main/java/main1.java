/**
 * main
 */
public class main1 {

    public static void main(String[] args) {
        TabelleImpl test = new TabelleImpl();
        String [][] c = {{ "A" , "C" }, { "C", "D" }, { "B", "C" },{"F","C"}};
        char[] output = test.isWellStored(c);
        System.out.println(output);
    }
}