package Chapter7.Example;

public class EnhancedForTest{
    public static void main(String[] args){
        int[] array={23,45,56,76,89,56,67,78,34};
        int total=0;
        int counter=0;
        for(int number : array){
            total+=number;
            counter++;
        }
        System.out.printf("Total of array elements: %d%n",total);
        System.out.printf("number of elements: %d%n", counter);
    }
}