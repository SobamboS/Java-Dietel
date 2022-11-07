package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main ( String[] args ) {
        double milesPerGallon = 0;
        int miles = 0;
        int gallon = 0;

        Scanner input = new Scanner ( System.in );

        while (miles != -1) {
            milesPerGallon = (double) miles / gallon;


            System.out.print ( "Enter miles driven or -1 to quit :" );
            miles = input.nextInt ( );

            System.out.print ( "Enter gallon used or -1 to quit :" );
            gallon = input.nextInt ( );

        }
        System.out.printf ("miles per gallon %.1f",milesPerGallon);}

    }


