package Chapter5.Example;

import java.util.Scanner;

public class MaximumFinder {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print("Enter 3 numbers :" );
        double number1 = input.nextDouble ();
        double number2 = input.nextDouble ();
        double number3 = input.nextDouble ();

        double result = Maximum(number1, number2, number3);
    }
}
