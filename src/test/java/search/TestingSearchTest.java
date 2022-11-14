package search;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GoogleSearchHomePage;
import pages.GoogleResultsPage;

public class TestingSearchTest extends BaseTest {

	@Test(description = "Search the word 'testing' on google search and check the results.")
    public void testGoogleSearch(){
    	String term = "testing";
    	GoogleSearchHomePage home_page = pages().getGoogleSearchHomePage();
    	home_page.goToUrl();
    	home_page.doASearch(term);
    	GoogleResultsPage results_page = pages().getGoogleResultsPage();
    	results_page.verifySearch(term);
    }

}
