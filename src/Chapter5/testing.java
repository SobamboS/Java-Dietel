package Chapter5;

import java.util.Scanner;

public class testing{
    public static void main(String[]args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter ten floating points: \n");
        double tmp = scan.nextDouble(); //read first number from user

        double max = tmp; //intialize with the first input
        double min = tmp;

        for(int i=0; i <5; i++) { //from 0 to 8, 9 numbers since the first has already been read
            double a = scan.nextDouble(); //at every loop read a number from the input
            if(a < min) {
                min=a;
            }
            //removed else since max and min are independant
            if (a > max) {
                max=a;
            }
        }
        System.out.println("Minimum value: " +min);
        System.out.println("Maximum value: " +max);
    }
}
