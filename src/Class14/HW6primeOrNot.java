package Class14;

public class HW6primeOrNot {

    boolean prime(int num) {

        boolean isPrime = true;
        if (num > 1) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            }else{
                isPrime = false;
            }
        return isPrime;
        }

        public static void main (String[]args){
            HW6primeOrNot number = new HW6primeOrNot();
            System.out.println(number.prime(11));


        }
    }




