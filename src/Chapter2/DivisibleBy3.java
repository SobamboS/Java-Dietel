package Chapter2;

public class DivisibleBy3 {  // class
    public static void main(String[] args) {  // method

        int a = 7;
        int b = 3;
        int x = a % b;

        if (x == 0){
            System.out.printf(" %d%n %d can be divided by 3", x, a);
        }
        else{
            System.out.printf(" %d%n %d cannot be divided by 3",  x, a);
        }
    }
}
