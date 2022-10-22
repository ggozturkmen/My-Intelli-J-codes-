package Class14;

public class Demo4 {

    boolean mystery() {
        return false;
    }

    String mystery2(int num) {
        return "Java";
    }
    static String method(String word) {
        //return "Java";//will print Java
        if (word.equals("Java")) {
            return "python";

        } else {
            return "Java";
        }}

    public static void main(String[] args) {
        Demo4 md=new Demo4();
        System.out.println( md.mystery());
        System.out.println(md.mystery2(5));//will return once
        System.out.println(Demo4.method("python"));//will print Java
    }
}

