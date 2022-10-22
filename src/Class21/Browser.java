package Class21;

public class Browser {


    void openBrowser(){
        System.out.println("Opening a Brwser");
    }
    void navigate(){
        System.out.println("opemimg the url");
    }

    void test(){
        System.out.println("testing the webpage");

    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }


}

class Chorome extends Browser{
    void openBrowser(){
        System.out.println("opening the browser in less than 1 sec");
    }


}
