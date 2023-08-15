package Unit2.Problems;
public class unit2Problem3 {
    public static void main(String[] args) {
        String str1 = "El Dorado High School";
        String str2 = "Home of the Cougars";
        String str3 = "coding is fun!";

        int var1 = str1.compareTo(str2);
        System.out.println("str1 & str2 comparison: " + var1);

        int var2 = str2.compareTo(str1);
        System.out.println("str2 & str1 comparison: " + var2);

        int var3 = str1.compareTo(str3);
        System.out.println("str2 & str1 comparison: " + var3);

        int var4 = str2.compareTo(str3);
        System.out.println("str2 & str3 comparison: " + var4);

        int var5 = str1.compareTo("Placerville, CA");
        System.out.println("str1 & string argument comparison: " + var5);

        int var6 = str3.compareTo("561 Canal Street");
        System.out.println("str3 & string argument comparison: " + var6);
    }
}
