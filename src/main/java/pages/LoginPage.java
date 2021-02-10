package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BasePageLogin{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://alpha.transmart.co.id/";
    public LoginPage goToWeb (){
        driver.get(baseURL);
        return this;
    }
    By usernameBy = By.id("username");
    By passwordBy = By.xpath("//body/div[3]/aside[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/fieldset[1]/div[4]/div[1]/input[1]");
    By loginButtonBy = By.id("form-login");
    By tabAllCateogry = By.xpath("//span[contains(text(),'All Categories')]");
    By tabGroceries = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[1]");
    By popupclick = By.xpath("//body/div[2]/aside[2]/div[2]/footer[1]/button[1]");
    By listGroceries = By.xpath("//div[@id='narrow-by-list']");
    public LoginPage loginInput (String username, String password) throws InterruptedException {
        writeText(usernameBy,username);
        click(loginButtonBy);
        Thread.sleep(2000);
        writeText(passwordBy, password);
        click(loginButtonBy);
        Thread.sleep(5000);
        click(popupclick);
        Thread.sleep(2000);
        click(tabAllCateogry);
        click(tabGroceries);

        List<WebElement> list = driver.findElements(listGroceries);
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().contains("Halal")){
                System.out.println("tab ada");
            }else{
                System.out.println("element tidaak ada");
            }
        }
        return this;
    }

}
