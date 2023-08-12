public class unit1Challenge2 {
  public static void main(String[] args) {

    double numberOne = 5;
    double numberTwo = 5;
    // numberOne = scan.nextInt();
    // numberTwo = scan.nextInt();

    System.out.println("\nAdd: " + (numberOne + numberTwo));
    System.out.println("Sub: " + (numberOne - numberTwo));
    System.out.println("Mult: " + (numberOne * numberTwo));
    System.out.println("Div: " + numberOne / numberTwo);
    System.out.println("Mod: " + numberOne % numberTwo);

    if (numberOne == numberTwo) {
      System.out.println("\nThe numbers are equal.\n");
    } else {
      System.out.println("\nThe numbers are not equal.\n");
    }

    numberOne++;
    numberTwo--;
    System.out.println("Add1: " + numberOne);
    System.out.println("Sub1: " + numberTwo--);

    numberOne *= 7;
    numberTwo /= 5;
    System.out.println("Mult7: " + numberOne);
    System.out.println("Div5: " + numberTwo);
  }
}
