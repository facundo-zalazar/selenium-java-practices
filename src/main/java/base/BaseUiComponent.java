package base;

import org.openqa.selenium.WebDriver;

public class BaseUiComponent {

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BaseUiComponent.driver = driver;
    }

    protected PageProvider pages() {
       return new PageProvider(driver);
    }

}