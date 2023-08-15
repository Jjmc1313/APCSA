package Unit2.Problems;
public class unit2Problem2 {
    public static void main(String[] args) {
        String S1 = "I am learning how to work with the String class.";
        String S2 = "It is fun coding in JAVA";

        int length = S1.length();
        System.out.println("Length of a String is: " + length);
        System.out.println("Length of a String is: " + S2.length());

        String S3 = "Class names in Java,";
        S3 = S3.concat(" like String,");
        S3 = S3.concat("begin with a capital letter");
        System.out.println(S3);

        String S4 = "String class";
        S4 = S4.concat(" that hold sequences").concat(" of characters").concat(" (a, b. c. $. etc).");
        System.out.println(S4);

        String replaceString = S4.replace('a', 'e');
        System.out.println(replaceString);

        System.out.println(S1);
        System.out.println(S1.trim());
    }
}
