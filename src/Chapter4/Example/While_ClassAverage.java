package Chapter4.Example;

import java.util.Scanner;

public class While_ClassAverage {
    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        int total = 0;
       int gradeCounter = 1;

       while (gradeCounter <= 3){
           System.out.print("Enter Grade :" );
           int grade = input.nextInt();

           total = total + grade;
           gradeCounter = gradeCounter + 1;
       }
    int average = total / 10;
        System.out.printf("%nTotal of all grades is %d%n", total);
            System.out.printf("Average is :%d", average);
    }
}
