package com.pages.utils;

import org.openqa.selenium.WebDriver;

public class BaseUiComponent {

    protected static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BaseUiComponent.driver = driver;
    }

    protected PageProvider pages() {
       return new PageProvider(driver);
    }

}