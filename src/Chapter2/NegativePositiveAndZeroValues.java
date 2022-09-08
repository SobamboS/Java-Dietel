package Chapter2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Enter first number : " );
        int number1 = input.nextInt ( );

        System.out.print ( "Enter second number : " );
        int number2 = input.nextInt ( );

        System.out.print ( "Enter third number : " );
        int number3 = input.nextInt ( );

        System.out.print ( "Enter fourth number : " );
        int number4 = input.nextInt ( );

        System.out.print ( "Enter fifth number : " );
        int number5 = input.nextInt ( );


        // to check if negative
        if ( number1 < 0 ) {
            System.out.printf ( "%d is a negative number %n", number1 );
        } else {System.out.printf ( "%d is a positive number %n", number1 );}

        if (number2 < 0 ) {
            System.out.printf ( "%d is a negative number %n", number2 );
            }
        else{System.out.printf ( "%d is a positive number %n", number2 );}


        if ( number3 < 0 ) {System.out.printf ( "%d is a negative number %n", number3 );
                 }
        else{System.out.printf ( "%d is a positive number %n", number3);}


        if( number4 < 0 ) {System.out.printf ( "%d is a negative number %n", number4 );}
          else{System.out.printf ( "%d is a positive number %n", number4);}


        if (number5 < 0) {System.out.printf ( "%d is a negative number %n", number5);}
        else{System.out.printf ( "%d is a positive number %n", number5);}

        }
    }
