package Unit2;
public class unit2Challenge1 {
    public static void main(String[] args) {
        final String BASE = "computational";
        final String BASE2 = "Hypothetical";
        System.out.println(locate("tip", BASE));
        System.out.println(locate("it", BASE));
        System.out.println(locate("opinion", BASE));
        System.out.println(locate("atomic", BASE));
        System.out.println(locate("Banana", BASE));

        System.out.println("\n"+locate("ache", BASE2));
        System.out.println(locate("Test", BASE2));
    }

    private static String locate (String word, String base) {
        word = word.toLowerCase();
        base = base.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = 0;
            try {ch = base.charAt(base.lastIndexOf(word.substring(i, i + 1)));
            } catch (Exception e) {System.out.println("Error Finding Character: " + (word.charAt(i)));}
            sb.appendCodePoint(ch);
            output = sb.toString();
        }
        return output;
    }
}
