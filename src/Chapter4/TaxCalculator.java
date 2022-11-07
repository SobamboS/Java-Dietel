package Chapter4;

import java.util.Scanner;

public class TaxCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tax=0;
        int citizenCounter = 1;

       while(citizenCounter <= 3) {
//            System.out.print("Name");
//            String name = input.nextLine();

            System.out.print("How much do you earn ?");
            int earning =input.nextInt();


           if(earning <= 3000){
               tax= (earning * 0.15)/100;
           }
           else {
               tax = (earning *0.20)/100;
           }
           citizenCounter++;
        }
          System.out.println(tax);

    }

}
