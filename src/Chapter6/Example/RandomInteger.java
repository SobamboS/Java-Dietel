package Chapter6.Example;

import java.security.SecureRandom;

public class RandomInteger {
    public static void main ( String[] args ) {
        SecureRandom randomNumbers = new SecureRandom(); // randomNumbers object will produce secure random numbers

    for(int counter = 1; counter <= 20; counter++ ){ // loop 20 times

        int face =  1 + randomNumbers.nextInt (6);// pick random integer from 1 to 6

        System.out.printf ( "%d ",face);// display generated value

        // if counter is divisible by 5, start a new line of output
        if (counter % 5 == 0) {
            System.out.println ( );
        }
      }
    }
  }
