package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverHolder;

import static org.junit.jupiter.api.Assertions.fail;

public class Wait {
    private static final int TIMEOUT_1_SEC = 1000;
    private static final int TIMEOUT_5_SEC = 5000;

    public void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(DriverHolder.getDriver(), TIMEOUT_5_SEC);
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) DriverHolder.getDriver())
                .executeScript("return document.readyState").toString().equals("complete");
        try {
            Thread.sleep(TIMEOUT_1_SEC);
            wait.until(expectation);
        } catch (Throwable error) {
            fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
