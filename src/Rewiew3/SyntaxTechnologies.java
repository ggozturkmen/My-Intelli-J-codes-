package Rewiew3;

public class SyntaxTechnologies {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void displayMethod(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}



