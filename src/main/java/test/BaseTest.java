package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Set;

public class BaseTest {
    public WebDriver driver;
    AppiumDriver<MobileElement> modriver;
    String drivePath = "D:\\SOFTWARE\\chromedriver.exe";

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", drivePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Set<Cookie> allCookies = driver.manage().getCookies();
//        for(Cookie cookie : allCookies)
//        {
//            System.out.println(cookie);
//        }
//
    }

    @AfterClass
    public void closedown(){

        driver.quit();
    }
}
