package Class15;

public class Dog {

    String name;//instance
    static int noOfLegs=4;

    void bark(){
        int i=10;//local
        for(int j=0; j<i;j++){
            System.out.println("Barking...");
        }
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();


    }
}
