
package Chapter3.Target_Heart_Rate_Calculator;

import java.util.Scanner;
public class HeartRateApp {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Enter your first name :" );
        String firstName = input.nextLine ( );

        System.out.print ( "Enter your last name :" );
        String lastName = input.nextLine ();

        System.out.print ( "Enter day of birth : " );
        int year = input.nextInt ();

        System.out.print ("Enter month of birth :"  );
        int month = input.nextInt ( );

        System.out.print("Enter year of birth : " );
        int day = input.nextInt ( );

        HeartRates HR = new HeartRates ( firstName, lastName, year, month, day);


        System.out.printf ( "Name  : %s %s%n", HR.getFirstName(), HR.getLastName ()); // print name
        System.out.printf ("Date of birth :%s,Age :%d%n",HR.getBirthdate (),  HR.getAge ()  );  // print Date of birth
        System.out.printf ("Maximum Heart Rate : %d%n",HR.getMaximumHeartRate () );  // print Maximum heart rate
        System.out.printf ( "Target heart rate : %d", HR.getTargetHeartRate () );   // print target heart rate
    }
}
