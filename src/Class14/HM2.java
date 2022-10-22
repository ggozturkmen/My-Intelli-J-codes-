package Class14;

public class HM2 {

    void EvenOrOdd(int number){

        if(number%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        HM2 num=new HM2();
        num.EvenOrOdd(49);
    }
}
