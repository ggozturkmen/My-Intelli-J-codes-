package Class15;

public class Task3Palindrome {

    void printPalindrome(String str){
        StringBuilder word2= new StringBuilder(str);
        if (str.equalsIgnoreCase(word2.reverse().toString())){
            System.out.println(str+ " is a plaindrome");
        }else{System.out.println(str + " is not a plaindrome");
        }
    }

    public static void main(String[] args) {
        Task3Palindrome task=new Task3Palindrome();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
    }
    }

