package Class24;

public class Horse {

   private String name;
    private String breed;
    private String color;
   private  int age;

    public Horse(String name, String breed, String color, int age) {
       setName(name);
       setBreed(breed);
       setColor(color);
       setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter name");
        } else {
            this.name = name;
        }


    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("cant be empty");
        } else {
            this.breed = breed;
        }


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color.isEmpty()){
            System.out.println("cant be empty");        }
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age<0) {
            System.out.println("cant be 0 ");
        } else {
            this.age = age;
        }

    }
}
