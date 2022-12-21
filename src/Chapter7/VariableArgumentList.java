package Chapter7;

//(Variable-Length Argument List) Write an application that calculates the average of a series
//  of integers that are passed to method average using a variable-length argument list. Test your method
//   with several calls, each with a different number of arguments.

public class VariableArgumentList{
   private static final int[] var = {10, 23,4,5,76,89};

    private static double getAverage( ){
        int total =0;

        for(int var : var){
            total+= var;
        }
        return  total /(double) var.length;
    }

    public static void main(String[] args){

        System.out.println(getAverage());

    }


}
