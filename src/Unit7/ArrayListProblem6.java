import java.util.*;

public class ArrayListProblem6 {
  public static void main(String[] args) {
    ArrayList<String> listofschools = new ArrayList<String>();
    listofschools.add("Oak Ridge");
    listofschools.add("Union Mine");
    listofschools.add("Ponderossa");
    listofschools.add("El Dorado");

    System.out.println("Before Sorting");
    for (String counter : listofschools) {
      System.out.println(counter);
    }

    Collections.sort(listofschools);
    System.out.println("After Sorting");
    for (String counter : listofschools) {
      System.out.println(counter);
    }
  }
}
