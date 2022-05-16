package helpers;

import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.DriverHolder.getDriver;

public class AssertionHelper {

    public void checkPageIsCorrect(String urlContains, By locator, String containsText) {
        assertThat(getDriver().getCurrentUrl(), containsString(urlContains));
        assertThat(getDriver().findElement(locator).getText(), containsString(containsText));
    }

    public void checkPageUrlIsCorrect(String text) {
        assertThat(getDriver().getCurrentUrl(), containsString(text));
    }
}
