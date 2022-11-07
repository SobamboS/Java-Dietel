package Chapter8.Example.SavingsAccount;

public class SavingsClass{
   private static int annualInterestRate;
 private double savingBalance;

    public SavingsClass(double savingBalance){
        this.savingBalance=savingBalance;
    }

    public static int getAnnualInterestRate( ){
        return annualInterestRate;
    }

    public double getSavingBalance( ){
        return savingBalance;
    }
    public double getCalculateMonthlyInterest(){
        return (savingBalance * annualInterestRate) / 12;
    }

    public static int getModifyInterestRate(){
        return annualInterestRate = 0;
    }
}