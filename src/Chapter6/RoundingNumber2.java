package Chapter6;

import java.util.Scanner;

public class RoundingNumber2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double value :");
        double value = input.nextDouble();

        double a = Math.floor(roundToInteger(value) + 0.5);
        double b = Math.floor(roundToTenth(value) + 0.5)/10;
        double c = Math.floor(roundToHundred(value) + 0.5)/ 100;
        double d = Math.floor(roundToThousands(value) + 0.5) / 1000;

        System.out.println("Initial value " + value);
        System.out.println("Round to integer "+ a);
        System.out.println("Round to tenth " + b );
        System.out.println("Round to hundred " + c);
        System.out.println("Round to thousand "+ d);

    }

    public static double roundToInteger(double value){
        return value;
    }
        public  static double roundToTenth(double value){
        return value;
    }
      public  static double roundToHundred(double value){
        return value;
}

       public static double roundToThousands(double value){
        return value;
  }

}
