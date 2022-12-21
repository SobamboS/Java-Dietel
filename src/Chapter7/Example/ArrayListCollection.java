package Chapter7.Example;

import java.util.ArrayList;

public class ArrayListCollection{
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"yellow");

        System.out.print(
                "Display list contents with counter-controlled loop:");
        for(String item : items){
            System.out.println(item);
        }
        //    display(items);
    }
}
