package Rewiew3;

public class Teacher {

    String name, lname;
    String subject;
    int experience;
    double salary;

    static String school;

    Teacher(String name, String lname) {
// this. - use to refer to current object:Instance variables
        this.name = name;
        this.lname = lname;


    }
    //this()-refers to the  current object: current class constructor

    Teacher(String name, String lname, String subject) {
        this(name, lname);//Constructor call must be first
        this.subject=subject;
    }


    Teacher(String name, String lname, int experience){
        this(name,lname);
        this.experience=experience;


    }
    static void work(){
        System.out.println("All teachers work at "+school);
    }

    void printInfo(){
        System.out.println("Teacher name is"+name+" " +" lname");
    }
    void print(){
        System.out.println(name+"teaches"+subject);
    }
    public static void main(String[] args) {
        Teacher teacher=new Teacher("John","Simith");
        System.out.println(teacher.name);
        teacher.printInfo();
        Teacher teacher2=new Teacher("Jack","Simith", "math");
        teacher2.print();
    }
}

