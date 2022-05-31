package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pojo.ProductData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverHolder.getDriver;

public class ShoppingCartPage {
    public static final By REMOVE_BUTTON_LOCATOR = By.xpath("//button[@type='button'][@data-original-title='Remove']");
    private static final By PRODUCT_NAME_LOCATOR = By.xpath("//div[@class='table-responsive']/table/tbody/TR/td[@class='text-left'][1]/a");
    private static final By PRODUCT_PRICE_LOCATOR = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[4]/td[@class='text-right'][2]");
    private static final By PRODUCT_AMOUNT_LOCATOR = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td/div/input");
    private static final By PRODUCT_CONTAINER_LOCATOR = By.xpath("//div[@class='table-responsive']/table[@class='table table-bordered']");


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

    public ShoppingCartPage removeItemFromCard() throws InterruptedException {
        getDriver().findElement(REMOVE_BUTTON_LOCATOR).click();
        TimeUnit.SECONDS.sleep(2);
        return this;
    }
}
