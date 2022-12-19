package Chapter6;

import java.util.Scanner;

public class ParkingCharges{
    static int hour = 0;


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hours stayed : ");
        hour =input.nextInt();


        calculateCharges(2);
    }



    public static void calculateCharges(int charges){
        if(hour > 3){
            charges += 0.50;
        }else if(hour >= 24){
            charges= 24;
        }
    }



}