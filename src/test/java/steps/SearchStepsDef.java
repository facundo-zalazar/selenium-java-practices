package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleResultsPage;
import pages.GoogleSearchHomePage;

public class SearchStepsDef{
	
	private WebDriver driver;
	private String keyToSearch = "";
	
    @Before
    public void spinUpDriver() {
    	driver  = new ChromeDriver();
        driver.manage().window().maximize();
        
    }

	@Given("I am in the google.com webpage")
	public void i_am_in_the_google_com_webpage() {
		GoogleSearchHomePage searchPage = new GoogleSearchHomePage(driver);
		searchPage.goToUrl();
	}

	@When("I enter a {string} and press Enter key")
	public void i_enter_a_and_press_enter_key(String text) {
		GoogleSearchHomePage searchPage = new GoogleSearchHomePage(driver);
		keyToSearch = text;
		searchPage.doASearch(keyToSearch);
	}

	@Then("I should be in the correct results page")
	public void i_should_be_in_the_correct_results_page() {
		GoogleResultsPage resultsPage = new GoogleResultsPage(driver);
		resultsPage.verifySearch(keyToSearch);
	}
	
    @After
    public void killDriver() {
        driver.quit();
    }

}
