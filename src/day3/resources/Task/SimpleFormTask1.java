package day3.resources.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormTask1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/EsraOzturk/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:/Users/EsraOzturk/Desktop/IdeaProjects/seleniumm/src/day3/resources/form.html");

    }
}
