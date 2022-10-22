package Day19;

 interface FirstInterface {

     void secondMethod();

     void FirstMethod();

     void secondtMethod();

     void SecondMethod();
    }


 class SecondInterface implements FirstInterface{

     @Override
     public void secondMethod() {
         System.out.println("Second Method implementing multiple Inheritance");
     }

     @Override
     public void FirstMethod() {

     }

     @Override
     public void secondtMethod() {

     }

     public void SecondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");
    }

     public static void main(String[] args) {
     SecondInterface obj=new SecondInterface();
     obj.FirstMethod();
     obj.SecondMethod();
     }
        }
