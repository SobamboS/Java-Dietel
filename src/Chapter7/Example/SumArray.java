package Chapter7.Example;

public class SumArray {
    public static void main ( String[] args ) {
        int [] array = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int total = 0;
        for(int i : array){
            total+=i;
        }
            System.out.printf ( "Total of array elements : %d%n", total);

    }
}
