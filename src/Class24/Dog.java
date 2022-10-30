package Class24;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private double weight;
   public  Dog(String name, String breed, int age,double weight){
       setName(name);
       setBreed(breed);
       setAge(age);
       setWeight(weight);


       if(name.length()>30){
           System.out.println("Name cant be more than 30 letters. Please try ");
       } else if (name.isEmpty()) {
           System.out.println("Name cant be empty");
       }else{
           this.name=name;
       }



      if(breed.length()>20){
          System.out.println("Breed cant be more than 20 letters");

      } else if (breed.isEmpty()){
          System.out.println("cant be empty");
      }else{
          this.breed=breed;
      }
   }

   void setName(String name){
        if(name.length()>30){
            System.out.println("Name cant be more than 30 letters. Please try ");
        } else if (name.isEmpty()) {
            System.out.println("Name cant be empty");
        }else{
            this.name=name;
        }
    }

    void setAge(int age){
       if(age>20){
           System.out.println("please use less age");

       }else if (age<0){
           System.out.println("cant be negative");
       }else{
           this.age=age;
       }
    }

    void setWeight(double weight){
       if(weight<0){
           System.out.println("Cant be negative");
       }else{
           this.weight=weight;
       }
    }

    void setBreed(String breed){
        if(breed.length()>20){
            System.out.println("Breed cant be more than 20 letters");

        } else if (breed.isEmpty()){
            System.out.println("cant be empty");
        }else{
            this.breed=breed;
        }

    }
    String getName(){
       return name;
    }
    String getBreed(){
       return breed;
    }
    int getAge(){
       return age;
    }
    double getWeight(){
       return weight;
    }
    void printInfo(){
        System.out.println("Name" + name +"Breed" + breed+ "Age" + age+ "Weight" + weight);
    }
}
        class Test{
        public static void main(String[] args) {
        Dog tommy=new Dog("Tommy","German",15,15);

        //tommy.name="Tommy";
        //tommy.breed="German";
        //tommy.age=20;
        //tommy.weight=15;
           /* System.out.println(tommy.name);*/
            System.out.println(tommy.getName());

        tommy.printInfo();
    }
}