import java.util.ArrayList;

public class ArrayListProblem2 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars.size());

    System.out.println(cars.get(0));
    System.out.println(cars.get(3));

    cars.set(0, "Chevy");
    cars.set(2, "Mercedes");
    System.out.println(cars);

    cars.remove(0);
    cars.remove("Mazda");
    System.out.println(cars);
  }
}
