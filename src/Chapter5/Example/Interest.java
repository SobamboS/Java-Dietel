package Chapter4.Example;

public class Interest {
    public static void main ( String[] args ) {
        double principal = 1000.0;
        double rate = 0.05;

        for(int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow ( 1.0 + rate, year );

            System.out.printf ( "%4d", year );
            System.out.printf ( "%,20.2f%n", amount );
        }
    }

}
