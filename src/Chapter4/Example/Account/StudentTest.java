package Chapter4.Example.Account;

import Chapter4.Example.Account.Student;

class StudentTest {
public static void main(String[] args) {
            Student account1 = new Student("Sobambo Olusola", 93.5);
            Student account2 = new Student("Don Millie", 72.75);

            System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade () );
             System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade ());
}
}

