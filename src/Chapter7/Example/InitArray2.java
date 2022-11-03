package Chapter7.Example;

public class InitArray2 {
    public static void main ( String[] args ) {
        int[] array = {10, 23, 34, 45, 56, 67, 78, 89, 90};

        System.out.printf ( "%s%8s%n", "Index", "Value" ); // column headings
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf ( "%5d%8d%n", counter, array[counter] );
        }
    }  
}
