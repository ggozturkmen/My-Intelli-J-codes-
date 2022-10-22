package Class15;

public class Task7GRADE {


    char getGrade(int score){

        char grade;
        if(score>90){
            grade='A';

        }else if(score>80){
            grade='B';
        }else if(score>70){
            grade='C';

        }else if(score>50){
            grade='C';
        }else{
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task7GRADE task=new Task7GRADE();
        System.out.println(task.getGrade(81));
    }
    }




