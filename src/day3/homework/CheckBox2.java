package day3.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // Check the Multiple Checkbox and check the button message
    // When you check all the checkboxes, button message will change to 'Uncheck All'
    // When you uncheck at least one checkbox, button message will change to 'Check All'
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkbox = driver.findElement(By.id("check1"));
        checkbox.click();

        WebElement message = driver.findElement(By.id("check1"));
        String mymassage = "Uncheck All";

        if (message.getAttribute("value").equals(mymassage)) {

            System.out.println("Success");

        } else {
            System.out.println("Fail");
        }

        WebElement checkbox1 = driver.findElement(By.id("check1"));
        checkbox.click();

        WebElement message1 = driver.findElement(By.id("check1"));
        String mymassage1 = "Check All";

        if (message1.getAttribute("value").equals(mymassage1)) {
        System.out.println("Success");

    } else{
            System.out.println("Fail");
        }

    }
}


