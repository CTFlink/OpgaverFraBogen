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
        double y = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
        System.out.println(y);

        //Opgave 1.5
        short Een = 0;
        short Sum = Een;
        while (Een <10) {
            Een = ++Een;
            System.out.println(Een);
        }

        //Opgave 1.6

    }
}
