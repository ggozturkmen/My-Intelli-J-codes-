package Class18;

public class Cat {


    private String name;
    private String breed;
    private int age;
    private double weight;

    public Cat(String catname, String catbreed, int catage, double catweight) {




            name = catname;
            breed = catbreed;
            age = catage;
            weight = catweight;

        }
         public void print(){
            System.out.println("Name"+name+"Breed"+breed+"Age"+age+"Weight"+weight);
        }



        public static void main (String[]args){

            Cat cat = new Cat("leyla", "persian", 9, 8);

            cat.print();
        }


    }







