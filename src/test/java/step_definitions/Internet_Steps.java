package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomeInternet;
import page_objects.NavigationBar;
import utilities.ReadConfigFiles;

public class Internet_Steps {
    private static final Logger LOGGER = LogManager.getLogger(Internet_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Shop_home2 page$")
    public void userIsOnShopHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnShopTab();
        LOGGER.info("User is on Shop home page");
    }

    @And("^click on Home tab$")
    public void clickOnHomeTab() {
        new HomeInternet(driver)
                .ClickOnHomeTab();
        LOGGER.info("User is on Home page");
    }
    @And("^click on Shop All Home Solution tab$")
    public void clickOnShopAllHomeSolutionTab() {
        new HomeInternet(driver)
                .ClickOnShopAllHomeTab();
        LOGGER.info("User clicks on Shop all solutions Tab");
    }
    @And("^click on Internet Service button$")
    public void clickOnInternetService() {
        new HomeInternet(driver)
                .ClickOnInternetService();
        LOGGER.info("User clicks on Internet Service Tab");
    }

    @When("^click on Here button$")
    public void clickOnClickHereButton() {
        new HomeInternet(driver)
                .ClickOnClickHere();
        LOGGER.info("User clicks on Here Link");
    }

    @And("^set his living address \"(.+?)\" field$")
    public void SetAddress(String address) {
        new HomeInternet(driver)
                .SetAddress(address);
        LOGGER.info("User set an address");
    }

    @Then("^user get an message$")
    public void userGetAnError() {
        new HomeInternet(driver)
                .validationOfErrorService();
        LOGGER.info("Finally validate that service is available or not");

    }

}
