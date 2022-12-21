package Chapter7.Example;

public class InitArray {
    public static void main ( String[] args ) {
    int [] array = new int[10];
    System.out.printf("%s%8s%n", "Index", "Value"); // column headings
   // output each array element's value
    for (int counter = 0; counter < array.length; counter++) {
        System.out.printf ( "%3d%8d%n", counter, array[counter] );
    } }}
