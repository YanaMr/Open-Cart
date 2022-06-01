package pages;

import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class LoginPage {
    private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@name='email']");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@value='Login']");

    public static void insertCustomerData(String email, String password) {
        getDriver().findElement(EMAIL_FIELD_LOCATOR).sendKeys(email);
        getDriver().findElement(PASSWORD_FIELD_LOCATOR).sendKeys(password);
        getDriver().findElement(LOGIN_BUTTON_LOCATOR).click();
    }
}
