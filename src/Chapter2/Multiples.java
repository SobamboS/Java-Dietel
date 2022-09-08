package Chapter2;
public class Multiples {
    public static void main ( String[] args ) {

        int a = 5 * 3;
        int b = 4 * 2;
        int x = a % b;
        if ( x == 0) {
            System.out.printf ("%d is a multiple of %d%n", a, b);
        }
        else {
            System.out.printf ("%d is not a multiple of %d%n", a, b);
        }

        }
    }
