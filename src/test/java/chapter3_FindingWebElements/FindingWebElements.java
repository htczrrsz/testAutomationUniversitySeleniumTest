package chapter3_FindingWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingWebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        Thread.sleep(2000);

        WebElement menuElement= driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();
        Thread.sleep(2000);

        List<WebElement> menuElementList = driver.findElements(By.tagName("li"));
        System.out.println("menuElementList.size() = " + menuElementList.size());

        Thread.sleep(2000);
        driver.close();






    }
}
