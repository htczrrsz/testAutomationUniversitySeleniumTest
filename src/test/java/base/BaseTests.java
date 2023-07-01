package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver","/Users/hatice/Desktop/chromedriver" );
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage= new HomePage(driver);




    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }




}
