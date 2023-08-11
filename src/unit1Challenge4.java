public class unit1Challenge4 {
    public static void main(String[] args) {
        double equation = 9.0/3.0+2.0*9.0%4.0-18.0/(6.0-10.0)/4.0*7.0+(13.0%5.0);
        double test = (9.0 / 3.0) + ((2.0 * 9.0) % 4.0) - (((18.0 / (6.0 - 10.0)) / 4.0) * 7.0) + (13.0 % 5.0);
        System.out.println(equation);

        if (equation == test) {
            System.out.println("Since the above if statement is flagged as always true, the two equations are the same, and provide the same output.");
        }
    }
}
