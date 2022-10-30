package Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        //Syntax to create arraylist
        ArrayList<String>colors=new ArrayList<>();
        //use add method to insert elemenent in array list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        //print all the elements
        System.out.println(colors);
        //get individual elements from array list
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        System.out.println(colors.size());//will give you how many elements there are,

        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));

        }
        System.out.println("********************");
        for(String color:colors){   //inheritance
            System.out.println(color);
        }

    }


}
