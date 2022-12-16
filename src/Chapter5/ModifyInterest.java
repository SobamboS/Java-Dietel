package Chapter5;

public class ModifyInterest{
        public static void main ( String[] args ) {
            double principal = 1000.0;
            double rate = 5;

            System.out.println("  Year           Amount");
            for(int year = 1; year <= 10; ++year, rate++) {
                double amount = principal * Math.pow ( 1.0 + rate/100, year );

                System.out.printf ( "%4d", year );
                System.out.printf ( "%,20.2f%n", amount );
            }
        }

    }


