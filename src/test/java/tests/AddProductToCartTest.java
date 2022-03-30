package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.ShoppingCartPage;
import pojo.ProductData;

import java.util.Collections;
import java.util.List;

import static helpers.AddItemToCartHelper.addDefaultProductToCart;

public class AddProductToCartTest extends BaseTest {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void addToCartTest() {
        ProductData productData = addDefaultProductToCart();
        List<ProductData> expectedProduct = Collections.singletonList(productData);
        shoppingCartPage
                .checkPageIsCorrect()
                .checkProducts(expectedProduct);

    }
}
