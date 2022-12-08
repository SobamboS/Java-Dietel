package Chapter4.Making_A_Difference;

import java.util.Scanner;

public class Decrypting{
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);

            System.out.println("Enter your  digit pin :");
            int firstNumber= input.nextInt();
            int secondNumber=input.nextInt();
            int thirdNumber=input.nextInt();
            int fourthNumber=input.nextInt();



            int pin1 = (10 % 7) + firstNumber ;
            int pin2 = (10 % 7) +secondNumber ;
            int pin3 = (10 % 7) + thirdNumber ;
            int pin4 = (10 % 7) + fourthNumber;

             pin3 = pin1;
             pin4 = pin2;
             pin2 = pin4;
             pin1 = pin3;

            System.out.printf("Encrypted pin is : %d%d%d%d", pin1, pin2, pin3, pin4);
        }
    }


