package pages;


import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import static utils.DriverHolder.getDriver;

public class AccountPage {

    private static final By CONTENT_TEXT_LOCATOR = By.id("content");
    private static final String URL_CONTAINS = "account";
    private static final String CONTAINS_TEXT = "My Account";

    public void checkPageIsCorrect() {
//        Assertions.assertTrue(getDriver().getCurrentUrl().contains(URL_CONTAINS), "URLs are not equal");
//        Assertions.assertTrue(getDriver().findElement(CONTENT_TEXT_LOCATOR).getText().contains(CONTAINS_TEXT));
        assertThat(getDriver().getCurrentUrl(), containsString(URL_CONTAINS));
        assertThat(getDriver().findElement(CONTENT_TEXT_LOCATOR).getText(), containsString(CONTAINS_TEXT));
    }
}
