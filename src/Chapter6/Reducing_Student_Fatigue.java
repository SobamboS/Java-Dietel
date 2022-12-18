package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Reducing_Student_Fatigue{

        static Scanner input = new Scanner(System.in);
        static SecureRandom random=new SecureRandom();
        public static int generateSecureRandom(){
            return random.nextInt(1, 5);
        }

        public  static  int multiply(int number1, int number2 ){
            return number1 * number2;
        }

        public static boolean checkAnswer(int answer, int actualAnswer) {
            if (answer == actualAnswer) {
                int correctResponse = 1 + random.nextInt(4);
                switch (correctResponse) {
                    case 1 -> System.out.println("Very Good");
                    case 2 -> System.out.println("Excellent");
                    case 3 -> System.out.println("Nice Work");
                    case 4 -> System.out.println("Keep up the good work");
                }
                return true;

            } else {
                int wrongResponse = 1 + random.nextInt(4);
                switch (wrongResponse){
                    case 1 -> System.out.println("No please try again");
                    case 2 -> System.out.println("Wrong . Try once more");
                    case 3 -> System.out.println("Don't give up");
                    case 4 -> System.out.println("No. Keep trying");
                }
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
                int num1 = generateSecureRandom();
                int num2 = generateSecureRandom();
                int actualAnswer = question(num1 , num2);

                System.out.println(" Your answer:  ");
                int answer = input.nextInt();

                isCorrect = checkAnswer(answer, actualAnswer);


                while (!isCorrect) {
                    question(num1, num2);

                    System.out.println(" Your answer:  ");
                    answer = input.nextInt();

                    isCorrect = checkAnswer(answer, actualAnswer);

                }

            }
            while (true);

        }

    }

