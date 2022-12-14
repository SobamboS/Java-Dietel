package Chapter9.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName,String lastName,
                                      String socialSecurityNumber,double grossSales,double commissionRate,
                                      double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
    if (baseSalary < 0.0){
    throw new IllegalArgumentException("Base salary must be above >= 0.0");}
    this.baseSalary = baseSalary;

    }

    public double getBaseSalary( ){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if  (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be above >= 0.0");}
        this.baseSalary=baseSalary;
    }

    @Override
    public double earning(){
        return getBaseSalary() * super.earning();
    }

    @Override
    public  String toString(){
        return String.format
                ("%s %s%n%s: %.2f","base-salaried",
                super.toString(), "base salary", getBaseSalary());

    }
}
