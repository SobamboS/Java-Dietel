package Chapter7.Example.GradeBook;

public class GradeBookTest{
    public static void main(String[] args){
        int[] gradeArray={87, 65,43,56,23,56,12,34,12,54,23,65};

        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming", gradeArray);
        System.out.println(gradeBook.getCourseName());
        gradeBook. processGrade();
    }
}
