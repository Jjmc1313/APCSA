package Unit2.Problems;
public class unit2Problem1 {
    public static void main(String[] args) {
        String str1 = new String ("String Class");
        String str2 = new String("String class");
        String str3 = "String Class";

        System.out.println("str1 equals to str2:" + str1.equals(str2));
        System.out.println("str1 = to str2:" + (str1 == str2));
        System.out.println("str1 = to str3:" + (str1 == str3));
        System.out.println("str1 equals to Welcome:" +str1.equals("Welcome"));
        System.out.println("str1 equals to Hello:" +str1.equals("String Class"));
        System.out.println("str1 equals to Hello:" +str1.equals("string class"));

        System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str3));
        System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
        System.out.println("str1 equals to String Class:"+str1.equalsIgnoreCase("String Class"));
        System.out.println("str1 equals to string class"+str1.equalsIgnoreCase("string class"));
        System.out.println("str2 equals to Hello World:"+str2.equalsIgnoreCase("Hello World"));
    }
}
