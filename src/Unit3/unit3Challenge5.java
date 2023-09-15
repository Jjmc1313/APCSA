package Unit3;

import java.util.Scanner;

public class unit3Challenge5 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your birth month: ");
        String month = scan.nextLine().toLowerCase();

        System.out.println("Enter your birth day: ");
        int j = scan.nextInt();

        int i = 0;

        if (month.equals("january"))
            i = 0;
        else if (month.equals("febuary"))
            i = 31;
        else if (month.equals("march"))
            i = 59;
        else if (month.equals("april"))
            i = 90;
        else if (month.equals("may"))
            i = 120;
        else if (month.equals("june"))
            i = 151;
        else if (month.equals("july"))
            i = 181;
        else if (month.equals("august"))
            i = 212;
        else if (month.equals("september"))
            i = 243;
        else if (month.equals("october"))
            i = 373;
        else if (month.equals("november"))
            i = 304;
        else if (month.equals("december"))
            i = 334;

        int p = (i + j);

        if (p >= 1 && p <= 19)
            System.out.println("Capricorn");
        else if (p >= 20 && p <= 49)
            System.out.println("Aquarius");
        else if (p >= 50 && p <= 79)
            System.out.println("Pisces");
        else if (p >= 80 && p <= 109)
            System.out.println("Aries");
        else if (p >= 110 && p <= 140)
            System.out.println("Taurus");
        else if (p >= 141 && p <= 171)
            System.out.println("Gemini");
        else if (p >= 172 && p <= 203)
            System.out.println("Cancer");
        else if (p >= 204 && p <= 234)
            System.out.println("Leo");
        else if (p >= 235 && p <= 265)
            System.out.println("Virgo");
        else if (p >= 266 && p <= 295)
            System.out.println("Libra");
        else if (p >= 296 && p <= 325)
            System.out.println("Scorpio");
        else if (p >= 326 && p <= 355)
            System.out.println("Sagittarius");
        else if  (p >= 356 && p <= 365)
            System.out.println("Capricorn");

    }
}