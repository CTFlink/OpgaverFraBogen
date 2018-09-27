package Chapters;
import java.util.Scanner;

public class TemperaturConverter {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast en temperatur i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grader fahrenheit, svarer til = " + celsius + " grader Celsius");

        if (2==0) {

        }

        else {

        }
        char age = 'b';


        switch (age) {
            case 'b': System.out.println("hjej");
        }


         int randomKort = (int) (System.currentTimeMillis() % 14 +1);
         int color = (int) (System.currentTimeMillis() % 4 +1 );


         switch (randomKort) {
             case 1:
                 System.out.println("Es");
                 break;
             case 2:
                 System.out.println("To");
                 break;
             case 3:
                 System.out.println("Tre");
                 break;
             case 4:
                 System.out.println("Fire");
                 break;
             case 5:
                 System.out.println("Fem");
                 break;
             case 6:
                 System.out.println("Seks");
                 break;
             case 7:
                 System.out.println("Syv");
                 break;
             case 8:
                 System.out.println("Otte");
                 break;
             case 9:
                 System.out.println("Ni");
                 break;
             case 10:
                 System.out.println("Ti");
                 break;
             case 11:
                 System.out.println("Knægt");
                 break;
             case 12:
                 System.out.println("Dronning");
                 break;
             case 13:
                 System.out.println("Konge");
                 break;

             default:
                 System.out.println("Du har taget et tal uden for 1-13!!! FEJL I KODEN");
         }

         switch (color){

             case 1:
                 System.out.println("Hjerter");
                 break;
             case 2:
                 System.out.println("Klør");
                 break;
             case 3:
                 System.out.println("Ruder");
                 break;
             case 4:
                 System.out.println("Spar");
                 break;

             default:
                 System.out.println("Du har valgt en kulør mellem 1 og 4! Fejl i koden!");
         }

                 System.out.println(randomKort + color);
     }




}

