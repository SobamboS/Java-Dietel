package Chapter2;

import java.util.Scanner;  // uses scanner to take input from user

public class DiameterCircumferenceAreaOfCircle { // class
    public static void main ( String[] args ) {   // method
        Scanner input = new Scanner ( System.in );   // import scanner

        System.out.print ("Radius : ");  // prompt user to input Radius
        float R = input.nextFloat ();   // read Radius

        float diameter = 2 * R;     // calculate diameter
        System.out.printf ("Diameter : %.0f%n", diameter );   // Prints diameter


        double P = Math.PI;   // import Math.pi to assign to P
        double circumference = 2 * P * R;   // calculate circumference
        System.out.printf ( "Circumference : %.0f%n", circumference );   // Print circumference

        double area = P * Math.pow (R, 2);   // calculate area, Math.pow is imported to calculate power
        System.out.printf ( "Area : %.0f%n", area); // print area
    }   // end method
}    // end class
