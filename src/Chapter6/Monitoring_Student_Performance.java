package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Monitoring_Student_Performance{
    static Scanner input=new Scanner(System.in);
    static SecureRandom random=new SecureRandom();
    static int correctCounter=0;
    static int wrongCounter=0;


    public static void calculatePercentage( ){
        int percentage = correctCounter * 10 /100;

        if (percentage < 75){
            System.out.printf("%d Please ask your teacher for help :", percentage);
        }else {
            System.out.printf("%d Congratulations, you are ready to go to the next level!", percentage);
        }

    }

    public static boolean checkAnswer(int answer,int actualAnswer){
        if(answer==actualAnswer){
            int correctResponse=1 + random.nextInt(4);
            switch (correctResponse) {
                case 1 -> System.out.println("Very Good");
                case 2 -> System.out.println("Excellent");
                case 3 -> System.out.println("Nice Work");
                case 4 -> System.out.println("Keep up the good work");
            }
            return true;

        }else {
            int wrongResponse=1 + random.nextInt(4);
            switch (wrongResponse) {
                case 1 -> System.out.println("No please try again");
                case 2 -> System.out.println("Wrong . Try once more");
                case 3 -> System.out.println("Don't give up");
                case 4 -> System.out.println("No. Keep trying");
            }
            return false;
        }
    }

    public static int question(int number1,int number2){
        System.out.printf("What is %d times %d",number1,number2);
        return number1 * number2;
    }


    public static void main(String[] args){

        boolean isCorrect;

        for (int i =1; i <= 10; i++){
            int num1= 1 + random.nextInt(5);
            int num2= 1 + random.nextInt(5);
            int actualAnswer=question(num1,num2);

            System.out.println(" Your answer:  ");
            int answer=input.nextInt();

            isCorrect=checkAnswer(answer,actualAnswer);


            if(isCorrect){
                correctCounter++;
                System.out.println("Correct answer :" + correctCounter);
            }else {
                wrongCounter++;
                System.out.println("Wrong answer" + wrongCounter);
            }
        }

          calculatePercentage();

        }


    }


