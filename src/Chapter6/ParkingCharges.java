package Chapter6;

import java.util.Scanner;

public class ParkingCharges{
//    public static int calculateCharges(){
//        int hour=3;
//        int charges=2;
//
//    return if (hour> 3){
//            charges+= 0.50;
//        }else if(hour>= 24){
//            charges= 10;
//        };
//    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Hours parked by each customer :");
        int hour =input.nextInt();

        for(int customer =1; customer < 5; customer++){

      //  System.out.println(customer);

        System.out.printf("%d%n     ",customer);
        }
        System.out.print("Customer            Hours");

        System.out.println();
    }
}
