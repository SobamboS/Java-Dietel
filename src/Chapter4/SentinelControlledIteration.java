package Chapter4;

import java.util.Scanner;

public class SentinelControlledIteration {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        int total = 0;
        int counter = 0;

        System.out.print ( "Enter the first grade or - 1 to quit:" );
        int grade = input.nextInt ( );

        while (grade != -1) {
            total = total + grade;
            counter = counter +1;

            System.out.print ( "Enter second grade or - 1 to quit :" );
             grade = input.nextInt ( );
        }
        if ( counter != 0 ){
            double average = (double) total / counter;
            System.out.printf ( "%.0f",average );
            System.out.printf("%nTotal of the %d grades entered is %d%n", counter, total);
        }
        else {
            System.out.print( "No grades was entered" );
        }

    }
}