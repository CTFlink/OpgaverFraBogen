package Chapters;

import static java.lang.Math.*;

public class Kapitel1 {

    public static void main(String[] args) {

        //Opgave 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("I love programming");

        //Opgave 1.2
        String x="Welcome to Java ";
        System.out.println(x+x+x+x+x);

        //Opgave 1.3
        System.out.print("    J     A     V     V    A\n    J    A A     V   V    A A\nJ   J   AAAAA     V V    AAAAA\n J J   A     A     V    A     A \n\n");

        //Opgave 1.4
        double start = 1;
        double slut = 4;
        System.out.println("a \t\t a^2   \t a^3   \t a^4  ");

        for (double index = start; index <= slut; index++ )
        {
            System.out.println(index + " \t " + Math.pow(index, 2) + " \t " + Math.pow(index, 3) + " \t " + Math.pow(index, 4) + "\n");
        }

        //Opgave 1.5
        double y = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
        System.out.println(y);

        //Opgave 1.6
        int een = 0;
        int sum = 0;
        while (een <9) {
            een = ++een;
            if (een <= 8)
            System.out.print(een + "+");
            else
                System.out.print(een);
            sum =sum+een;

        }
        System.out.println(" = " + sum + '\n');

        //Opgave 1.7

        double pii = 4;
        int naevner = 1;
        int broek = 1;
        while (naevner <= 7) {
            naevner = naevner + 2;
            broek = broek - 1/naevner;
            naevner = naevner + 2;
            broek = broek + 1/naevner;
        }
        pii = 4 * broek;
        System.out.println("Pi med int er ca. = " + pii);

        double pii2 = 4;
        double naevner2 = 1;
        double broek2 = 1;
        while (naevner2 <= 7) {
            naevner2 = naevner2 + 2;
            broek2 = broek2 - 1/naevner2;
            naevner2 = naevner2 + 2;
            broek2 = broek2 + 1/naevner2;
        }
        pii2 = 4 * broek2;
        System.out.println("Pi med double er ca. = " + pii2 + '\n');

        //Opgave 1.8

        double perimeter = 2 * 5.5 * PI;
        double area = 5.5 * 5.5 * PI;
        System.out.println("Omkredsen i en cirkel med radius på 5,5 er = " + perimeter);
        System.out.println("Arealet i en cirkel med radius på 5,5 er = " + area + '\n');

        //Opgave 1.9

        double omkreds = 4.5 + 4.5 + 7.9 + 7.9;
        double areal = 4.5 * 7.9;
        System.out.println("Omkredsen af en rektangel med siderne 4.5 og 7.9 er = " + omkreds);
        System.out.println("Arealet af dette rektangel er = " + areal + '\n');

        //Opgave 1.10

        double kilometer = 14;
        double minutter = 45.5;
        double kmPerHour = kilometer/minutter*60;
        double milesPerHour = kmPerHour/1.6;

        System.out.println(kilometer + "km på " + minutter + " minutter svarer til = " + kmPerHour + "km i timen.");
        System.out.println("...hvilket svarer til: " + milesPerHour + " mil i timen." + '\n');

        //Opgave 1.11




    }
}
