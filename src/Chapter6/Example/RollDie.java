package Chapter6.Example;

import java.security.SecureRandom;

public class RollDie {
    public static void main ( String[] args ) {
        SecureRandom randomNumber = new SecureRandom ( );

        int frequency1 = 0;  // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + randomNumber.nextInt ( 6 );

            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1 -> ++frequency1; // increment the 1s counter
                case 2 -> ++frequency2; // increment the 2s counter
                case 3 -> ++frequency3; // increment the 3s counter
                case 4 -> ++frequency4; // increment the 4s counter
                case 5 -> ++frequency5; // increment the 5s counter
                case 6 -> ++frequency6; // increment the 6s counter
            }
        }
        System.out.println("Face\tFrequency"); // output headers
         System.out.printf("1\t %d%n2\t %d%n3\t %d%n4\t %d%n5\t %d%n6\t %d%n",
                 frequency1, frequency2, frequency3, frequency4,
                 frequency5, frequency6);
    }
}