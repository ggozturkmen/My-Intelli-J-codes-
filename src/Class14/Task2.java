package Class14;

public class Task2 {

    public static void main(String[] args) {
        String str="ghtuiABCDFT1245%$#@&";
        str=str.replaceAll("[^a-zA-z0-9]","");
        System.out.println(str.length());
    }
}
