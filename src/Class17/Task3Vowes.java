package Class17;

public class Task3Vowes {
    private static String getVowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","");

    }

    public static void main(String[] args) {
        System.out.println(getVowels("Humera"));
    }
}
