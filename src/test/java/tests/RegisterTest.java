package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.RegisterPage;
import pages.SuccessPage;

import static utils.StringUtil.*;

public class RegisterTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    SuccessPage successPage = new SuccessPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void registrationTest() {
        homePage
                .navigateToRegisterPage();
        registerPage
                .checkPageUrlIsCorrect()
                .fillingPersonalDataDetailSection(generateRandomName(), generateRandomName(), generateRandomEmail(), generateRandomTelephone())
                .fillingPasswordSection(generateRandomPassword())
                .fillingNewsletterSection()
                .privacyPolicyCheckBox()
                .clickContinueButton();
        successPage
                .checkPageIsCorrect();
        accountPage
                .checkPageIsCorrect();

    }
}
