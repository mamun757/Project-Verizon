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
import page_objects.PrepaidTablet;
import utilities.ReadConfigFiles;

public class TabletPrice_Steps {
    private static final Logger LOGGER = LogManager.getLogger(TabletPrice_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Shop_Home1 page$")
    public void userIsOnShopHome1Page() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnShopTab();
        LOGGER.info("User is on Shop home page");

    }

    @And("^click on Prepaid tab$")
    public void clickOnPrepaidTab() {
        new PrepaidTablet(driver)
                .ClickOnPrepaidTab();
        LOGGER.info("User clicks on Prepaid Tab");
    }
    @And("^click on Devices tab$")
    public void clickOnDevicesTab() {
        new PrepaidTablet(driver)
                .ClickOnDevicesTab();
        LOGGER.info("User clicks on Devices Tab");

    }
    @And("^clicks on Tablets Tab$")
    public void clicksOnTabletsTab() {
        new PrepaidTablet(driver)
                .ClickOnTabletsTab();
        LOGGER.info("User clicks on Tablet Tab");

    }
    @When("^user select the choices \"(.+?)\" of the Tablet$")
    public void userSelectTheChoicesOfTheTablet(String choice) {
        new PrepaidTablet(driver)
                .SelectChoice(choice);
        LOGGER.info("User select the choices of the tablet");

    }
    @And("^click on Quick View of the Tablet$")
    public void clickOnQuickViewOfTheTablet() {
        new PrepaidTablet(driver)
                .ClickOnQuickView();
        LOGGER.info("User clicks on Quick view of the tablet");

    }
    @Then("^user can see the price details of the Tablet$")
    public void userCanSeeThePriceDetailsOfTheTablet() {
        new PrepaidTablet(driver)
                .ValidatingTabletsPrice();
        LOGGER.info("Finally user can see the price of the tablet");

    }

}
