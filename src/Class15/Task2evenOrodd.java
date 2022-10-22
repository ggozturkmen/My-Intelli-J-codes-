package Class15;

public class Task2evenOrodd {

    void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        Task2evenOrodd task = new Task2evenOrodd();
        task.printEvenOdd(45);
        task.printEvenOdd(50);


    }

}