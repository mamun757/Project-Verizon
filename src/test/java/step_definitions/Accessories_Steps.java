package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.AccessoriesTab;
import page_objects.NavigationBar;
import utilities.ReadConfigFiles;

public class Accessories_Steps {
    private static final Logger LOGGER = LogManager.getLogger(Accessories_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Shop_home1 page$")
    public void userIsOnShopHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnShopTab();
        LOGGER.info("User is on Shop home page");
    }

    @And("^click on Accessories tab$")
    public void clickOnAccessoriesTab() {
       new AccessoriesTab(driver)
               .ClickOnAccessoriesTab();
        LOGGER.info("User is on Accessories Tab");
    }

    @And("^click on Phone accessories tab$")
    public void clickOnPhoneAccessoriesTab() {
      new AccessoriesTab(driver)
              .ClickOnPhoneAccessoriesTab();
        LOGGER.info("User is on Phone Accessories Tab");
    }

    @And("^clicks on Cases Tab$")
    public void userClickOnCasesTab() {
        new AccessoriesTab(driver)
                .ClickOnCases();
        LOGGER.info("User is on Cases Tab");
    }

    @When("user select the choice \"(.+?)\" of cases$")
    public void userClickOnChoices(String choice) {
        new AccessoriesTab(driver)
                .SelectChoice(choice);
        LOGGER.info("User is choices the accessories");
    }
    @Then("^user validate the actual image of accessories$")
    public void ValidatingTheImage() {
        new AccessoriesTab(driver)
                .ValidatingImage();
        LOGGER.info("User can validated  the accessories which he can buy");
    }



}
