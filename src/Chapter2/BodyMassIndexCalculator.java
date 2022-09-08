package Chapter2;

import java.util.Scanner;   // uses scanner to obtain input

public class BodyMassIndexCalculator {  // class
    public static void main ( String[] args ) {   // method

        Scanner input = new Scanner (System.in);   // import scanner

        System.out.print ( "Weight in Kilogram : ");    // prompt
        double weight = input.nextDouble ( );     // obtain user input

        System.out.print ( "Height in Inches : ");   // prompt
        double height = input.nextDouble ( );   // obtain user input

        double bodyMassIndex = (weight * 703) / height * height;  // calculate BMI

        System.out.printf ( "Body Mass Index is : %.0f%n", bodyMassIndex );  // Displays  the BMI

    }   // end method
}   // end class
