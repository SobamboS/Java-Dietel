package Chapter8.SavingAccountClass;

public class SavingsAccount{
 private static double annualInterest;
 private double savingsBalance;

 public SavingsAccount(double savingsBalance){
  this.savingsBalance=savingsBalance;
 }

 public double getCalculateMonthlyInterest(){
  return (savingsBalance * modifyInterestRate(annualInterest)) / 12;
 }

 public double getSavingsBalance(){
  return savingsBalance + getCalculateMonthlyInterest();
 }

 public static double modifyInterestRate(double annualInterestRate){
  return annualInterestRate;
 }

}