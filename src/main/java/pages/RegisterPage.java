package pages;

import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class RegisterPage {

    private static final By FIRST_NAME_FIELD_LOCATOR = By.xpath("//input[@name='firstname']");
    private static final By LAST_NAME_FIELD_LOCATOR = By.xpath("//input[@name='lastname']");
    private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@name='email']");
    private static final By PHONE_FIELD_LOCATOR = By.xpath("//input[@name='telephone']");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@name='password']");
    private static final By CONFIRM_PASSWORD_FIELD_LOCATOR = By.xpath("//input[@name='confirm']");
    private static final By NEWSLETTER_CHECKBOX_LOCATOR = By.xpath("//input[@name='newsletter'][@value='1']");
    private static final By PRIVACY_POLICY_LOCATOR = By.xpath("//input[@name='agree'][@value='1']");
    private static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//input[@value='Continue']");

    public static void fillingPersonalDataDetailSection(String firstname, String lastname, String email, String telephone) {
        getDriver().findElement(FIRST_NAME_FIELD_LOCATOR).sendKeys(firstname);
        getDriver().findElement(LAST_NAME_FIELD_LOCATOR).sendKeys(lastname);
        getDriver().findElement(EMAIL_FIELD_LOCATOR).sendKeys(email);
        getDriver().findElement(PHONE_FIELD_LOCATOR).sendKeys(telephone);
    }

    public static void fillingPasswordSection(String password) {
        getDriver().findElement(PASSWORD_FIELD_LOCATOR).sendKeys(password);
        getDriver().findElement(CONFIRM_PASSWORD_FIELD_LOCATOR).sendKeys(password);
    }

    public static void fillingNewsletterSection() {
        getDriver().findElement(NEWSLETTER_CHECKBOX_LOCATOR).click();
    }

    public static void privacyPolicyCheckBox() {
        getDriver().findElement(PRIVACY_POLICY_LOCATOR).click();
    }

    public static void clickContinueButton() {
        getDriver().findElement(CONTINUE_BUTTON_LOCATOR).click();
    }
}
