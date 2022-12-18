package Chapter6;

import java.util.Scanner;

public class ParkingCharges{
    static int hour = 0;
    static int charges= 2;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hours stayed : ");
        hour =input.nextInt();

        if(hour > 3){
            charges += 0.50;
        }else if(hour >= 24){
            charges= 24;
        }

        System.out.println(calculateCharges());
    }



    public static int calculateCharges(){
        return charges;
    }



}