package Unit3.Problems;

public class unit3Problem5 {
    public static void main(String[] args) {
        int num1, num2, num3, min, max = 0;

        num1 = (int) ((Math.random() * 100) + 1);
        num2 = (int) ((Math.random() * 100) + 1);
        num3 = (int) ((Math.random() * 100) + 1);

        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else
            if (num2 < num3)
                min = num2;
            else min = num3;

        if (num1 > num2)
            if (num1 > num3)
                max = num1;
            else
                max = num3;
        else
            if (num2 > num3)
                max  = num2;
            else
                max = num3;

        System.out.println(num1 + " " +  num2 + " " + num3);
        System.out.println("Minimum Value: " + min);
        System.out.println("Minimum Value: " + max);
    }
}
