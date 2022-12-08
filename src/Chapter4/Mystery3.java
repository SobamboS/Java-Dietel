package Chapter4;

public class Mystery3{
 public static void main(String[] args) {
            int row = 5;

            while (row >= 1) {
            int column = 5;

            while (column >= 1) {
            System.out.print(row % 2 == 0 ? "X" : "O");
            ++column;
            } // end while

                 --row;
                 System.out.println();
                 } // end while
             } // end main
 } // end class Mystery3

