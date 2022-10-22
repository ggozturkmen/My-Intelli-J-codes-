package Class14;

public class HW5email {

    void CreateEmail(String name1,String name2){

        String email="@gmailcom";
        System.out.println(name1+name2+email);

    }

    public static void main(String[] args) {
        HW5email obj=new HW5email();
        obj.CreateEmail("john","snow");
    }
        }



