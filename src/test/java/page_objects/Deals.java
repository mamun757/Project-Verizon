package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deals {
    private static final By DealsTab = By.xpath("//*[@id='gnav20-Shop-L2-2'][1]");
    private static final By AllDeals = By.xpath("//*[@id='gnav20-Shop-L3-37'][@aria-label='Shop all deals']");
    private static final By FreePhone = By.xpath("//*[@id='section_copy']//li[4]/a[text()='Free Phone ']");
    private static final By ImagePhone = By.xpath("//*[@id='gridwall-wrapper']/section/div[1]/div[1]/a/div/img");

    private static final Logger LOGGER = LogManager.getLogger(Deals.class);
    WebDriver driver;

    public Deals(WebDriver driver){

        this.driver = driver;
    }

    public Deals ClickOnDealsTab(){
        ActOn.element(driver,DealsTab).click();
        LOGGER.debug("Clicked on Deals Tab");
        return this;
    }
    public Deals ClickOnShopAllDeals(){
        ActOn.element(driver,AllDeals).click();
        LOGGER.debug("Clicked on Holiday Deals tab");
        return this;
    }

    public Deals ClickOnFreePhone(){
        ActOn.element(driver,FreePhone).click();
        LOGGER.debug("Clicked on Free phone");
        return this;
    }

    public Deals ValidatingPhone(){
        boolean Actualimg = driver.findElement(ImagePhone).isDisplayed();
        Assert.assertTrue("Free Phone is not displayed", Actualimg);
        LOGGER.debug("Validating the free phone ");
        return this;
    }



}
