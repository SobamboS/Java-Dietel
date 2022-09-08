package Chapter2;

public class IntegerValueCharacter {   // class
    public static void main ( String[] args ) {  // method

        System.out.printf ( "The character %c has the value %d%n", 'A', ((int) 'A') );  // Display integer equivalent of A
        System.out.printf ( "The character %c has the  value %d%n", 'B', ((int) 'B') );  // Display integer equivalent of B
        System.out.printf ( "The character %c has the  value %d%n", 'C', ((int) 'C') );
        System.out.printf ( "The character %c has the  value %d%n", 'a', ((int) 'a') );
        System.out.printf ( "The character %c has the  value %d%n", 'b', ((int) 'b') );
        System.out.printf ( "The character %c has the  value %d%n", 'c', ((int) 'c') );
        System.out.printf ( "The character %c has the  value %d%n", '0', ((int) '0') );
        System.out.printf ( "The character %c has the  value %d%n", '1', ((int) '1') );

    }
}