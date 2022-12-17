package Chapter3.Example;

    import java.util.Scanner;

public class ExampleAccountTest {
public static void main(String[] args) {
    ExampleAccount Eaccount1 = new ExampleAccount("Jane Green", 50.00);
    ExampleAccount Eaccount2 = new ExampleAccount("John Blue", -7.53);

    // display initial balance of each object
            System.out.printf("%s balance: $ %f%n",Eaccount1.getName(),Eaccount1.getBalance());
            System.out.printf("%s balance: $ %f%n", Eaccount2.getName(), Eaccount2.getBalance());

             // create a Scanner to obtain input from the command window
             Scanner input = new Scanner(System.in);

             System.out.print("Enter deposit amount for account1: "); // prompt
             double depositAmount = input.nextDouble ( );

             System.out.printf("%f%n adding to account1 balance%n%n",depositAmount);
             Eaccount1.deposit(depositAmount);

             System.out.print("Enter deposit amount for account2: "); // prompt
             depositAmount = input.nextDouble ( );
             System.out.printf("%f%n adding to account2 balance%n%n",depositAmount);
             Eaccount2.deposit(depositAmount);

             // display balances
             System.out.printf("%s balance: $ %f%n", Eaccount1.getName(),Eaccount1.getBalance());
             System.out.printf("%s balance: $ %f%n", Eaccount2.getName(), Eaccount2.getBalance());

             // display balances
            System.out.printf("%s balance: $ %f%n", Eaccount1.getName(), Eaccount1.getBalance());
            System.out.printf("%s balance: $ %f%n", Eaccount2.getName(), Eaccount2.getBalance());
             }
}

