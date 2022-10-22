package Class18;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;


    }

void printInfo(){
    System.out.println("name"+name+"Breed"+breed+"Age"+age+"Weight");
}

    public static void main(String[] args) {
        Horse horse=new Horse("Sprit","gyhf",9,15);
      horse.printInfo();
    }
    }


