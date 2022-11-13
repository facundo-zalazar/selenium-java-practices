package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleResultsPage extends GoogleSearchHomePage{
	
    public GoogleResultsPage (WebDriver driver) {
        super(driver);
    }

    public void verifySearch(String textToSearch)  {
    	String replaceSpaceWithPlus = textToSearch.replaceAll("\\s+","+");
    	String currentUrl = driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl.contains("search?q="+replaceSpaceWithPlus), "The search has not been triggered.");
    }

}
