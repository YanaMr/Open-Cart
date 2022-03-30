package helpers;

import pages.HomePage;
import pages.ProductPage;
import pojo.ProductData;

import static utils.Constants.ITEM;

public class AddItemToCartHelper {
    private static final HomePage homePage = new HomePage();
    private static final ProductPage productPage = new ProductPage();


    public static ProductData addProductToCart(String item) {
        homePage
                .searchForProduct(item);
//                .goToProductPage();
        ProductData productData = new ProductData();
        productData.setProductName(productPage.getProductName());
        productData.setProductAmount(productPage.getProductAmount());
        productData.setProductTotalPrice(productPage.getProductPrice() * productData.getProductAmount());
        productPage
                .addProductToCart()
                .viewCart();
        return productData;
    }

    public static ProductData addDefaultProductToCart() {
        return addProductToCart(ITEM);
    }
}