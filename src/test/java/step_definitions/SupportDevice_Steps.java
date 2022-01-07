package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.NavigationBar;
import page_objects.SupportTab;
import utilities.ReadConfigFiles;

public class SupportDevice_Steps {
    private static final Logger LOGGER = LogManager.getLogger(SupportDevice_Steps.class);
    WebDriver driver = Hooks.driver;


    @Given("^user is on Support home Page$")
    public void userIsOnSupportHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnSupportTab();
        LOGGER.info("User is on Support home page");
    }

    @And("^clicked on SupportOverView$")
    public void clickedOnSupportOverView() {
        new SupportTab(driver)
                .ClickOnSupportOverview();
        LOGGER.info("Support Overview Tab is clicked");
    }

    @When("^user clicked on DeviceSupport$")
    public void userClickedOnDeviceSupport() {
        new SupportTab(driver)
                .ClickOnDeviceSupportTab();
        LOGGER.info("Device Support Tab is clicked");
    }

    @And("^clicked on SeeAllDevices$")
    public void clickedOnSeeAllDevices() {
        new SupportTab(driver)
                .ClickOnAllDevices();
        LOGGER.info("All Device Tab is clicked");
    }

    @Then("^user can see all the supported devices$")
    public void userCanSeeAllTheSupportedDevices() {
        new SupportTab(driver)
                .ValidatingAllSupportedDevices();
        LOGGER.info("Validating all the devices that is supported");
    }


}
