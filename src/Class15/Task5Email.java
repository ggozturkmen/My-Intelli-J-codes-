package Class15;

public class Task5Email {

    String createEmail(String firstName,String lastName,String emailType) {

return (firstName+lastName+"@"+emailType+".com").toLowerCase();

    }

    public static void main(String[] args) {
        Task5Email task=new  Task5Email();

    }
}
