package Class15;

public class PrimeSecondway {

    String method(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return "Not prime";
                } else {
                    return "Prime";
                }


            }


        }

        return null;
    }

    public static void main(String[] args) {
        PrimeSecondway input = new PrimeSecondway();
        System.out.println(input.method(8));
    }
}