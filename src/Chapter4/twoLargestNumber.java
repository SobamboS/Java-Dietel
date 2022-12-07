package Chapter4;

import java.util.Scanner;

public class twoLargestNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
int second = 0;
        int largest = 0;
        int counter = 0;
        while (counter < 4) {
            System.out.println("Enter a number :");
            int number=input.nextInt();

            if(number>largest){
                second = largest;
                largest=number;
            }
            else {if(number > second)
                      second= number;


        }
           counter++;

        }
        System.out.println(largest);
        System.out.println(second);
    }

}
