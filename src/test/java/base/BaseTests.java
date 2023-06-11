package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver","/Users/hatice/Desktop/chromedriver" );
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setPosition(new Point(0,-990));

//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375,812));

        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        BaseTests test = new BaseTests();
        test.setUp();
    }

}
