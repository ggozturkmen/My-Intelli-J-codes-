package Class25;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String>makeUpItem=new ArrayList<>();

        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("mascara");
        makeUpItem.add("eyeliner");
        makeUpItem.add("lipstick");

        ArrayList<String>cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Container");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");
        ArrayList<String>beautyProducts=new ArrayList<>();
        //Adds everything from makeupitem snd beautyproducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("Lotion");//removes only one item
        System.out.println(beautyProducts);

        beautyProducts.removeAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.clear();//removes everything
        System.out.println(beautyProducts);


    }
}
