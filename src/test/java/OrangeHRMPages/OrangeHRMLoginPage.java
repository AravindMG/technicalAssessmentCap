package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
    WebDriver driver;
    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By login = By.id("btnLogin");

    public OrangeHRMLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(){
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(login).click();
    }
}
