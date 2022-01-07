package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactVerizon {
    private static final By ContactUs = By.xpath("//a[@id='gnav20-Support-L2-5'][@aria-label='Contact us']");
    private static final By MobileDevice = By.xpath("//*[@id='app']//span/p[text()='Phone, tablet or mobile devices']");
    private static final By InterNationalTravel = By.xpath("//*[@id='app']/div/section/div/div[6]/a");
    private static final By ChatWithUs = By.xpath("//*[@id='app']//span[text()='Chat with us']");
    private static final By ChatBox = By.xpath("//*[@id='holdBar']");

    public static final Logger LOGGER = LogManager.getLogger(ContactVerizon.class);
    public WebDriver driver;

    public ContactVerizon(WebDriver driver){

        this.driver = driver;
    }
    public ContactVerizon ClickOnContactUsTab(){
        ActOn.element(driver,ContactUs).click();
        LOGGER.debug("User clicked on Contact With Us Tab");
        return this;
    }

    public ContactVerizon ClickOnMobileTab(){
        ActOn.element(driver,MobileDevice).click();
        LOGGER.debug("User clicked on Mobile Device Tab");
        return this;
    }

    public ContactVerizon ClickOnInternationalTravelTab(){
        ActOn.element(driver,InterNationalTravel).click();
        LOGGER.debug("User clicked on International Travel Tab");
        return this;
    }

    public ContactVerizon ClickOnChatWithUsTab(){

        ActOn.element(driver,ChatWithUs).click();
        ActOn.wait(driver,ChatWithUs).waitForElementToBeVisible();
        LOGGER.debug("User clicked on Chat With Us Tab");
        return this;
    }
    public ContactVerizon ValidatingChatBoxAppears(){
        ActOn.wait(driver,ChatBox).waitForElementToBeVisible();
        boolean actualChat = driver.findElement(ChatBox).isDisplayed();
        Assert.assertTrue("Chat box not appears",actualChat);
        LOGGER.debug("Validating the Chat with Customer assistant successfully");
        return this;
    }
}
