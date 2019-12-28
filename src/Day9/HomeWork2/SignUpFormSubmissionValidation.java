package Day9.HomeWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFormSubmissionValidation {
    /**
     * open SignUpForm.html
     * store values that you will use inside some Strings
     * fill in your data inside the all input elements using Strings above
     * submit the form
     * get URL
     * parse values that was submitted
     * validate parsed values with stored values above
     */
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://localhost:63342/someUrl?text=Ezra&password=12345&password+repeat=1234512345&female=female&select=option+3&agreement=on" );
        driver.manage().window().maximize();







    }
}

