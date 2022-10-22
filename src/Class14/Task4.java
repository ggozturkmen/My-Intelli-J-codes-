package Class14;

public class Task4 {

    public static void main(String[] args) {
//How to reverse a string word by word?

        String str="This is sentence i want to reverse";
        String[] str1=str.split(" ");
        int value=str1.length;
        for (int i=0; i<value; i++){
            StringBuilder str2=new StringBuilder(str1[i]);
            System.out.print(str2.reverse()+" ");
        }
}}
