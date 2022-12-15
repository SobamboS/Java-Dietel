package Chapter5;

public class DivisibleByThree{
    public static void main(String[] args){
int add =0;
        for(int i=3;i<=30;i++){
            if(i%3==0){
                add+=i;
            }

        }
                System.out.println(add);

    }
}