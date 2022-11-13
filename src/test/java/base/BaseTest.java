package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.PageGenerator;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeMethod
    public void setup () {
        driver = new ChromeDriver(); //Run ChromeDriver
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //5 seconds explicit wait
        driver.manage().window().maximize(); //Window Maximized
        page = new PageGenerator(driver); //
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
