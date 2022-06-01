//package tests;
//
//import base.BaseTest;
//import helpers.AssertionHelper;
//import org.junit.jupiter.api.Test;
//import pages.HomePage;
//import pages.LoginPage;
//
//import static utils.Constants.*;
//
//public class LoginTest extends BaseTest {
//    HomePage homePage = new HomePage();
//    AssertionHelper assertionHelper = new AssertionHelper();
//    LoginPage loginPage = new LoginPage();
//
//    @Test
//    public void loginTest() {
//        homePage
//                .navigateToLoginPage();
//        assertionHelper
//                .checkPageUrlIsCorrect(LOGIN_PAGE_URL_CONTAINS);
//        loginPage
//                .insertCustomerData(EMAIL, PASSWORD);
//        assertionHelper
//                .checkPageIsCorrect(ACCOUNT_PAGE_URL_CONTAINS, ACCOUNT_PAGE_CONTENT_TEXT_LOCATOR, ACCOUNT_PAGE_CONTAINS_TEXT);
//    }
//}
