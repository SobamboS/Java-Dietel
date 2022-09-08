package Chapter3.Account;


   public class Account {

       // instance variables
       private String name;
       private double balance;

       // constructor
       public Account ( String name, double balance ) {
           this.name = name;
           if ( balance > 0.0 )
               this.balance = balance;
       }

       // method to set and get balance
       public double getBalance ( ) {
           return balance;
       }
       public void setWithdrawAmount ( double withdrawAmount ) {
           if ( withdrawAmount > balance ) {
           throw new IllegalArgumentException ( "Withdrawal amount exceeded account balance" );
           }
               balance = balance - withdrawAmount;
       }


       // method to set the name in the object
       public void setName ( String name ) {
           this.name = name; // store the name
       }
       // method to retrieve the name from the object
    public String getName ( ) {
           return name; // return value of name to called
       }

   }