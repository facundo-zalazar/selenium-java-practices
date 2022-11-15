package com.pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.GoogleResultsPage;
import com.pages.GoogleSearchHomePage;

public class PageProvider {

    private final WebDriver driver;

    public PageProvider(WebDriver driver) {
        this.driver = driver;
    }
    
    public GoogleResultsPage getGoogleResultsPage() {
        return PageFactory.initElements(driver, GoogleResultsPage.class);
    }
    
    public GoogleSearchHomePage getGoogleSearchHomePage() {
        return PageFactory.initElements(driver, GoogleSearchHomePage.class);
    }

}