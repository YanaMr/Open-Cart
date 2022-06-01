//package tests;
//
//import base.BaseTest;
//import helpers.AssertionHelper;
//import org.junit.jupiter.api.Test;
//import pages.ShoppingCartPage;
//import pojo.ProductData;
//
//import java.util.Collections;
//import java.util.List;
//
//import static helpers.AddItemToCartHelper.addDefaultProductToCart;
//import static utils.Constants.*;
//
//public class AddProductToCartTest extends BaseTest {
//    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
//    AssertionHelper assertionHelper = new AssertionHelper();
//
//    @Test
//    public void addToCartTest() {
//        ProductData productData = addDefaultProductToCart();
//        List<ProductData> expectedProduct = Collections.singletonList(productData);
//        assertionHelper
//                .checkPageIsCorrect(SHOPPING_CART_PAGE_URL_CONTAINS, SHOPPING_CART_PAGE_SHOPPING_CART_TITLE_LOCATOR, SHOPPING_CART_PAGE_CONTAINS_TEXT);
//        shoppingCartPage
//                .checkProducts(expectedProduct);
//
//    }
//}
