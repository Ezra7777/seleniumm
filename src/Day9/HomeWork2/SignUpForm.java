package Day9.HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpForm {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:/Users/EsraOzturk/IdeaProjects/seleniumm/src/Day9/HomeWork1/SignUpForm.html");


        WebElement element = driver.findElement(By.name("text"));
        element.sendKeys("Ezra");
        System.out.println(element.getAttribute("type"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password ");
        System.out.println(element.getAttribute("type"));
        WebElement password1 = driver.findElement(By.name("password repeat"));
        password1.sendKeys("password repeat");
        System.out.println(element.getAttribute("type"));
        WebElement textarea = driver.findElement(By.name("textarea"));
        textarea.sendKeys("textarea");

        WebElement checkbox = driver.findElement(By.name("radio"));
        checkbox.click();
        List<WebElement> radio = driver.findElements(By.name("radio"));
        // [0, 1, 2].click
        WebElement secondElementOfRadio = radio.get(1);
        secondElementOfRadio.click();

        WebElement checkbox1 = driver.findElement(By.name("agreement"));
        checkbox1.click();
        WebElement SubmitButton = driver.findElement( By.id( "submit" ) );
        SubmitButton.click();
    }
    }





