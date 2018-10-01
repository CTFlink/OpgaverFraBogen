package Chapters;

import static java.lang.Math.*;
import java.util.Scanner;

public class Kapitel2 {
    public static void main(String[] args) {
        System.out.println("gsfh");
/*
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
        Scanner temp = new Scanner(System.in);
        System.out.println("For at køre Tempereatur converteren tryk 'y' ellers tryk 'n'");

        String tempStart = temp.next();

        if (tempStart.toLowerCase() == "y") {
            TemperaturConverter tempe = new TemperaturConverter();
            tempe.method();
    }
}

//==========================
//Opgave 2.1

        Scanner inputCelsius = new Scanner(System.in);
        System.out.println("indtast en grad i celsius");
        double celsius = inputCelsius.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " i celsius svarer til : " + fahrenheit + " grader fahrenheit.");


//Opgave 2.2

        Scanner inputRadius = new Scanner(System.in);
        System.out.println("indtast cylindrens radius");
        double radius = inputRadius.nextDouble();

        Scanner inputLength = new Scanner(System.in);
        System.out.println("indtast cylindrens længde");
        double length = inputLength.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("For en cylinder med " + radius + " i radius og " + length + " i længde, gør flg. sig gældende: ");
        System.out.println("Arealet = " + area);
        System.out.println("Volumen = " + volume);


//Opgave 2.3

        Scanner inputFeet = new Scanner(System.in);
        System.out.println("indtast et antal fod.");
        double feet = inputFeet.nextDouble();
        double meter = feet * 0.305;

        System.out.println(feet + " fod svarer til : " + meter + " meter");


//Opgave 2.4

        Scanner inputPound = new Scanner(System.in);
        System.out.println("indtast et antal pound");

        double pound = inputFeet.nextDouble();
        double kilogram = pound * 0.454;

        System.out.println(pound + " pound svarer til : " + kilogram + " kilogram");


//Opgave 2.5

   Scanner inputTip = new Scanner(System.in);
     System.out.print("Indtast en subtotal og en procentiel mængde tip adskilt med mellemrum. F.eks. '100 15' :");
     String[] subtotal_gratuity = inputTip.nextLine().split(" ");

     double subtotal = Double.parseDouble(subtotal_gratuity[0]);
     double gratuity = Double.parseDouble(subtotal_gratuity[1]) / 100 * subtotal;
     double totalFinancial = subtotal + gratuity;

     System.out.printf("Andelen af tips er $%.1f og det totale tal er $%.1f ", gratuity, totalFinancial);


//Opgave 2.6

     Scanner inputTreCifret = new Scanner(System.in);
     System.out.println("indtast et helt tal mellem 0 og 1000");
     int treCifret = inputTreCifret.nextInt();

     if (treCifret >= 1000) {
      System.out.println("Fejl. Dit indtastede tal er over 999!");
     }
     else {
      int first = (treCifret / 100) % 10;
      int second = (treCifret / 10) %10;
      int third = treCifret % 10;
      int sum = first+second+third;

      System.out.println("summen af tallene, " + first + second + third + " = " + sum);
     }
*/
//Opgave 2.7

     Scanner inputMinutes = new Scanner(System.in);
     System.out.println("indtast et hvilket som helst antal minutter for at konvertere det til år og dage: ");
     int minutes = inputMinutes.nextInt();

     int aar = minutes /60 /24 /365; //int runder altid ned
     int dage = minutes /60 /24 %365;
        System.out.println(minutes + " minutter svarer til ca = " + aar + "år og " + dage + " dage.");


//Opgave 2.8

        Scanner inputTimeZone = new Scanner(System.in);
        System.out.println("indtast hvor mange timer du er fra Greenwich mean time GMT: ");
        int timeZone = inputTimeZone.nextInt();

        int tid = System.currentTimeMillis()ShowCurrentTime.java;

}
}


