package Day19;

public class Dog {
    String name;
    String breed;
    String color;

    public Dog(String name, String breed, String color) {

        this.name=name;
        this.breed=breed;
        this.color=color;

    }
    public void printInfo(){
        System.out.println("Name"+name+"Breed"+breed+ "Color"+color);
    }
}
class Cat {
    String name;
    String breed;
    String color;
    Cat(String name, String breed, String color){

    }
}