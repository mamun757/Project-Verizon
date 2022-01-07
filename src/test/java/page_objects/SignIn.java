package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    private static final By SignInTab = By.xpath("//*[@id='gnav20-sign-id']/span/span");
    private static final By SignInMyAccountButton = By.id("gnav20-sign-id-list-item-1");
    private static final By UserIdField = By.id("IDToken1");
    private static final By PasswordField = By.id("IDToken2");
    private static final By SignIn_Button = By.id("login-submit");
    private static final By ForGotAnswer = By.xpath("//*[@id='challengequestion']//a[text()='Forgot your answer?']");
    private static final By ShoppingCart = By.xpath("//*[@id='vz-gh20']/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div[4]/div/button[@aria-label='Shopping Cart Menu']");

    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);
    WebDriver driver;


    public SignIn(WebDriver driver){
        this.driver = driver;
    }

    public SignIn ClickOnSignInTab(){
        ActOn.element(driver,SignInTab).click();
        LOGGER.debug("Sign in Tab clicked");
        return this;
    }

    public SignIn ClickOnSignInMyAccountTab(){
        ActOn.element(driver,SignInMyAccountButton).click();
        LOGGER.debug("User clicked on SignInMyAccount Tab");
        return this;
    }

    public SignIn EnterUserName( String name){
        ActOn.element(driver,UserIdField).setValue(name);
        LOGGER.debug("User enters the username in userId field ");
        return this;
    }
    public SignIn EnterPassword( String password){
        ActOn.element(driver,PasswordField).setValue(password);
        LOGGER.debug("User enters the password in password field ");
        return this;
    }

    public SignIn ClickOnSignInButton(){
        ActOn.element(driver,SignIn_Button).click();
        LOGGER.debug("Sign in button clicked");
        return this;
    }
    public SignIn ValidatingFailedLogIn(){
        boolean actualError =driver.findElement(ForGotAnswer).isDisplayed();
        LOGGER.debug("validating login is unsuccessful with invalid credentials");
        Assert.assertTrue("Actual error is displayed", actualError);
        return this;
    }

    public SignIn ValidatingLogInIsSuccessful(){
       boolean AddIsDisplayed = driver.findElement(ShoppingCart).isDisplayed();
        LOGGER.debug("validating login is successful with valid credentials");
        Assert.assertTrue("Actual error is displayed", AddIsDisplayed);
        return this;
    }
}
