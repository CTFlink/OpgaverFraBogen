package Chapters;

import static java.lang.Math.*;
import java.util.Scanner;

public class Kapitel2 {
    public static void main(String[] args) {
        System.out.println("gsfh");

//Section 2.2

       Scanner indtastet_tal = new Scanner(System.in);
        System.out.println("indtast et tal");
        double number1 = indtastet_tal.nextDouble();

        System.out.println("Dit tal er : " + number1);

//Section 2.3
        //Nej der er ingen forskel

//Section 2.7 fordelene ved at bruge constants er at man sikrer sig de ikke senere i koden kan blive re-assignet.
        //Derudover kommunikeres intentionen om at konstanten ikke skal ændres til evt. andre programmører.

//Section 2.12
        int currentWeekDay=2;
        System.out.println("Hvis det i dag er " + currentWeekDay + ". dag i ugen, vil det om 100 dage være:");
        currentWeekDay += 100 % 7;
        System.out.println(currentWeekDay + ". dag i ugen.");

//Section 2.21
    //For sjov opgave med temperatur converter.
   /*     Scanner temp = new Scanner(System.in);
        System.out.println("For at køre Tempereatur converteren tryk 'y' ellers tryk 'n'");

        String tempStart = temp.next();

        if (tempStart.toLowerCase() == "y") {
            TemperaturConverter tempe = new TemperaturConverter();
            tempe.method();
    }
}*/
        Scanner inputCelsius = new Scanner(System.in);
        System.out.println("indtast en grad i celsius");
        double fahrenheit = inputCelsius.nextDouble();

        System.out.println(inputCelsius + " i celsius svarer til : " + fahrenheit + " grader fahrenheit.");


}
}

//Opgave 2.1
