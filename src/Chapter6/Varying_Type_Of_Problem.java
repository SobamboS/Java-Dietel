package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Varying_Type_Of_Problem{
        static Scanner input=new Scanner(System.in);
        static SecureRandom random=new SecureRandom();
        static int correctCounter=0;
        static int wrongCounter=0;


        public static void calculatePercentage( ){
            int percentage = correctCounter * 10 /100;

            if (percentage > 7.5){
                System.out.printf("%d Congratulations, you are ready to go to the next level!", percentage);
            }else {
                System.out.printf("%d Please ask your teacher for help :", percentage);
            }
        }



        public static void multiplication(int number1,int number2){
            System.out.printf("What is %d times %d",number1,number2);
            int userInput =input.nextInt();
            int correctAnswer = number1 * number2;

            if(userInput == correctAnswer){
                correctCounter++;

            }else {
                wrongCounter++;
            }

        }

        public static void addition(int num1,int num2){
            System.out.printf("What is %d plus %d ",num1,num2);
            int userInput =input.nextInt();
            int correctAnswer = num1 + num2;
            if(userInput == correctAnswer){
                correctCounter++;

            }else {
                wrongCounter++;
            }

        }
        public static void subtraction(int num1,int num2){
            System.out.printf("What is %d plus %d ",num1,num2);
            int userInput =input.nextInt();
            int correctAnswer = num1 - num2;
            if(userInput == correctAnswer){
                correctCounter++;

            }else {
                wrongCounter++;
            }

        }
        public static void division(int num1,int num2){
            System.out.printf("What is %d plus %d ",num1,num2);
            int userInput =input.nextInt();

            int correctAnswer = num1 / num2;

            if(userInput == correctAnswer){
                correctCounter++;

            }else {
                wrongCounter++;
            }

        }





        public static void problem(int option){
            System.out.println("""  
                Pick arithmetic problem:
                1.-> Addition
                2.-> Subtraction
                3.-> Multiplication
                4.-> Division
                5.-> Random;
                
                """);
            System.out.println();

            switch (option){

                case 1 -> {
                    System.out.println("Addition");
                    for(int i=0; i < 10; i++){
                        int add1=1 + random.nextInt(5);
                        int add2=1+ random.nextInt(5);
                        addition(add1, add2);
                    }
                }
                case 2 -> {
                    System.out.println("Subtraction");
                    for(int i=0;i<10;i++){
                        int sub1= 1 + random.nextInt(5);
                        int sub2= 1 + random.nextInt(5);
                        subtraction(sub1, sub2);
                    }
                }
                case 3->{
                    System.out.println("Multiplication");
                    for(int i=0; i < 10; i++){
                        int mul1 = 1 + random.nextInt(5);
                        int mul2 = 1 + random.nextInt(5);
                        multiplication(mul1, mul2);
                    }
                }
                case 4-> {
                    System.out.println("Division");
                    for(int i=0;i<10;i++){
                        int div1=1 + random.nextInt();
                        int div2=1 + random.nextInt();
                        division(div1, div2);
                    }
                }
            }
        }



        public static void main(String[] args){

            System.out.println("Enter a level of difficulty");
            System.out.println("1 for easy or 2 for hard ");
            int option =input.nextInt();
            problem(option);

            calculatePercentage();
        }


    }
