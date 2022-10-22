package Class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;

    }
    void printInfo(){
        System.out.println("name "+name+" "+" breed "+" age "+age);
    }

    public static void main(String[] args) {

        Dog dog=new Dog("Tomy","Huskey","Pink",50,30);

        dog.printInfo();

        Dog dog2=new Dog("Cmi","German","Green",12,30);
        dog2.printInfo();

    }
}





