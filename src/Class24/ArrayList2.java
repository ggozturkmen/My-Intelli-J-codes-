package Class24;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        int a=34;
        numbers.add(a);
        System.out.println(numbers);

        for(Integer num:numbers){
            System.out.println(num);
        }




        // int=>Integer
        //boolean=>boolean
        //byte=>Double
        //Long=>Long
        //floT=>Float
        //char=>Character

    }
}
