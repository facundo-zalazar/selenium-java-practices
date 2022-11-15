package com.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.utils.BaseUiComponent;

public class BasePage extends BaseUiComponent {

    public final WebDriver driver;
    public final int DEFAULT_TIMEOUT = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    
    //Only for elements
    public void waitUntilElementVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(DEFAULT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(DEFAULT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    
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
