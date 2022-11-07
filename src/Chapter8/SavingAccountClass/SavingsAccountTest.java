package Chapter8.SavingAccountClass;

public class SavingsAccountTest{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        double interestRate1 = SavingsAccount.modifyInterestRate(0.5);
        double interestRate2 = SavingsAccount.modifyInterestRate(0.4);

        System.out.println(saver1.getCalculateMonthlyInterest());
    }
}
