package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static utils.DriverHolder.getDriver;

public class SearchPage {

    private static final By CATEGORY_LOCATOR = By.xpath("//select[@name='category_id']");
    private static final By SEARCH_BUTTON_LOCATOR = By.id("button-search");
    private static final By ITEMS_LIST_LOCATOR = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']");
    private static final By WISH_LIST_LOCATOR = By.xpath("//button[@data-original-title='Add to Wish List']");

    public SearchPage chooseCategory(String item) {
        getDriver().findElement(CATEGORY_LOCATOR).click();
        getDriver().findElement(By.xpath((String.format("//option[@value][contains(text(),'%s')]", item)))).click();
        getDriver().findElement(SEARCH_BUTTON_LOCATOR).click();
        return this;
    }

    public SearchPage checkAmount(int amount) {
        Assertions.assertEquals(getDriver().findElements(ITEMS_LIST_LOCATOR).size(), amount);
        return this;
    }

    public SearchPage clickItem(int item) {
        getDriver().findElements(ITEMS_LIST_LOCATOR).get(item).click();
        return this;
    }

    public SearchPage addItemToWishList() {
        getDriver().findElement(WISH_LIST_LOCATOR).click();
        return this;
    }
}
