package Chapter2;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer : ");
        int number2 = input.nextInt();

        System.out.print("Enter the third integer : ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("Sum is : %d%n", sum);

        int average = (number1 + number2 + number3) / 3;
        System.out.printf("Average is : %d%n", average);

        int product = number1 * number2 * number3;
        System.out.printf("Product is : %d%n", product);

        if((number1 > number2) & (number1 > number3))
            System.out.printf("The largest number is : %d%n", number1);


        if ((number2 > number1) & (number2 > number3))
            System.out.printf("The largest number is : %d%n", number2);


        if((number3 > number1) & (number3 > number2))
            System.out.printf("The largest number is : %d%n", number3);


        if((number1 < number2) & (number1 < number3))
            System.out.printf("The smallest number is : %d%n", number1);


        if((number2 < number1) & (number2 < number3))
            System.out.printf("The smallest number is : %d%n", number2);


        if((number3 < number2) & (number3 < number1))
            System.out.printf("The smallest number is : %d%n", number3);

    }
}
