package Class14;

public class Task6 {

    public static void main(String[] args) {
        //How would you swap 2 string without temprary variable

        String str1="python";
        String str2="Java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
