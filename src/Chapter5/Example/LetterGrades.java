package Chapter5.Example;

import java.util.Scanner;

public class LetterGrades{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter =0;

        int aCount =0;
        int bCount =0;
        int cCount =0;
        int dCount =0;
        int eCount =0;
        int fCount =0;

        System.out.println("Enter an integer grade");
        while(input.hasNext()){
            int grade =input.nextInt();
            total+=grade;
            gradeCounter++;

            switch (grade/10) {
                case 9,10 -> aCount++;
                case 8 -> bCount++;
                case 7 -> cCount++;
                case 6 -> dCount++;
                default -> fCount++;
            }
        }
        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0){
            double average = (double) total/ gradeCounter;
            System.out.printf("Total of the %d grade entered is %d%n:",gradeCounter, total);
            System.out.printf("Average %.2f%n ", average);
            System.out.printf(" Number of student who received each grades %n%s%d%n %s%d%n %s%d%n %s%d%n %s%d%n %s%d%n ",
                    "A :", aCount,
                    "B :",bCount,
                    "C :",cCount,
                    "D :",dCount,
                    "E :",eCount,
                    "F :",fCount);

        }else {
            System.out.println("No result was inputted");

        }
    }
}
