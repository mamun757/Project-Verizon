package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Deals;
import page_objects.NavigationBar;
import utilities.ReadConfigFiles;

public class FreePhone_Steps {
    private static final Logger LOGGER = LogManager.getLogger(FreePhone_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Shop_home page$")
    public void userIsOnShopHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnShopTab();
        LOGGER.info("User is on Shop home page");
    }

    @And("^user click on Deals Tab$")
    public void userClickOnDealsTab() {
        new Deals(driver)
                .ClickOnDealsTab();
        LOGGER.info("Deals tab clicked");
    }

    @And("^user click On Shop All Deals Tab$")
    public void userClickOnHolidayDealsTab() {
        new Deals(driver)
                .ClickOnShopAllDeals();
        LOGGER.info("Holiday deals tab clicked");
    }

    @When("^user click on Free Phone Tab$")
    public void userClickOnFreePhoneTab() {
        new Deals(driver)
                .ClickOnFreePhone();
        LOGGER.info("Free Phone is clicked");
    }

    @Then("^user can see the free Phone display$")
    public void userCanSeeTheFreePhoneDisplay() {
     new Deals(driver)
             .ValidatingPhone();
     LOGGER.info("Validate the free phone is appeared");
    }

}
