package Chapter9.CommissionEmployee;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber){
        super(firstName,lastName,socialSecurityNumber);
    }
}
