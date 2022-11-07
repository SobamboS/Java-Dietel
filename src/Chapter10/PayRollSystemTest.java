package Chapter10;

public class PayRollSystemTest{
    public static void main(String[] args){
        // create subclass objects
        SalariedEmployee salariedEmployee=
                new SalariedEmployee("John",
                        "Smith","111-11-1111",800.00);
        HourlyEmployee hourlyEmployee=
                new HourlyEmployee("Karen",
                        "Price","222-22-2222",16.75,40);
        CommissionEmployee commissionEmployee=
                new CommissionEmployee("Sue",
                        "Jones","333-33-3333",10000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee=
                new BasePlusCommissionEmployee(5000,
                        "Lewis","Bob",
                        "444-44-4444",.04,300);


        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee,"earned",salariedEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee,"earned",hourlyEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee,"earned",commissionEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned",basePlusCommissionEmployee.earning());

        Employee[] employees =new Employee[4];

        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for(Employee currentEmployee : employees){
            System.out.println(); // invokes toString

if(currentEmployee instanceof BasePlusCommissionEmployee){
    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) commissionEmployee;
    employee.setBaseSalary(1.10 *employee.getBaseSalary());

     System.out.printf(
     "new base salary with 10%% increase is: $%,.2f%n",
     employee.getBaseSalary());
}
            System.out.printf(
                    "earned $%,.2f%n%n",currentEmployee.earning());
        }
    }
}