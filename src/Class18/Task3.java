package Class18;

public class Task3 {

    private Task3(){
        System.out.println("private");
    }
   Task3(String name){
       System.out.println("Default");
   }
   protected Task3(int age){
       System.out.println("Protected");
   }
   public Task3(boolean Istrue){
       System.out.println("Public");
   }

    public static void main(String[] args) {
        new Task3();
        new Task3("Thanks");
        new Task3(9);
        new Task3(true);
    }
}
