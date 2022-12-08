package Chapter4;
// A large company pays its salespeople on a commission basis.
// The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//        a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to
//        the number of items that can be sold.

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        int total = 0;
        int count = 0;
        double item = 0.0;


        while( item != -1){
            total += item;
        System.out.print ("Input price of item " );
        item = input.nextDouble ();

        }
            count++;



        double grossEarning = 200 * (double) ((total * 9) / 100);
           System.out.printf ( "Your gross earning is $%.1f%n", grossEarning );

            System.out.print("Item    Value");
            System.out.printf("%d%n      %f%n",count , item);
    }
}
