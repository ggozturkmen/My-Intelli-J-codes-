package Class14;

public class HM6Grade {

    char getGrade(int score) {
    char grade=0;
        if (score > 90) {
            System.out.println("Your grade is A");
        } else if (score > 80&& score<90) {
            System.out.println("Your grade is B");
        } else if (score > 70&& score<80) {
            System.out.println("Your grade is C");
        } else if (score > 50&&score<70) System.out.println("Your grade is D");
        else {
            System.out.println("Your grade is F");
        }

return grade;
    }
    public static void main(String[] args) {
        HM6Grade student= new HM6Grade();
        student.getGrade(87);

    }
}
