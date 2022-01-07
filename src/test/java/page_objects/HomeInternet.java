package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeInternet {
    private static final By HomeTab = By.xpath("//a[@id='gnav20-Shop-L2-6'][1]");
    private static final By HomeSolutions= By.xpath("//a[@id='gnav20-Shop-L3-21'][@class='gnav20-subanchor']");
    private static final By InternetService = By.xpath("//*[@id='accordionTab1']/h3/button[@class='Accordion-button u-colorPrimary']");
    private static final By CheckHere = By.xpath("//*[@id='accordionPanel1']/p[2]/a[@class='checkAvailabilityBtn']");
    private static final By AddressField = By.xpath("//*[@id='internal-wrapper']/input[@aria-label='Street Address Input Field']");
    private static final By NotFound = By.xpath("//*[@id='lqw-modal-container']/span//div/p[text()='Address not found. Please try again.']");

    private static final Logger LOGGER = LogManager.getLogger(HomeInternet.class);
    WebDriver driver;

    public HomeInternet(WebDriver driver){

        this.driver = driver;
    }
    public HomeInternet ClickOnHomeTab(){
        ActOn.element(driver,HomeTab).click();
        LOGGER.debug("Click on Home Tab");
        return this;
    }
    public HomeInternet ClickOnShopAllHomeTab(){
        ActOn.element(driver,HomeSolutions).click();
        LOGGER.debug("Click on HomeSolution  Tab");
        return this;
    }
    public HomeInternet ClickOnInternetService(){
        ActOn.wait(driver,InternetService).waitForElementToBeVisible();
        ActOn.element(driver,InternetService).click();
        LOGGER.debug("Click on Internet Service Tab");
        return this;
    }
    public HomeInternet ClickOnClickHere(){
        ActOn.wait(driver,CheckHere).waitForElementToBeVisible();
        ActOn.element(driver,CheckHere).click();
        LOGGER.debug("Click on Here Link");
        return this;
    }

    public HomeInternet SetAddress(String value){
        ActOn.element(driver,AddressField).setValue(value);
        LOGGER.debug("Setting the desired address");
        return this;
    }

    public HomeInternet validationOfErrorService(){
        boolean actualError = driver.findElement(NotFound).isDisplayed();
        Assert.assertTrue("Element not found",actualError);
        LOGGER.debug("Validating that service is available on that address");
        return this;
    }


}
