package Chapter4.Making_A_Difference;



import java.util.Scanner;

public class Enforcing_Cryptography{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your 4 digit pin :");
        int firstNumber= input.nextInt();
        int secondNumber=input.nextInt();
        int thirdNumber=input.nextInt();
        int fourthNumber=input.nextInt();


       int pin1 = (firstNumber + 7) % 10;
        int pin2 = (secondNumber +7) % 10;
        int pin3 =(thirdNumber+7) % 10;
       int pin4= (fourthNumber+7 )%10;

       pin1 = pin3;
       pin2 = pin4;
       pin3= pin1;
       pin4 = pin2;

        System.out.printf("Encrypted pin is : %d%d%d%d", pin1, pin2, pin3, pin4);
    }
}
