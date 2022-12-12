package Chapter5;

import java.util.Scanner;

public class Extremes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
int number=0;
int minimum = number ;
int maximum=0;

            System.out.println("Enter some numbers : ");
        for(int counter = 0; counter < 5; counter++ ){
             number = input.nextInt();



            if( minimum < number){
                minimum =number;
            }//else if (minimum < number ){
               // minimum = number;
          //  }

        }
      //  System.out.println(maximum);
        System.out.println(minimum);
    }
}
