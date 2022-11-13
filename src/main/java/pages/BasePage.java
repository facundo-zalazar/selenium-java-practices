package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage extends PageGenerator {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    
    //Only for elements
    public void writeText (WebElement element, String text) {
        element.sendKeys(text);
    }

    public void pressEnter (WebElement element) {
    	element.sendKeys(Keys.ENTER);	
    }

    public void isVisible(WebElement element) {
    	Assert.assertTrue(element.isDisplayed(), "Element is not displayed after timeout"); //Check if element is displayed
    }
}
