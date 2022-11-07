package Chapter9.CommissionEmployee;

public class PolyMorphismTest{
    public static void main(String[] args){
        CommissionEmployee commissionEmployee = new CommissionEmployee("John", "Doe",
                "222-222-222", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Felix",
                "Dragon", "23-332-342", 5000,.04, 300);

        System.out.printf("");
    }
}
