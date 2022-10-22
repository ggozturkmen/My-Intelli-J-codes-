package Class17;

public class Task1Sum {

    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.


    double sumArray(int[]arr){
        double sum=0;
        for(int num:arr){
            sum+=num;
        }

        return sum;
    }

    public static void main(String[] args) {

        Task1Sum task=new Task1Sum();
        int[]array={10,10,20,30,};
        System.out.println(task.sumArray(array));
    }
}