package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesTab {
    private static final By AccessoriesTab = By.xpath("//a[@id='gnav20-Shop-L2-4'][@class='gnav20-subanchor gnav20-haschild']");
    private static final By PhoneAccessories= By.xpath("//*[@id='Shop-L3-47']");
    private static final By Cases = By.xpath("//*[@id='gnav20-Shop-L4-18'][@href='https://www.verizon.com/products/phone-cases/']");
    private static final By SortBy = By.xpath("//select[@class='SelectEl-sc-h8azzi-1 ksFWKG']");
    private static final By Image = By.xpath("//*[@id='gridwall-wrapper']/section/div[1]/div[1]/a/div/img");

    private static final Logger LOGGER = LogManager.getLogger(AccessoriesTab.class);
    WebDriver driver;

    public AccessoriesTab(WebDriver driver){

        this.driver = driver;
    }
    public AccessoriesTab ClickOnAccessoriesTab(){
        ActOn.element(driver,AccessoriesTab).click();
        LOGGER.debug("Click on Accessories Tab");
        return this;
    }

    public AccessoriesTab ClickOnPhoneAccessoriesTab(){
        ActOn.element(driver,PhoneAccessories).click();
        LOGGER.debug("Click on PhoneAccessories Tab");
        return this;
    }


    public AccessoriesTab ClickOnCases(){
       ActOn.element(driver,Cases).click();
        LOGGER.debug("Click on Cases Tab");
        return this;
    }

    public AccessoriesTab SelectChoice(String choice){
        ActOn.element(driver,SortBy).selectValue(choice);
        LOGGER.debug("user select the accessories");
        return this;
    }

    public AccessoriesTab ValidatingImage(){
        boolean actualImage = driver.findElement(Image).isDisplayed();
        Assert.assertTrue("The image is not displayed", actualImage);
        LOGGER.debug("Validating the image is displayed");
        return this;
    }


}
