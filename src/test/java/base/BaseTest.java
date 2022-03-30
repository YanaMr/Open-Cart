package base;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static utils.DriverHolder.getDriver;
import static utils.DriverHolder.initDriver;

public class BaseTest {

    public static final String DROPS_BASE_URL = "http://localhost/";

    @BeforeEach
    public void beforeEveryTest() {
        initDriver();
        openTestApp();
    }

    @AfterEach
    public void afterEveryTest() {
        getDriver().quit();
    }

    private void openTestApp() {
        getDriver().get(DROPS_BASE_URL);
    }
}