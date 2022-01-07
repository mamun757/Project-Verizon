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
import page_objects.ShopAll;
import utilities.ReadConfigFiles;

public class BuyingPhone_Steps {
    private static final Logger LOGGER = LogManager.getLogger(BuyingPhone_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Shop home page$")
    public void userIsOnShopHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnShopTab();
        LOGGER.info("User is on Shop home page");
    }
    @And("^Click on ShopAll Tab$")
    public void clickOnShopAllTab() {
        new ShopAll(driver)
                .ClickOnShopAllTab();
        LOGGER.info("User is on Shop home page");

    }
    @And("^click on Shop all link$")
    public void clickOnShopAllLink() {
        new ShopAll(driver)
                .ClickOnShopAllAgainTab();
        LOGGER.info("User is on Shop home page");
    }
    @When("^user click on iphone tab$")
    public void userClickOnIphoneTab() {
        new ShopAll(driver)
                .ClickOnIphoneTab();
        LOGGER.info("User is on Shop home page");

    }
    @And("click on Buy Tab")
    public void clickOnBuyTab() {
      new ShopAll(driver)
              .ClickOnBuyPhone13Tab();
        LOGGER.info("User is on Shop home page");
    }

    @Then("^user can buy a phone$")
    public void userCanBuyAPhone() {
        new ShopAll(driver)
                .ValidatingIPhonePage();
        LOGGER.info("User is on Shop home page");


    }



}
