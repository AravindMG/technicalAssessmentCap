package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMAdminPage {
    WebDriver driver;
    By admin = By.xpath("//*[@class='main-menu-first-level-list-item']//*[text()='Admin']");
    By addUser = By.id("btnAdd");
    By empName = By.id("systemUser_employeeName_empName");
    By sysUserName = By.id("systemUser_userName");
    By sysUserPwd = By.id("systemUser_password");
    By sysUserPwdConfirm = By.id("systemUser_confirmPassword");
    By save = By.id("btnSave");

    public OrangeHRMAdminPage(WebDriver driver){
        this.driver = driver;
    }

    public void addNewUser(){
        driver.findElement(admin).click();
        driver.findElement(addUser).click();
        driver.findElement(empName).sendKeys("Aaliyah Haq");
        driver.findElement(sysUserName).sendKeys("Aaliyah");
        driver.findElement(sysUserPwd).sendKeys("admin123");
        driver.findElement(sysUserPwdConfirm).sendKeys("admin123");
        driver.findElement(save).click();
    }
}
