package pages;

import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class ProductPage {

    private static final By CART_LOCATOR = By.id("cart");
    private static final By ADD_PRODUCT_LOCATOR = By.id("button-cart");
    private static final By CHECK_OUT_LOCATOR = By.xpath("//p/a[contains(@href, 'route=checkout/cart')]");
    private static final By PRODUCT_NAME_LOCATOR = By.xpath("//div/div[@class='col-sm-4']/h1");
    private static final By PRODUCT_AMOUNT_LOCATOR = By.xpath("//div[@id='product']/div/input[@type='text']");
    private static final By PRODUCT_PRICE_LOCATOR = By.xpath("//div/div[@class='col-sm-4']/ul/li/h2");

    public ProductPage addProductToCart() {
        getDriver().findElement(ADD_PRODUCT_LOCATOR).click();
        return this;
    }

    public void viewCart() {
        getDriver().findElement(CART_LOCATOR).click();
        getDriver().findElement(CHECK_OUT_LOCATOR).click();
    }

    public String getProductName() {
        return getDriver().findElement(PRODUCT_NAME_LOCATOR).getText();
    }

    public int getProductAmount() {
        return Integer.parseInt(getDriver().findElement(PRODUCT_AMOUNT_LOCATOR).getAttribute("value"));
    }

    public double getProductPrice() {
        return Double.parseDouble(getDriver().findElement(PRODUCT_PRICE_LOCATOR).getText().substring(1));
    }
}
