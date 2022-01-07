package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final By ShopTab = By.xpath("//*[@id='gnav20-Shop-L1'][@class='gnav20-menu-label gnav20-menu-label-button gnav20-haschild']");
    private final By WhyVerizonTab = By.xpath("//*[@id='gnav20-Why-Verizon-L1'][1]");
    private final By SupportTab = By.xpath("//button[@id='gnav20-Support-L1'][@class='gnav20-menu-label gnav20-menu-label-button gnav20-haschild']");

    public static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public WebDriver driver;


    public NavigationBar(WebDriver driver){

        this.driver = driver;
    }

    public NavigationBar ClickOnShopTab(){
        ActOn.element(driver,ShopTab).click();
        LOGGER.debug("Clicked on Shop Tab");
        return this;
    }

    public NavigationBar ClickOnWhyVerizonTab(){
        ActOn.element(driver,WhyVerizonTab).click();
        LOGGER.debug("Clicked on Why Verizon Tab");
        return this;
    }

    public NavigationBar ClickOnSupportTab(){
        ActOn.element(driver,SupportTab).click();
        LOGGER.debug("Clicked on Support Tab");
        return this;
    }
}
