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
        System.out.println(" = " + sum);

        //Opgave 1.7

        double pii = 4;
        double naevner = -1;
        while (naevner < 21) {
            naevner = naevner + 2;
            pii=pii * (-1/naevner);
            naevner = naevner + 2;
            pii=pii * (1/naevner);
        }
        System.out.println(pii);



    }
}
