package Class20;

public class Task3 {

    //Write a Java program called Teacher.
    // Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes

    class Teacher{

        protected String name;
        protected int age;
       protected int yearsOfExperience;
        protected String pianoType;

        Teacher(String name, int age, int yearsOfExprerince){
           this.name=name;
           this.age=age;
           this.yearsOfExperience=yearsOfExprerince;
       }
        void teach(){
            System.out.println(name="is teaching");
        }
    }
    class MathTeacher extends Teacher{
        void teachTheClass(){
            System.out.println("I will teach the class");
        }

        MathTeacher(String name, int age, int noOfYears){
            super(name,age,noOfYears);
        }
    }
    class Chemistryteacher extends Teacher{
        boolean teachOrganic;
        Chemistryteacher(String name, int age, int yearsOfExperience){
            super(name,age, yearsOfExperience);


                    System.out.println(name+" teaching chem");
                }

            }
            class PianoTeacher extends Teacher {
                String PianoTeach;

                PianoTeacher(String name, int age, int yearsOfExperience, String pianoType) {
                    super(name, age, yearsOfExperience);
                    this.pianoType = pianoType;
                }

            }}







