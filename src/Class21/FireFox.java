package Class21;

public class FireFox {
    void openBrowser() {
        System.out.println("opening the browser in less than 2 sec");
    }

    public static void main(String[] args) {
        Chorome chorome = new Chorome();
        chorome.openBrowser();
        chorome.closeBrowser();
    }

}
