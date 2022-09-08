package Chapter2;

import java.util.Scanner;   // program uses class scanner

public class Arithmethic {  // class
    public static void main (String[] args) {  // main method

        Scanner input = new Scanner(System.in);   // create a scanner to obtain input from the user

        System.out.print("Enter two numbers : ");   // prompt user to input first number
        int number1 = input.nextInt();  // read first number
        int number2 = input.nextInt();  // read second number


        int square1 = number1 * number1;   // calculate square of the first number
        int square2 = number2 * number2;   // calculate square of the second number

        System.out.printf("Square of first number is : %d%n", square1);  // print square of the first number
        System.out.printf("Square of second number is : %d%n", square2);   // print square of the second number

        int sum = square1 + square2;   // calculate the sum of the square of number 1 and number 2
        System.out.printf("Sum of their square is : %d%n", sum); // print the sum

        int difference = square1 - square2;   // calculate the difference of the square of number 1 and number 2
        System.out.printf("Difference of their square is : %d%n", difference);   // print the difference
    }
}
