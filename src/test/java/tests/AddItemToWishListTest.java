package tests;

import base.BaseTest;
import helpers.AssertionHelper;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import static utils.Constants.*;

public class AddItemToWishListTest extends BaseTest {
    HomePage homePage = new HomePage();
    AssertionHelper assertionHelper = new AssertionHelper();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void wishListTest() {
        homePage
                .navigateToLoginPage();
        loginPage
                .insertCustomerData(EMAIL, PASSWORD);
        homePage
                .searchForProduct(ITEM);
        searchPage
                .addItemToWishList();
        assertionHelper
                .checkTextIsCorrect(WISH_LIST_TEXT_LOCATOR, WISH_LIST_SUCCESS_TEXT_CONTAINS);
        homePage
                .navigateToWishList();
        assertionHelper
                .expectedTextIsPresented(WISH_LIST_SUCCESS_TEXT_LOCATOR, ITEM);

    }
}
