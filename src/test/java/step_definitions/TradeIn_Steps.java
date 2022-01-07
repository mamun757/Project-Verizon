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
import page_objects.TradeIn;
import utilities.ReadConfigFiles;

public class TradeIn_Steps {
    private static final Logger LOGGER = LogManager.getLogger(TradeIn_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Support home_page$")
    public void userIsOnSupportHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new NavigationBar(driver)
                .ClickOnSupportTab();
        LOGGER.info("Support Tab is clicked");
    }

    @And("^clicked on SupportOverViewTab$")
    public void clickedOnSupportOverViewTab() {
        new SupportTab(driver)
                .ClickOnSupportOverview();
        LOGGER.info("Support Over View Tab is clicked");
    }

    @And("^click on Trade in my device tab$")
    public void clickOnTradeInMyDeviceTab() {
        new TradeIn(driver)
                .ClickOnTradeInMyDevice();
        LOGGER.info("Trade In Ny device Tab is clicked");
    }
    @And("click on smart Phone tab")
    public void click_on_smart_phone_tab() {
      new TradeIn(driver)
              .ClickOnSmartPhoneTab();
    }


    @When("^user select brand \"(.+?)\" and model \"(.+?)\"$")
    public void userSelectBrandAndModel(String brand, String model) {
        new TradeIn(driver)
                .SelectBrand(brand)
                .SelectModel(model);
        LOGGER.info("Brand and Model is selected");
    }

    @And("^user select storage \"(.+?)\" and network \"(.+?)\"$")
    public void userSelectStorageAndNetwork(String storage, String network) {
        new TradeIn(driver)
                .SelectStorage(storage)
                .SelectNetwork(network);
        LOGGER.info("Storage and network is selected");
    }

    @And("^click on continue1 button$")
    public void clickOnContinueButton1() {
        new TradeIn(driver)
                .ClickOnContinue2Button();
        LOGGER.info("Clicked on continue button");
    }

    @And("^clicked on GoodCondition Radio button$")
    public void clickedOnGoodConditionRadioButton() {
        new TradeIn(driver)
                .ClickOnGoodConditionRadioButton();
        LOGGER.info("Clicked on good condition radio button");
    }

    @And("^click on continue2 button$")
    public void clickOnContinueButton2() {
        new TradeIn(driver)
                .ClickOnContinue3Button();
        LOGGER.info("Clicked on continue button");
    }

    @Then("^the trade in value is \"(.+?)\"")
    public void theTradeInValueIs(String value) {
        new TradeIn(driver)
                .ValidatingTheTradingValue(value);
        LOGGER.info("Validate the trade in value");
    }
}
