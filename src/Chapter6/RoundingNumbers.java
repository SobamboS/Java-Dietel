package Chapter6;

import java.util.Scanner;

public class RoundingNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double value :");
        double value = input.nextDouble();

        double y = Math.floor((value) +0.5);


        System.out.println(value);
        System.out.println(y);

    }


}
