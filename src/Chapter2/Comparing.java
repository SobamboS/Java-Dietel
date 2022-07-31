package Chapter2;

import java.util.Scanner;  // uses class scanner

public class Comparing {   // class
    public static void main(String[] args){  // main method

        Scanner input = new Scanner(System.in);   // create a scanner to obtain input from the user

        System.out.print("Enter Number : ");    // prompt user to input number
        int number = input.nextInt();     // read number

        int square = number * number;      // calculate the square of the number
        System.out.printf("Square of number is : %d%n", square);   // print the square the number

            if (square > 100) {
            System.out.printf("%n%d > 100", square);
            }

            if(square == 100) {
                System.out.printf("%n%d = 100 ",square);
            }

            if(square != 100) {
                System.out.printf("%n%d != 100", square);
            }

             if(square < 100){
                 System.out.printf("%n%d < 100", square);
             }
        }
    }
