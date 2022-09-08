package Chapter3.Car;

public class CarApplicationTest {
    public static void main ( String[] args ) {

        // for  car 1
        Car car1 = new Car ( "Bentley", "1990", 1000);
        double discountPrice1 = car1.getFinalPrice ( 5 );    // to calculate discount for car 1

        // for car 2
        Car car2 = new Car ( "Toyota", "2000", 2000 );
        double discountPrice2 = car2.getFinalPrice ( 7 );  // to calculate discount for car 2


        // Information about car 1
        System.out.printf ("Model : %s%n", car1.getModel());
        System.out.printf ("Year : %s%n", car1.getYear());
        System.out.printf ("Price : %.0f$%n", car1.getPrice());
        // Final price of cars
        System.out.printf ( "Final price of car after applying 5 percent discount %.0f$%n%n",
                discountPrice1);

        // Information about car 2
        System.out.printf ( "Model : %s%n", car2.getModel());
        System.out.printf ( "Year : %s%n", car2.getYear());
        System.out.printf ( "Price : %.0f$%n", car2.getPrice());
        // Final price of cars
        System.out.printf ( "Final price of car after applying 7 percent discount is %.0f$%n",
                discountPrice2);

}}