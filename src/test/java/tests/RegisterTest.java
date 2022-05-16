package tests;

import base.BaseTest;
import helpers.AssertionHelper;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.SuccessPage;

import static utils.Constants.*;
import static utils.StringUtil.*;

public class RegisterTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    SuccessPage successPage = new SuccessPage();
    AssertionHelper assertionHelper = new AssertionHelper();

    @Test
    public void registrationTest() {
        homePage
                .navigateToRegisterPage();
        assertionHelper
                .checkPageUrlIsCorrect(REGISTER_PAGE_URL_CONTAINS);
        registerPage
                .fillingPersonalDataDetailSection(generateRandomName(), generateRandomName(), generateRandomEmail(), generateRandomTelephone())
                .fillingPasswordSection(generateRandomPassword())
                .fillingNewsletterSection()
                .privacyPolicyCheckBox()
                .clickContinueButton();
        assertionHelper
                .checkPageIsCorrect(SUCCESS_PAGE_URL_CONTAINS, SUCCESS_PAGE_CONTENT_LOCATOR, SUCCESS_PAGE_CONTAINS_TEXT);
        successPage
                .navigateTo();
        assertionHelper
                .checkPageIsCorrect(ACCOUNT_PAGE_URL_CONTAINS, ACCOUNT_PAGE_CONTENT_TEXT_LOCATOR, ACCOUNT_PAGE_CONTAINS_TEXT);

    }
}
