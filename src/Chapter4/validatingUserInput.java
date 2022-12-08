package Chapter4;
//(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any
// input, if the value entered is other than 1 or 2, keep looping until the use

import java.util.Scanner;

public class validatingUserInput{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int passes=0;
        int failure=0;
        int studentCounter=1;

        while (studentCounter<= 6) {
            System.out.print("Enter the result (1 = pass, 2 = failure) :");
            int result=input.nextInt();

            if(result < 1 || result >2){

                studentCounter++;}
                if(result==1){
                    passes++;
                }else {
                    failure++;
                }


        }
        System.out.printf("Passed: %d%nFailed: %d%n",passes,failure);
        if(passes>8){
            System.out.println("Bonus to instructor!");
        }


    }
}

