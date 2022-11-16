package com.StepsDef;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.GoogleResultsPage;
import com.pages.GoogleSearchHomePage;
import com.pages.utils.BaseUiComponent;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepsDef extends BaseUiComponent {

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
	public void iAmInTheGoogleDotComWebpage() {
		searchPage = pages().getGoogleSearchHomePage();
		searchPage.goToUrl();
	}

	@When("I enter a {string} and press Enter key")
	public void iEnterAStringAndPressEnterKey(String text) {
		searchPage = pages().getGoogleSearchHomePage();
		keyToSearch = text;
		searchPage.doASearch(keyToSearch);
	}

	@Then("I should be in the correct results page")
	public void iShouldBeInTheCorrectResultsPage() {
		resultsPage = pages().getGoogleResultsPage();
		resultsPage.verifySearch(keyToSearch);
	}
	
    @After
    public void killDriver() {
        driver.quit();
    }

}
