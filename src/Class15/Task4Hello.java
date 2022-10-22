package Class15;

public class Task4Hello {

    void sayHello(String country){

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        Task4Hello task=new Task4Hello();
        task.sayHello("USA");
    }
}
