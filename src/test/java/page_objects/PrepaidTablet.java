package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrepaidTablet {
    private static final By PrepaidTab = By.xpath("//a[@id='gnav20-Shop-L2-7'][@class='gnav20-subanchor gnav20-haschild']");
    private static final By Devices = By.xpath("//a[@id='Shop-L3-64']");
    private static final By TabletsTab = By.xpath("//a[@id='gnav20-Shop-L4-38'][@aria-label='Tablets']");
    private static final By SearchBox = By.xpath("//select[@id='sortOptions'][@name='sorting']");
    private static final By QuickView = By.xpath("//*[@id='tile_dev16160079']//button[2][text()='Quick view']");
    private static final By TabletPrice = By.xpath("//*[@id='quick-view']//div[3][text()='$199.99']");


    private static final Logger LOGGER = LogManager.getLogger(PrepaidTablet.class);
    WebDriver driver;

    public PrepaidTablet(WebDriver driver){

        this.driver = driver;
    }

    public PrepaidTablet ClickOnPrepaidTab(){
        ActOn.wait(driver,PrepaidTab).waitForElementToBeVisible();
        ActOn.element(driver,PrepaidTab).click();
        LOGGER.debug("Click on Prepaid Tab");
        return this;
    }

    public PrepaidTablet ClickOnDevicesTab(){
        ActOn.element(driver,Devices).click();
        LOGGER.debug("Click on Devices Tab");
        return this;
    }


    public PrepaidTablet ClickOnTabletsTab(){
        ActOn.element(driver,TabletsTab).click();
        LOGGER.debug("Click on Tablets Tab");
        return this;
    }


    public PrepaidTablet SelectChoice(String choice){
        ActOn.element(driver,SearchBox).selectValue(choice);
        LOGGER.debug("user select the Tablets");
        return this;
    }
    public PrepaidTablet ClickOnQuickView(){
        ActOn.element(driver,QuickView).click();
        LOGGER.debug("Click on Quick view Tab");
        return this;
    }

    public PrepaidTablet ValidatingTabletsPrice(){
        boolean actualPrice = driver.findElement(TabletPrice).isDisplayed();
        Assert.assertTrue("The price od Tablets is not displayed", actualPrice);
        LOGGER.debug("Validating the Tablet price is displayed");
        return this;
    }



}
