package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SignIn;
import utilities.ReadConfigFiles;

public class Login_Steps {

    private static final Logger LOGGER = LogManager.getLogger(Login_Steps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on Verizon HomePage$")
    public void NavigateToLoginPage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        LOGGER.info("User is on Verizon Homepage");
    }

    @And("^user should clicked on SignIn button$")
    public void userClickedOnSignButton() {
      new SignIn(driver)
              .ClickOnSignInTab();
        LOGGER.info("User clicked on SignIn Tab");
    }

    @And("^user clicked on SignInToMyAccount Tab$")
    public void userClickedOnSignInToMyAccount() {
     new SignIn(driver)
             .ClickOnSignInMyAccountTab();
        LOGGER.info("User clicked on SignInMyAccount button");
    }
    @When("^user enters username \"(.+?)\" and password \"(.+?)\"$")
    public void userEntersCredentials(String username, String password) {
      new SignIn(driver)
              .EnterUserName(username)
              .EnterPassword(password);
        LOGGER.info("user enters username and password");
    }

    @And("^click on SignIn button$")
    public void clickedOnSignInButton() {
      new SignIn(driver)
              .ClickOnSignInButton();
        LOGGER.info("User clicked on SignIn button");
    }
    @Then("^user is failed to login$")
    public void ValidatingFailedToLogIn() {
       new SignIn(driver)
               .ValidatingFailedLogIn();
        LOGGER.info("User cannot login with invalid credentials");
    }
    @Then("^user will successfully landed to Verizon Home page$")
    public void ValidateLoginIsSuccessful() {
      new SignIn(driver)
              .ValidatingLogInIsSuccessful();
        LOGGER.info("User successfully landed on verizon home page");
    }




}
