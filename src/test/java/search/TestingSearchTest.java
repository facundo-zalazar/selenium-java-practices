package search;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GoogleSearchHomePage;
import pages.GoogleResultsPage;

public class TestingSearchTest extends BaseTest {

    @Test
    public void googleSearchTest_TestingWordandPressEnter() throws InterruptedException {
    	String term = "testing";
        page.GetInstance(GoogleSearchHomePage.class).goToUrl();
        page.GetInstance(GoogleSearchHomePage.class).doASearch(term);
        page.GetInstance(GoogleResultsPage.class).verifySearch(term);
    }

}
