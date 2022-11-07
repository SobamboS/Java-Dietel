package Chapter4.Example;
// Counter Controlled iteration

import java.util.Scanner;

public class ClassAverage {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        int total = 0;
        int counter = 0;

       while(counter <= 3){
           System.out.print ("Enter grade :" );
           int grade = input.nextInt ();
           total += grade;
           counter++;
       }
       int average = total /counter;
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
        System.out.printf("counter is %d%n", counter);



    }
}
