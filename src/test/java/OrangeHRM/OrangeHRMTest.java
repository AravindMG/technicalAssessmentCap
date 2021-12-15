package OrangeHRM;

import OrangeHRMPages.OrangeHRMAdminPage;
import OrangeHRMPages.OrangeHRMLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrangeHRMTest {
    WebDriver driver;
    OrangeHRMLoginPage objOrangeHRMLoginPage;
    OrangeHRMAdminPage objOrangeHRMAdminPage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/aravind/Documents/technicalAssessmentCap/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @Test(priority = 1)
    public void navigate_to_loginpage_login(){
        objOrangeHRMLoginPage = new OrangeHRMLoginPage(driver);
        objOrangeHRMLoginPage.login();
    }

    @Test(priority = 2)
    public void adding_new_user(){
        objOrangeHRMAdminPage = new OrangeHRMAdminPage(driver);
        objOrangeHRMAdminPage.addNewUser();
    }

    @AfterTest
    public void teardown(){
        driver.close();
    }
}
