package Chapter4.Example;

import java.util.Scanner;

public class If_Statement {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        System.out.print("Please student grade :");
        int grade = input.nextInt ();
        
        if ( grade >= 60) {
    System.out.println("Passed");
}
else {
        System.out.println("Failed");
}
            }}