package Chapter4;

//   (Credit Limit Calculator) Develop a Java application that determines whether any of
//   several department-store customers has exceeded the credit limit on a charge account.
//   For each customer, the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded,
//        the program should display the message "Credit limit exceeded".

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main ( String[] args ) {

Scanner input = new Scanner ( System.in );
        System.out.print ( "Enter account number :" );
        int accountNumber = input.nextInt ();

        System.out.print("Enter Balance :");
        int balance = input.nextInt ();

        System.out.print ( "Enter total of items charged :" );
        int charges = input.nextInt ();

        System.out.print ( "Enter total  credit on item :" );
        int credits = input.nextInt();

        System.out.print ("Enter allowed credit" );
        int creditLimit = input.nextInt ( );

        int newBalance = ( balance + charges - credits);

        if( newBalance > creditLimit) {
            System.out.println ( "Credit limit exceeded" );
        }


        System.out.printf ("Account number : %d%n",accountNumber);
        System.out.printf ("balance at the beginning of the month %d%n", balance);
        System.out.printf ("total of all items charged by the customer this month %d%n",charges);
        System.out.printf ("total of all credits applied to the customer account this month %d%n",credits);
        System.out.printf ("allowed credit limit %d%n",creditLimit);
        System.out.printf ("New balance %d%n",newBalance);

    }
}
