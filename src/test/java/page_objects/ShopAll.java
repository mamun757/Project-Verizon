package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAll {
    private static final By ShopAll = By.xpath("//*[@id='gnav20-Shop-L2-1']");
    private static final By ShopAllAgainTab = By.xpath("//*[@id='deals']//div/a[@class='Button Button--cta u-textBold u-fontDisplay u-text--xs16 u-text--lg20 animate-slideup active-animate']");
    private static final By IphoneTab = By.xpath("//*[@id='section_copy']//li[3]/a[text()='iPhone ']");
    private static final By BuyIphone13 = By.xpath("//*[@id='buy-more-save-more']/div/div/div/div[2]/span/a");
    private static final By image = By.xpath("//*[@id='page']/div/div[4]/div/div[3]/div[1]/div[1]/div/div[1]/div[1]/img");

    private static final Logger LOGGER = LogManager.getLogger(ShopAll.class);
    WebDriver driver;

    public ShopAll(WebDriver driver){

        this.driver = driver;
    }

    public ShopAll ClickOnShopAllTab(){
        ActOn.element(driver,ShopAll).click();
        LOGGER.debug("ShopAll Tab clicked");
        return this;
    }

    public ShopAll ClickOnShopAllAgainTab(){
        ActOn.element(driver,ShopAllAgainTab).click();
        LOGGER.debug("ShopAll Tab clicked");
        return this;
    }

    public ShopAll ClickOnIphoneTab(){
        ActOn.element(driver,IphoneTab).click();
        LOGGER.debug("IphoneTab clicked");
        return this;
    }

    public ShopAll ClickOnBuyPhone13Tab(){
        ActOn.element(driver,BuyIphone13).click();
        LOGGER.debug("Iphone13 Tab clicked");
        return this;
    }
    public ShopAll ValidatingIPhonePage(){
       boolean ActualImage = driver.findElement(image).isDisplayed();
        Assert.assertTrue("iphone page is not displayed", ActualImage);
        LOGGER.debug("Iphone13 page appears for Buy Iphone");
        return this;
    }

}
