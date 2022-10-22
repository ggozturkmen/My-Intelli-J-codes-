package Day19;

 interface FirstInterface {

     void FirstMethod();
     void SecondMethod();
    }


 class SecondInterface implements FirstInterface{

     @Override
     public void FirstMethod() {
         System.out.println("Second Method implementing multiple Inheritance");
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
