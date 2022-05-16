package pages;


import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class AccountPage {
    public static final By ACCOUNT_PAGE_CONTINUE_BUTTON_LOCATOR = By.xpath("//a[@class='btn btn-primary']");

    public AccountPage navigateTo() {
        getDriver().findElement(ACCOUNT_PAGE_CONTINUE_BUTTON_LOCATOR).click();
        return this;
    }

}
