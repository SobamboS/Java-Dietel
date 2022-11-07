package Chapter9.CommissionEmployee;

public class CommissionEmployeeTest{
    public static void main(String[] args){
        CommissionEmployee employee = new CommissionEmployee("Sue",
                "Jones", "222-222-222",100,
                .06);
        // get commission employee data
        System.out.println("Employee information obtained by get methods:");
         System.out.printf("%n%s %s%n", "First name is",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
         System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
         System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
         System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

    }
}
