package Chapters;

import static java.lang.Math.*;
import java.util.Scanner;

public class Kapitel2 {
    public static void main(String[] args) {
        System.out.println("gsfh");

        //Opgave 2.2

        Scanner indtastet_tal = new Scanner(System.in);
        System.out.println("indtast et tal");
        double number1 = indtastet_tal.nextDouble();

        System.out.println("Dit tal er : " + number1);


//opgave 2.3
        //Nej der er ingen forskel

//Opgave 2.7 fordelene ved at bruge constants er at man sikrer sig de ikke senere i koden kan blive re-assignet.
        //Derudover kommunikeres intentionen om at konstanten ikke skal ændres til evt. andre programmører.

// Opgave 2.12
        int currentWeekDay=2;
        System.out.println("Hvis det i dag er " + currentWeekDay + ". dag i ugen, vil det om 100 dage være:");
        currentWeekDay += 100 % 7;
        System.out.println(currentWeekDay + ". dag i ugen.");

//Opgave 2.21
    //For sjov opgave med temperatur converter.
        Scanner temp = new Scanner(System.in);
        System.out.println("For at køre Tempereatur converteren tryk 'y' ellers tryk 'n'");

        boolean tempStart = temp.nextBoolean();

        if (tempStart = true) {
        TemperaturConverter() ;

    }
}


