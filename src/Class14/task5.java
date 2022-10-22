package Class14;

public class task5 {

    public static void main(String[] args) {

        //polidrome

       String str="dad";

        StringBuilder stringBuilder=new StringBuilder("dad");
        stringBuilder.reverse();

        if(stringBuilder.toString().equals(str)){
            System.out.println("The String is polindrome");
        }else{

            System.out.println("The String is not polindrome");
        }
    }
}
