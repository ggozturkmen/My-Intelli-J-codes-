package Class22;

public class WebDriverTester {

    public static void main(String[] args) {


        //Safari safari=new Safari();

        //safari.startBrowser();
        //safari.test();
        //safari.closeBrowser();

        //Chrome chorome=new Chrome();

        //chorome.startBrowser();
        //chrome.test();
       // chorome.closeBrowser();

        //WebDriver[]browsers={new Chrome()};

        WebDriver[] browsers={new Chrome(),new Safari(),new Firefox()};
        for (WebDriver browser:browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }



          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */
        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this
         */
    }
    }








