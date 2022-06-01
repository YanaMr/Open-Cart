package pages;


import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class HomePage {

    private static final By MY_ACCOUNT_LOCATOR = By.xpath("//a[@title='My Account']");
    private static final By REGISTER_LOCATOR = By.xpath("//a[contains(text(),'Register')]");
    private static final By LOGIN_LOCATOR = By.xpath("//a[contains(text(),'Login')]");
    private static final By SEARCH_LOCATOR = By.xpath("//input[@name='search']");
    private static final By SEARCH_BUTTON_LOCATOR = By.xpath("//div[@id='search']/span/button[@type='button']");
    private static final By PRODUCT_PAGE_LOCATOR = By.xpath("//div[@class='product-thumb']/div/div/h4/a");
    private static final By WISH_LIST_LOCATOR = By.xpath("//a[@title='Wish List (1)']");

    public static void navigateToRegisterPage() {
        getDriver().findElement(MY_ACCOUNT_LOCATOR).click();
        getDriver().findElement(REGISTER_LOCATOR).click();
    }

    public static void navigateToLoginPage() {
        getDriver().findElement(MY_ACCOUNT_LOCATOR).click();
        getDriver().findElement(LOGIN_LOCATOR).click();
    }

    public static void navigateToWishList() {
        getDriver().findElement(WISH_LIST_LOCATOR).click();
    }

    public static void searchForProduct(String item) {
        getDriver().findElement(SEARCH_LOCATOR).sendKeys(item);
        getDriver().findElement(SEARCH_BUTTON_LOCATOR).click();
        getDriver().findElement(PRODUCT_PAGE_LOCATOR).click();
    }
}
