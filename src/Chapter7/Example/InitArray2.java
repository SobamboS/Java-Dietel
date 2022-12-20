package Chapter7.Example;


import java.util.Arrays;

public class InitArray2 {
    public static void main(String[] args){
        int[] array = {1,5,8,9,6,3,5,6,7,3,2,5,6,9,8,3,5,6,7};
        Arrays.sort(array);



        for(int i : array){
            System.out.println(i);
        }
    }
}
