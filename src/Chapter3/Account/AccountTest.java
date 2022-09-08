package Chapter3.Account;

     import java.util.Scanner;

public class AccountTest {
    public static void main ( String[] args ) {

        Account account1 = new Account ( "John", 50.00 );
        Account account2 = new Account ( "Femi", -7.45 );

        // display initial balance of each object
        System.out.printf ( "%s balance :%.2f%n", account1.getName ( ), account1.getBalance ( ) );
        System.out.printf ( "%s balance :%.2f%n", account2.getName ( ), account2.getBalance ( ) );

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner ( System.in );


        // to withdraw
        System.out.print ("Enter withdraw amount for account1 :" );
        double withdrawAmount = input.nextDouble ();
        account1.setWithdrawAmount ( withdrawAmount );

        System.out.print ("Enter withdraw amount for account2 :" );
        withdrawAmount = input.nextDouble ( );
        account2.setWithdrawAmount ( withdrawAmount );

        // display balance
        System.out.printf ( "%s balance: $%.2f%n", account1.getName ( ), account1.getBalance ( ) );
        System.out.printf ( "%s balance: $%.2f%n", account2.getName ( ), account2.getBalance ( ) );
    }
    }
