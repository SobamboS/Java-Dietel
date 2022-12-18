package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_Assisted_Instruction{
       static Scanner input = new Scanner(System.in);
        static SecureRandom random=new SecureRandom();

//    public static int generateSecureRandom(){
//        return random.nextInt(1, 5);
//    }

    public  static  int multiply(int number1, int number2 ){
        return number1 * number2;
    }

    public static boolean checkAnswer(int answer, int actualAnswer) {
        if (answer == actualAnswer) {
            System.out.println("Very Good! Correct");
            return true;

        } else {
            System.out.println("No. Please try again.");
            return false;
        }
    }

    public static int question(int number1, int number2){
        System.out.printf("What is %d times %d", number1, number2);
        return multiply(number1, number2);
    }

    public static void main(String[] args){

 boolean isCorrect;

 do {
     int num1 = random.nextInt(1,5);
     int num2 = random.nextInt(1,5);
     int actualAnswer = question(num1 , num2);

     System.out.println(" Your answer:  ");
     int answer = input.nextInt();

     isCorrect = checkAnswer(num1,num2);


     while (!isCorrect) {
         question(num1, num2);

         System.out.println(" Your answer:  ");
         answer = input.nextInt();

         isCorrect = checkAnswer(answer, actualAnswer);
         break;

 }

    }while (true);

 }

}