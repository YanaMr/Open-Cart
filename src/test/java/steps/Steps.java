package steps;

import helpers.AssertionHelper;
import helpers.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import pojo.ProductData;
import utils.ScenarioContext;

import java.util.Collections;
import java.util.List;

import static helpers.AddItemToCartHelper.addDefaultProductToCart;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Constants.*;
import static utils.StringUtil.*;

public class Steps {
    ScenarioContext scenarioContext;

    public Steps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Given("User navigates to Login page")
    public void userNavigatesToLoginPage() {
        HomePage.navigateToLoginPage();
        AssertionHelper.checkPageUrlIsCorrect(LOGIN_PAGE_URL_CONTAINS);
    }

    @Then("Insert valid email and password")
    public void insertValidEmailAndPassword() {
        LoginPage.insertCustomerData(EMAIL, PASSWORD);
    }

    @And("User is able to Login")
    public void userIsAbleToLogin() {
        AssertionHelper.checkPageIsCorrect(ACCOUNT_PAGE_URL_CONTAINS, ACCOUNT_PAGE_CONTENT_TEXT_LOCATOR, ACCOUNT_PAGE_CONTAINS_TEXT);
    }

    @Given("User navigates to Account page")
    public void userNavigatesToAccountPage() {
        HomePage.navigateToRegisterPage();
        AssertionHelper.checkPageUrlIsCorrect(REGISTER_PAGE_URL_CONTAINS);
    }

    @Then("Insert all required data")
    public void insertAllRequiredData() {
        RegisterPage.fillingPersonalDataDetailSection(generateRandomName(), generateRandomName(), generateRandomEmail(), generateRandomTelephone());
        RegisterPage.fillingPasswordSection(generateRandomPassword());
        RegisterPage.fillingNewsletterSection();
        RegisterPage.privacyPolicyCheckBox();
        RegisterPage.clickContinueButton();
    }

    @And("User is able to Register")
    public void userIsAbleToRegister() {
        AssertionHelper.checkPageIsCorrect(SUCCESS_PAGE_URL_CONTAINS, SUCCESS_PAGE_CONTENT_LOCATOR, SUCCESS_PAGE_CONTAINS_TEXT);
        SuccessPage.navigateTo();
        AssertionHelper.checkPageIsCorrect(ACCOUNT_PAGE_URL_CONTAINS, ACCOUNT_PAGE_CONTENT_TEXT_LOCATOR, ACCOUNT_PAGE_CONTAINS_TEXT);
    }

    @Given("Logged in user searches for item")
    public void loggedInUserSearchesForItem() {
        HomePage.navigateToLoginPage();
        LoginPage.insertCustomerData(EMAIL, PASSWORD);
        HomePage.searchForProduct(ITEM);
    }

    @Then("User adds item to Wish List")
    public void userAddsItemToWishList() {
        SearchPage.addItemToWishList();
        AssertionHelper.checkTextIsCorrect(WISH_LIST_TEXT_LOCATOR, WISH_LIST_SUCCESS_TEXT_CONTAINS);
    }

    @And("User checks that item in the list")
    public void userChecksThatItemInTheList() {
        HomePage.navigateToWishList();
        AssertionHelper.expectedTextIsPresented(WISH_LIST_SUCCESS_TEXT_LOCATOR, ITEM);
    }

    @Given("User adds default item to cart")
    public void userAddsDefaultItemToCart() {
        ProductData productData = addDefaultProductToCart();
        List<ProductData> expectedProduct = Collections.singletonList(productData);
        scenarioContext.setContext(Context.EXPECTED_ITEM, expectedProduct);
    }

    @Then("User checks that item presented in cart")
    public void userChecksThatItemPresentedInCart() {
        AssertionHelper.checkPageIsCorrect(SHOPPING_CART_PAGE_URL_CONTAINS, SHOPPING_CART_PAGE_SHOPPING_CART_TITLE_LOCATOR, SHOPPING_CART_PAGE_CONTAINS_TEXT);
        assertTrue(ShoppingCartPage.getCartProducts().size() == scenarioContext.getContext(Context.EXPECTED_ITEM).size()
                && ShoppingCartPage.getCartProducts().containsAll(scenarioContext.getContext(Context.EXPECTED_ITEM)));
    }

    @And("User removes item")
    public void userRemovesItem() throws InterruptedException {
        ShoppingCartPage.removeItemFromCard();
        AssertionHelper.expectedTextIsPresented(EMPTY_CART_TEXT_LOCATOR, EMPTY_CART_TEXT_CONTAINS);
    }
}
