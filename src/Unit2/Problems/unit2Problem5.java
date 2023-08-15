package Unit2.Problems;
public class unit2Problem5 {
    public static void main(String[] args) {
        String s1 = new String("Working with substring method");

        System.out.println("Substring starting from index 0:");
        System.out.println(s1.substring(0));
        System.out.println("Substring starting from index 10:");
        System.out.println(s1.substring(10));
        System.out.println("Substring starting from index 5 and ending at 15:");
        System.out.println(s1.substring(5, 15));
        System.out.println("Substring starting from index 30:");
        // System.out.println(s1.substring(30)); //Exception thrown: String index out of range: -1
        System.out.println("Exception thrown @ 12: String index out of range: -1");

        String s2 = "In JAVA you can also just use a STRING LITERAL";

        String s2lower = s2.toLowerCase();
        System.out.println(s2lower);

        String s2upper = s2.toUpperCase();
        System.out.println(s2upper);
    }
}
