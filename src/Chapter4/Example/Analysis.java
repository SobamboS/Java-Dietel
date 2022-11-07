package Chapter4.Example;

//Using Nested Control Statement

import java.util.Scanner;

public class Analysis {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        int passes = 0;
        int failure = 0;
        int studentCounter = 1;

        while (studentCounter <= 2) {
            System.out.print ( "Enter the result (1 = pass, 2 = failure) :" );
            int result = input.nextInt ();

            if (result == 1) {
                passes++;
            }
            else {
                failure ++;
            }
           studentCounter++ ;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failure);
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}