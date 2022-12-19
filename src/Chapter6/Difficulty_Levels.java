package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Difficulty_Levels{
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



    public static void question(int number1,int number2){
        System.out.printf("What is %d times %d",number1,number2);
        int userInput =input.nextInt();
        int correctAnswer = number1 * number2;

        if(userInput == correctAnswer){
            correctCounter++;

        }else {
            wrongCounter++;
        }

    }



    public static void difficulty(int level){
        switch (level){
            case 1 -> {
                for(int i=0; i <= 10; i++){
                    int easy1=1 + random.nextInt(5);
                    int easy2=1+ random.nextInt(5);
                    question(easy1, easy2);

                }
            }
            case 2 -> {
                for(int i=0;i<=10;i++){
                    int hard1=5 + random.nextInt(20);
                    int hard2=5 + random.nextInt(20);
                    question(hard1, hard2);
                }
            }

        }
    }




    public static void main(String[] args){

        System.out.println("Enter a level of difficulty");
        System.out.println("1 for easy or 2 for hard ");
        int level =input.nextInt();
        difficulty(level);

        calculatePercentage();
    }


}




