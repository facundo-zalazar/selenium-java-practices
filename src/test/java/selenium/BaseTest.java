package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.utils.BaseUiComponent;

public class BaseTest extends BaseUiComponent {

    protected WebDriver driver;

    @BeforeMethod
    public void spinUpDriver() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        BaseUiComponent.setDriver(driver);
    }

    @AfterMethod
    public void killDriver() {
        driver.quit();
    }
}