package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
    private WebDriver driver;

    public void setUp(){
        driver = new SafariDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }

    public static void main(String[] args) {
        SafariTest test = new SafariTest();
        test.setUp();
    }


//    we should permit to automation for safari

        }











