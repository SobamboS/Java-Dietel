package Chapter4.Making_A_Difference;

import java.util.Scanner;

public class Enforcing_Cryptography{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

int firstNumber =0;
int secondNumber=0;
int thirdNumber=0;
int fourthNumber=0;



        while (integer<5) {
            System.out.println("Enter 4 numbers :");
             firstNumber=input.nextInt();
             secondNumber=input.nextInt();
             thirdNumber=input.nextInt();
             fourthNumber=input.nextInt();

        }
            firstNumber+=7;
            secondNumber +=7;
            thirdNumber+=7;
            fourthNumber+=7;

        System.out.printf("%d  %d  %d %d",firstNumber, secondNumber, thirdNumber, fourthNumber);
    }
}
