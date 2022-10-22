package Class18;

public class Main {

    public String name;
    public String city;
    public String NameOfTheSchool;
    int Batchnumber;

    public void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + NameOfTheSchool + " in batch " + Batchnumber);
    }

    public static void main(String[] args) {


        Main main = new Main();
        main.name = "John";
        main.city = "Miami";
        main.NameOfTheSchool = "Syntax";
        main.Batchnumber = 9;
        main.display();
    }


}


