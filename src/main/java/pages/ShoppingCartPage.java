package pages;

import helpers.Wait;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pojo.ProductData;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverHolder.getDriver;

public class ShoppingCartPage {
    Wait wait = new Wait();
    private static final By PRODUCT_NAME_LOCATOR = By.xpath("//div[@class='table-responsive']/table/tbody/TR/td[@class='text-left'][1]/a");
    private static final By PRODUCT_PRICE_LOCATOR = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[4]/td[@class='text-right'][2]");
    private static final By PRODUCT_AMOUNT_LOCATOR = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td/div/input");
    //    private static final By CHECKOUT_BUTTON_LOCATOR = By.xpath("//a[@class='btn btn-primary']");
//    private static final By SHOPPING_CART_LOCATOR = By.xpath("//a[@class='btn btn-primary']");
    private static final String URL_CONTAINS = "checkout";
    private static final String CONTAINS_TEXT = "Shopping Cart";
    private static final By SHOPPING_CART_TITLE_LOCATOR = By.xpath("//div[@id='content']/h1");
    private static final By PRODUCT_CONTAINER_LOCATOR = By.xpath("//div[@class='table-responsive']/table[@class='table table-bordered']");

//    public ShoppingCartPage goToShoppingCart() {
//        getDriver().findElement(SHOPPING_CART_LOCATOR).click();
//        return this;
//    }
//
//    public ShoppingCartPage checkOut() {
//        getDriver().findElement(CHECKOUT_BUTTON_LOCATOR).click();
//        return this;
//    }

    public ShoppingCartPage checkPageIsCorrect() {
        wait.waitForPageToLoad();
        Assertions.assertTrue(getDriver().getCurrentUrl().contains(URL_CONTAINS), "URLs are not equal");
        Assertions.assertTrue(getDriver().findElement(SHOPPING_CART_TITLE_LOCATOR).getText().contains(CONTAINS_TEXT));
        return this;
    }

    public ShoppingCartPage checkProducts(List<ProductData> expectedProductData) {
        assertTrue(getCartProducts().size() == expectedProductData.size()
                && getCartProducts().containsAll(expectedProductData));
        return this;
    }

    public List<ProductData> getCartProducts() {
        List<ProductData> products = new ArrayList<>();
        for (WebElement element : getDriver().findElements(PRODUCT_CONTAINER_LOCATOR)) {
            ProductData productData = new ProductData();
            productData.setProductName(element.findElement(PRODUCT_NAME_LOCATOR).getText());
            productData.setProductTotalPrice(Double.parseDouble(element.findElement(PRODUCT_PRICE_LOCATOR).getText().substring(1)));
            productData.setProductAmount(Integer.parseInt(element.findElement(PRODUCT_AMOUNT_LOCATOR).getAttribute("value")));
            products.add(productData);
        }
        return products;
    }
}
