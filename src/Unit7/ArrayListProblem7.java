import java.util.*;
public class ArrayListProblem7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("James");
        al.add("Bella");
        al.add("Susan");
        al.add("Thomas");
        System.out.println("ArrayList1 ebfore addAll:"+al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Jerry");
        al2.add("Steve");
        al2.add("Terry");
        al2.add("Ella");
        
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:"+al);
    }
}
