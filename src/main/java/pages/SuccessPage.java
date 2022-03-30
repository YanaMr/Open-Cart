package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class SuccessPage {

    private static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//a[@class='btn btn-primary']");
    private static final By CONTENT_LOCATOR = By.id("content");
    private static final String URL_CONTAINS = "success";
    private static final String CONTAINS_TEXT = "Your Account Has Been Created!";

    public SuccessPage checkPageIsCorrect() {
        Assertions.assertTrue(getDriver().getCurrentUrl().contains(URL_CONTAINS), "URLs are not equal");
        Assertions.assertTrue(getDriver().findElement(CONTENT_LOCATOR).getText().contains(CONTAINS_TEXT));
        getDriver().findElement(CONTINUE_BUTTON_LOCATOR).click();
        return this;
    }

//    public void clickContinueButton() {
//        getDriver().findElement(CONTINUE_BUTTON_LOCATOR).click();
//    }
}
