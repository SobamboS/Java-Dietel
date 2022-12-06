package Chapter4;

public class TabularOutput{
    public static void main(String[] args){
        System.out.print("N  N3  N4  N5");

        for(int i=0;i<=5;i++){

            int n2 = i * i;
            int n3 = i * i * i;
            System.out.printf("%d      %d        %d%n",i,n2,n3);

        }

    }

}

