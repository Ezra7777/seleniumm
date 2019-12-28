package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://the-internet.herokuapp.com/add_remove_elements/");
        clickAndValidateButtons(driver, 100);
        clickAndDeleteButton(driver, 50);

        driver.quit();
    }

    private static void clickAndValidateButtons(WebDriver driver, int num) {
        WebElement btn = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < num; i++) {
            btn.click();
        }
    }

    private static void clickAndDeleteButton(WebDriver driver, int number) {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int sizeBeforeDeleting = elements.size();

        List<WebElement> buttonsToDelete = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int counter = 0;
        for (WebElement webElement : buttonsToDelete) {
            counter++;
            if (counter > number) {
                break;
            }
            webElement.click();
        }

        List<WebElement> elementsAfter = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int sizeAfterDeleting = elementsAfter.size();

        if ((sizeBeforeDeleting - number) == sizeAfterDeleting) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
    }
}