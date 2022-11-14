package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchHomePage extends BasePage {

    public GoogleSearchHomePage (WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://www.google.com/";

    @FindBy(xpath="//*[@class='gLFyf gsfi']")
	private WebElement searchBoxElement;

    public void goToUrl (){
        driver.get(baseURL); //Go to url
    }
    
    public GoogleResultsPage doASearch(String textToSearch) {
    	searchBoxElement = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")); //FIXME
    	waitUntilElementClickable(searchBoxElement);
    	writeText(searchBoxElement, textToSearch);
    	pressEnter(searchBoxElement);
    	return new GoogleResultsPage(driver);
    }

}