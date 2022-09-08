package Chapter4.Example;

import java.util.Scanner;

public class Nested_If_Statement {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ("Enter the student grade :");
        int grade = input.nextInt ( );

        if (grade >= 90){System.out.println ("A" );}

        else if ( grade >= 80 ) {System.out.println ("B" );}

        if ( grade >= 70 ){System.out.println ("C" );}

        else if (grade >= 60 ) {System.out.println ("D" );}

        else {System.out.println ("F" );}
    }
}
