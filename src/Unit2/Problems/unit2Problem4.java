package Unit2.Problems;
public class unit2Problem4 {
    public static void main(String[] args) {
        String str1 = new String("This is a practice problem for IndexOf");
        String str2 = new String("practice");
        String str3 = new String("problem");
        String str4 = new String("problems");

        System.out.println("Index of p in str1: " +str1.indexOf('p'));
        System.out.println("Index of p in str1 after 30th char: " + str1.indexOf('p', 30));
        System.out.println("Index of string str2 in str1: " + str1.indexOf(str2));
        System.out.println("Index of str2 after the 15th char: " + str1.indexOf(str2, 15));
        System.out.println("Index of string str3 in str1: " + str1.indexOf(str3));
        System.out.println("Index of string str4 in str1: " + str1.indexOf(str4));
        System.out.println("Index of hardcoded string: " + str1.indexOf("is"));
        System.out.println("Index of hardcoded string after 4th char: " + str1.indexOf("is", 4));

        System.out.print("Found Last Index of p at: ");
        System.out.println(str1.lastIndexOf('p'));

        System.out.print("Found last Index of e at: ");
        System.out.println(str1.lastIndexOf('e'));

        char ch1 = str1.charAt(0);
        System.out.println("Character at 0 index is: " +ch1);
        char ch2 = str1.charAt(4);
        System.out.println("Character at 4 index is: " +ch2);
        char ch3 = str2.charAt(10);
        System.out.println("Character at 10 index is: " + ch3); //Exception thrown: String index out of range: 10
    }
}
