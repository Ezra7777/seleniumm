package Day9.HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeEnabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.manage().window().maximize();
        driver.findElement( By.xpath("//*[@id=\"input-example\"]/button")) .click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"message\"]" )));
            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }

        String message= driver.findElement(By.id("message")).getText();

        if(message.equals("It's enabled!")){
            System.out.println("succes message is displayed");
        }else
            System.out.println(" message is not displayed");


        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 5);
        try {
            wait2.until( ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"message\"]" )));
            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }
        String message2= driver.findElement(By.id("message")).getText();

        if(message2.equals("It's disabled!")){
            System.out.println("succes message2 is displayed");
        }else
            System.out.println(" message is not displayed");

    }


}