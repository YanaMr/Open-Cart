package helpers;

import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.DriverHolder.getDriver;

public class AssertionHelper {

    public static void checkPageIsCorrect(String urlContains, By locator, String containsText) {
        assertThat(getDriver().getCurrentUrl(), containsString(urlContains));
        assertThat(getDriver().findElement(locator).getText(), containsString(containsText));
    }

    public static void checkPageUrlIsCorrect(String text) {
        assertThat(getDriver().getCurrentUrl(), containsString(text));
    }

    public static void checkTextIsCorrect(By locator, String text) {
        assertThat(getDriver().findElement(locator).getText(), containsString(text));
    }

    public static void expectedTextIsPresented(By locator, String text) {
        assertThat(getDriver().findElement(locator).getText(), containsString(text));
    }
}
