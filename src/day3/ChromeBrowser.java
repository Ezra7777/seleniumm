package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/EsraOzturk/IdeaProjects/seleniumm/src/day3/resources/form.html");

        WebElement element = driver.findElement(By.name("text"));
        element.sendKeys("This is my text");
        System.out.println(element.getAttribute("type"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        WebElement textarea = driver.findElement(By.name("textarea"));
        textarea.sendKeys("textarea");
        WebElement checkbox = driver.findElement(By.name("checkbox"));
        checkbox.click();
        List<WebElement> radio = (List<WebElement>) driver.findElements(By.name("radio"));
        WebElement secondElementOfRadio = radio.get(1);
        WebElement thirdElementOfRadio = radio.get(2);
        secondElementOfRadio.click();
        thirdElementOfRadio.click();


        WebElement select = driver.findElement(By.name("select"));
        //select for drop down
        Select dropdown = new Select(select);
        //(   dropdown.selectByIndex(1);

        List<WebElement> options = dropdown.getOptions();
        for (WebElement element1 : options) {
            if (element.getText().equals("Option 4"))
                dropdown.selectByVisibleText("Option 4");


        }
        System.out.println(element.getAttribute("value"));
        System.out.println(password.getAttribute("value"));
        System.out.println(textarea.getAttribute("value"));
        System.out.println(secondElementOfRadio.getAttribute("value"));
        System.out.println(checkbox.getAttribute("value"));
        System.out.println(select.getAttribute("value"));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

       String currentUrl1 =driver.getCurrentUrl();
        System.out.println(currentUrl1);

    }
}