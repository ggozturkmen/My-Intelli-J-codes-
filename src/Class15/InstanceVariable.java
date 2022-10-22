package Class15;

public class InstanceVariable {
    //Which are declared outside of a block of code but inside a class called instance variable.
    String name="Confused";//Instance

    void printNumber(){
        System.out.println(name);
//when we are planning to create multiple objects of a class, or we want to
//share something in multiple methods we should go with intance. the occopy the memory longer as compared to local.
    }
}
