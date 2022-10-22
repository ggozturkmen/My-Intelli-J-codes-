package Class15;

import java.util.Scanner;

public class Task1LargerNumber {

    void printLarger(int num1, int num2){
        if(num1>num2){
            System.out.println("Number 1 is larger" + num1);
        }else if(num2>num1){
            System.out.println("Number 2 is larger "+ num2);
        }else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter the first number");
        int num2= scanner.nextInt();
        Task1LargerNumber task1=new Task1LargerNumber();
        task1.printLarger(num1,num2);

    }
}
