package test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest extends BaseTest {


    @Test
    public void validLoginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.goToWeb();
        loginPage.loginInput("imamutamasetya@gmail.com", "Imamutama15");

    }

    //    @Test
//    public void testMobile1() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
////        caps.setCapability("platformName","ANDROID");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-J730G");
//        caps.setCapability(MobileCapabilityType.UDID,"52006084fe18840b");
//        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
//        caps.setCapability("app","C:\\Users\\Imam Setya Utama\\Ecommerce_v1_0_29.apk");
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        modriver= new AppiumDriver<MobileElement>(url, caps);
//
//        MobileElement setTextUsername = modriver.findElementByName("Email or Mobile Number");
//        MobileElement setClick = modriver.findElementById("com.transretail.ecomerce:id/btnLogin");
//        MobileElement setTextPassword = modriver.findElementByName("Password");
//
//        setTextUsername.sendKeys("imamutamasetya@gmail.com");
//        setClick.click();
//        Thread.sleep(3000);
//        setTextPassword.sendKeys("Imamutama15");
//        setClick.click();
//
//    }
//    @Test
//    public void testMobile2() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
////        caps.setCapability("platformName","ANDROID");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-J730G");
//        caps.setCapability(MobileCapabilityType.UDID, "52006084fe18840b");
//        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//        caps.setCapability("app", "C:\\Users\\Imam Setya Utama\\Ecommerce_v1_0_29.apk");
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        modriver = new AppiumDriver<MobileElement>(url, caps);
//
//        MobileElement setTextUsername = modriver.findElementByName("Username");
//        MobileElement setClick = modriver.findElementById("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]");
//        MobileElement setTextPassword = modriver.findElementByName("Password");
//        MobileElement setVerifyText = modriver.findElementById("");
//
//        setTextUsername.sendKeys("imamutamasetya@gmail.com");
//        setClick.click();
//        Thread.sleep(3000);
//        setTextPassword.sendKeys("Imamutama15");
//        setClick.click();
//        if (setVerifyText.getText().equals("ORD 203")) {
//            System.out.println("Data Matching");
//        } else {
//            System.out.println("Data tidak matching");
//        }
//
//    }
}




