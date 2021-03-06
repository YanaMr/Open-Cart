package utils;

import org.openqa.selenium.By;

public class Constants {
    public static final String ITEM = "iMac";
    public static final String EMAIL = "bruce.wayne@gotham.com";
    public static final String INVALID_EMAIL = "superman@gotham.com";
    public static final String PASSWORD = "IAmTheBatman";
    public static final String INVALID_PASSWORD = "IAmTheSuperman";

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

    public static final String LOGIN_PAGE_URL_CONTAINS = "login";

    public static final By WISH_LIST_TEXT_LOCATOR = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public static final String WISH_LIST_SUCCESS_TEXT_CONTAINS = "Success: You have added " + ITEM + " to your wish list";
    public static final By WISH_LIST_SUCCESS_TEXT_LOCATOR = By.xpath("//tbody/tr/td[@class='text-left']");

    public static final By EMPTY_CART_TEXT_LOCATOR = By.xpath("//div[@id='content']/p");
    public static final String EMPTY_CART_TEXT_CONTAINS = "Your shopping cart is empty!";

    public static final By NO_MATCH_EMAIL_PASSWORD_TEXT_LOCATOR = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    public static final String NO_MATCH_EMAIL_PASSWORD_TEXT_CONTAINS = "Warning: No match for E-Mail Address and/or Password.";

}
