package Chapter6;

import java.util.Scanner;

public class CalculateSphereVolume {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Enter the radius of sphere :" );
        double radius = input.nextDouble();

        System.out.printf("%.2f", sphereVolume(radius));
    }
    public static double sphereVolume(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
