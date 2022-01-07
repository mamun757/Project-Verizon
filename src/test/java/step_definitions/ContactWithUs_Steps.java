package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ContactVerizon;
import page_objects.NavigationBar;
import utilities.ReadConfigFiles;

public class ContactWithUs_Steps {
    private static final Logger LOGGER = LogManager.getLogger(ContactWithUs_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Support_home Page$")
    public void userIsOnSupportHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnSupportTab();
        LOGGER.info("User is on Support home page");

    }

    @And("^click on contact Us Tab$")
    public void clickOnContactUsTab() {
        new ContactVerizon(driver)
                .ClickOnContactUsTab();
        LOGGER.info("User clicks on Contact Us Tab");
    }

    @And("^click on Mobile Device Tab$")
    public void clickOnMobileDeviceTab() {
        new ContactVerizon(driver)
                .ClickOnMobileTab();
        LOGGER.info("User clicks on Mobile device Tab");
    }

    @When("^user click on International Travel Tab$")
    public void userClickOnInternationalTravelTab() {
        new ContactVerizon(driver)
                .ClickOnInternationalTravelTab();
        LOGGER.info("User clicks on International Travel Tab");
    }

    @And("^click on Chat With us$")
    public void clickOnChatWithUs() {
        new ContactVerizon(driver)
                .ClickOnChatWithUsTab();
        LOGGER.info("User clicks on Chat With Us Tab");
    }

    @Then("^user can chat with Customer care Assistant$")
    public void userCanChatWithCustomerCareAssistant() {
        new ContactVerizon(driver)
                .ValidatingChatBoxAppears();
        LOGGER.info("Validating the Customer Assistant Response");
    }
}
