package Chapter3.ComputerizationOfHealthReacod;
import java.util.Scanner;

public class HealthProfileApp {
    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print ("First name :");
        String firstName = input.nextLine ();

        System.out.print("Second name :");
        String secondName = input.nextLine ();

        System.out.print ( "Gender :");
        String gender = input.nextLine ();

        System.out.print("Year of birth :");
        int day = input.nextInt ( );


        System.out.print ("Month of birth :");
        int month = input.nextInt ();

        System.out.print( "Day of birth :");
        int year = input.nextInt ( );

        System.out.print( "Height :" );
        double height = input.nextDouble ();

        System.out.print ( "Weight :");
        double weight = input.nextDouble();


        HealthProfile HP = new HealthProfile ( firstName, secondName, height, weight, day, month, year, gender);

        System.out.printf ( "Name  : %s %s%n", HP.getFirstName(), HP.getLastName ()); // print name
        System.out.printf ("Date of birth :%s  Age :%d years %nGender %s%n",HP.getBirthDate (), HP.getAge (),
                HP.getGender());  // print Date of birth
        System.out.printf ( "Weight %.0f Height %.0f%n",HP.getWeight (),HP.getHeight() );
        System.out.printf ("Maximum Heart Rate : %d%n",HP.getMaximumHeartRate () );  // print Maximum heart rate
        System.out.printf ( "Target heart rate : %d%n", HP.getTargetHeartRate () );   // print target heart rate
        System.out.printf ( "Body Mass Index %.0f",HP.getBodyMassIndex());
    }
}
