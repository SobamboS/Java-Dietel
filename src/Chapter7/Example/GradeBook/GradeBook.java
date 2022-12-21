package Chapter7.Example.GradeBook;

public class GradeBook{
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName,int[] grades){
        this.courseName=courseName;
        this.grades=grades;
    }

    public String getCourseName( ){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public void processGrade(){
        outputGrades();
        System.out.println(getAverage());
        System.out.println(getMinimum() +""+ getMaximum());

    }

    private int getMaximum( ){
        int highGrade = grades[0];
        for(int grade : grades){
            if(grade > highGrade){
                highGrade = grade;
            }
        }
        return highGrade;
    }

    private int getMinimum( ){
        int lowGrade = grades[0];

        for(int grade : grades){
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    private double getAverage( ){
        int total =0;
        for(int grade : grades){
            total += grade;
        }
        return total/ (double) grades.length;
    }

    private void outputGrades( ){
        for(int student=0; student <grades.length; student++){
            System.out.printf("Student %2d: %3d%n",student+1, grades[student]);
        }
    }
}
