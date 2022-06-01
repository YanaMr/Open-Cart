package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.DriverHolder.getDriver;
import static utils.DriverHolder.initDriver;

public class Hooks {

    public static final String BASE_URL = "http://localhost/";

    @Before
    public void beforeEveryTest() {
        initDriver();
        openTestApp();
    }

    @After
    public void afterEveryTest() {
        getDriver().quit();
    }

    private void openTestApp() {
        getDriver().get(BASE_URL);
    }
}