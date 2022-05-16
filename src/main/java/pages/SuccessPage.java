package pages;

import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class SuccessPage {

    private static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//a[@class='btn btn-primary']");

    public SuccessPage navigateTo() {
        getDriver().findElement(CONTINUE_BUTTON_LOCATOR).click();
        return this;
    }
}
