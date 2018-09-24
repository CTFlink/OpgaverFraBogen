package Chapters;
import java.util.Scanner;

public class TemperaturConverter {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast en temperatur i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grader fahrenheit, svarer til = " + celsius + " grader Celsius");
    }
}
