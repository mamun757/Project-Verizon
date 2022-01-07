package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradeIn {
    private static final By TradeInMyDevice = By.xpath("//*[@id='app']//a[text()='Trade in my device']");
    private static final By SmartPhone = By.xpath("//*[@id='Smartphone']//span[text()='Smartphone']");
    private static final By SelectBrand = By.xpath("//select[@label='Brand']");
    private static final By SelectModel = By.xpath("//select[@label='Model']");
    private static final By StorageField = By.xpath("//select[@label='Storage']");
    private static final By NetworkField = By.xpath("//select[@label='Network']");
    private static final By Continue2 = By.xpath("//*[@id='page']//span[2][@class='StyledChildWrapper-bc3yhn-1 iIJMoM']");
    private static final By GoodConditionRadio = By.xpath("//div[@id='page']/div/div[7]/div[2]/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/label/div[1]/div[2]");
    private static final By Continue3 = By.xpath("//*[@id='page']/div/div[7]//button/span[2][text()='Continue']");
    private static final By TradeValue = By.xpath("//*[@id='page']//div/h1[1][text()='Your estimated trade-in value is $185.00.']");

    private static final Logger LOGGER = LogManager.getLogger(TradeIn.class);
    WebDriver driver;

    public TradeIn(WebDriver driver){
        this.driver = driver;
    }
    public TradeIn ClickOnTradeInMyDevice(){
        ActOn.element(driver,TradeInMyDevice).click();
        LOGGER.debug("Click on TradeInMyDevice");
        return this;
    }
    public TradeIn ClickOnSmartPhoneTab(){
        ActOn.element(driver,SmartPhone).click();
        LOGGER.debug("Click on Smart Phone Tab");
        return this;
    }

    public TradeIn SelectBrand(String brand){
        ActOn.element(driver,SelectBrand).selectValue(brand);
        LOGGER.debug("Select the brand");
        return this;
    }

    public TradeIn SelectModel(String model){
        ActOn.element(driver,SelectModel).selectValue(model);
        LOGGER.debug("Select the model");
        return this;
    }


    public TradeIn SelectStorage(String storage){
        ActOn.element(driver,StorageField).selectValue(storage);
        LOGGER.debug("Select the mobile storage");
        return this;
    }

    public TradeIn SelectNetwork(String network){
        ActOn.element(driver,NetworkField).selectValue(network);
        LOGGER.debug("Select the mobile Network");
        return this;
    }

    public TradeIn ClickOnContinue2Button(){
        ActOn.element(driver,Continue2).click();
        LOGGER.debug("Click on Continue2 button");
        return this;
    }

    public TradeIn ClickOnGoodConditionRadioButton(){
        ActOn.element(driver,GoodConditionRadio).click();
        LOGGER.debug("Click on Good condition radio button");
        return this;
    }
    public TradeIn ClickOnContinue3Button(){
        ActOn.element(driver,Continue3).click();
        LOGGER.debug("Click on Continue3 button");
        return this;
    }
    public TradeIn ValidatingTheTradingValue(String expectedValue){
        LOGGER.debug("Validating the tradeIn value is: " + expectedValue);
        String ActualValue = ActOn.element(driver,TradeValue).getTextValue();
        Assert.assertEquals(expectedValue,ActualValue);
        return this;
    }
}
