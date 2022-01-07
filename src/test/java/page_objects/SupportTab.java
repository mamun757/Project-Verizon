package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportTab {
    private static final By SupportOverView = By.xpath("//a[@id='gnav20-Support-L2-1']");
    private static final By DeviceSupportTab = By.xpath("//*[@id='app']//a[text()='Device support']");
    private static final By AllDevices = By.xpath("//p[@id='buttonText'][text()='See all 34 brands or devices']");
    private static final By SupportedDevices = By.xpath("//*[@id='SupportContentWrapper']//h1/div[@class='cmp-title']");

    private static final Logger LOGGER = LogManager.getLogger(SupportTab.class);
    WebDriver driver;

    public SupportTab(WebDriver driver){
        this.driver = driver;
    }

    public SupportTab ClickOnSupportOverview(){
        ActOn.element(driver,SupportOverView).click();
        LOGGER.debug("Support Over view clicked");
        return this;
    }

    public SupportTab ClickOnDeviceSupportTab(){
        ActOn.element(driver,DeviceSupportTab).click();
        LOGGER.debug("Device Support Tab is clicked");
        return this;
    }

    public SupportTab ClickOnAllDevices(){
        ActOn.element(driver,AllDevices).click();
        LOGGER.debug("All Devices Tab is clicked");
        return this;
    }

    public SupportTab ValidatingAllSupportedDevices(){
        boolean ActualDevices = driver.findElement(SupportedDevices).isDisplayed();
        Assert.assertTrue("Support Devices is not displayed", ActualDevices);
        LOGGER.debug("All Devices is validated");
        return this;
    }
}
