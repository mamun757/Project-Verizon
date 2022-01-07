package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class Hooks {
    private static final Logger LOGGER = LogManager.getLogger(Hooks.class);
    public static WebDriver driver;

    @Before
    public void openBrowser() {
        driver = DriverFactory.getInstance().getDriver();
        LOGGER.info("Browser opens as expected");
    }

    @After
    public void closeBrowser() {
        DriverFactory.getInstance().removeDriver();
        LOGGER.info("Browser close as expected");
    }
}
