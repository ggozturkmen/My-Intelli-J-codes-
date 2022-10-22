package Class14;

public class MethodDemo1 {

    void printHello() {

        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");


    }

    void printWord(String word) {
        System.out.println(word);
    }
        public static void main (String[]args){
            MethodDemo1 obj = new MethodDemo1();
            obj.printHello();
            obj.printWord("do not worry its Java");
            obj.printWord("No athira it does not make sense i am confused can you please repeat ");

        }
    }
