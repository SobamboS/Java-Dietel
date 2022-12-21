package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class RollDice{

   private  static final SecureRandom random = new SecureRandom();
   static int[] hello = new int[36];



    public static int rollDice(){
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;
       // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }


    public static void main(String[] args){

        for(int roll=0; roll < 36_000_000; roll++){
            hello[rollDice()] +=1;
        }

        System.out.println(Arrays.toString(hello));

    }
}
