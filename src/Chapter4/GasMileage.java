package Chapter4;

//  (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//        from the user.


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


