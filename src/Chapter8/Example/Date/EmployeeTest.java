package Chapter8.Example.Date;

public class EmployeeTest{
    public static void main(String[] args){
        Date birth = new Date(21, 1, 1998);
        Date hire = new Date(13, 12,2002);
        Employee employee = new Employee("Bob", "Falade", birth, hire);

        System.out.println(employee);
    }
}
