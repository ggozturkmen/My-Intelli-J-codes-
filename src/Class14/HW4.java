package Class14;

public class HW4 {

    void Name(String country){
        if(country.equals("Turkey")){
            System.out.println("Merhaba");
        }else if(country.equals("USA")){
            System.out.println("Hi");
        }else if(country.equals("Mexica")){
            System.out.println("Hola");
        }else{
            System.out.println("Unknown");
        }
    }

    public static void main(String[] args) {
        HW4 obj=new HW4();
        obj.Name("Turkey");
    }
}
