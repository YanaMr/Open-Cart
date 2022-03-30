package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class AccountPage {

    private static final By CONTENT_TEXT_LOCATOR = By.id("content");
    private static final String URL_CONTAINS = "account";
    private static final String CONTAINS_TEXT = "My Account";

    public void checkPageIsCorrect() {
        Assertions.assertTrue(getDriver().getCurrentUrl().contains(URL_CONTAINS), "URLs are not equal");
        Assertions.assertTrue(getDriver().findElement(CONTENT_TEXT_LOCATOR).getText().contains(CONTAINS_TEXT));
    }
}
