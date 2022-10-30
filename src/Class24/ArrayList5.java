package Class24;

import java.util.ArrayList;

public class ArrayList5 {

    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        //use add method to insert elements in array list

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("yellow");
        colors.add("Black");
        System.out.println(colors);
        //colors.remove("Blue);
        colors.remove(2);
        System.out.println(colors);
    }
}
