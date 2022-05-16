package utils;

import org.openqa.selenium.By;

public class Constants {
    public static final String ITEM = "iMac";

    public static final By ACCOUNT_PAGE_CONTENT_TEXT_LOCATOR = By.id("content");
    public static final String ACCOUNT_PAGE_URL_CONTAINS = "account";
    public static final String ACCOUNT_PAGE_CONTAINS_TEXT = "My Account";

    public static final By SUCCESS_PAGE_CONTENT_LOCATOR = By.id("content");
    public static final String SUCCESS_PAGE_URL_CONTAINS = "success";
    public static final String SUCCESS_PAGE_CONTAINS_TEXT = "Your Account Has Been Created!";

    public static final String SHOPPING_CART_PAGE_URL_CONTAINS = "checkout";
    public static final String SHOPPING_CART_PAGE_CONTAINS_TEXT = "Shopping Cart";
    public static final By SHOPPING_CART_PAGE_SHOPPING_CART_TITLE_LOCATOR = By.xpath("//div[@id='content']/h1");

    public static final String REGISTER_PAGE_URL_CONTAINS = "register";
}
