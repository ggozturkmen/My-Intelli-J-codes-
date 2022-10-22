package Class15;

public class Task5primeOrnot {
    /*Write a method to return whether given number is prime or not?*/
    boolean isPrime(int num){
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Task5primeOrnot  task6=new Task5primeOrnot();
        System.out.println(task6.isPrime(12));
        System.out.println(task6.isPrime(5));
    }
}





