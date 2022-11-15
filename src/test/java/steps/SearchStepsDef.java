package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUiComponent;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleResultsPage;
import pages.GoogleSearchHomePage;
import selenium.BaseTest;

public class SearchStepsDef extends BaseTest {

	private String keyToSearch = "";
	GoogleSearchHomePage searchPage;
	GoogleResultsPage resultsPage;

    @Before
    public void spinUpDriver() {
    	driver  = new ChromeDriver();
        driver.manage().window().maximize();
        BaseUiComponent.setDriver(driver);
    }

	@Given("I am in the google.com webpage")
	public void i_am_in_the_google_com_webpage() {
		searchPage = pages().getGoogleSearchHomePage();
		searchPage.goToUrl();
	}

	@When("I enter a {string} and press Enter key")
	public void i_enter_a_and_press_enter_key(String text) {
		searchPage = pages().getGoogleSearchHomePage();
		keyToSearch = text;
		searchPage.doASearch(keyToSearch);
	}

	@Then("I should be in the correct results page")
	public void i_should_be_in_the_correct_results_page() {
		resultsPage = pages().getGoogleResultsPage();
		resultsPage.verifySearch(keyToSearch);
	}
	
    @After
    public void killDriver() {
        driver.quit();
    }

}
