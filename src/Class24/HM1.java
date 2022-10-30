package Class24;

import java.util.ArrayList;

public class HM1 {

    //Create an ArrayList that will store 5 names into it.
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Gulcan");
        names.add("Muttalip");
        names.add("Miray");
        names.add("Nihat");
        names.add("Kartal");
        System.out.println(names);

        if(names.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
        System.out.println(names.contains("Gulcan"));

        System.out.println(names.size());

        }



    }


