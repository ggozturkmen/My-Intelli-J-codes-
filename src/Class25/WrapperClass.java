package Class25;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

//Boxing or manuel conversion from primitive or wrapper type
        //AutoBoxing or automotic conversion of primitive to a wrapper type
        int num = 10;
        Integer WrappedNum = num;

        System.out.println(WrappedNum);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);

        //Unboxing convertiing a wrapper type to corresponding primitive type
        //int num2=WrappedNum.intValue();

        //



    }
}
