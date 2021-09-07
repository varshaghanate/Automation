package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    @Given("user calculated {int}+{int}")
    public void userCalculated(int arg0, int arg1) {

    }

    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {

    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @When("user enters invalid username and password")
    public void userEntersInvalidUsernameAndPassword() {
    }

    @Then("error message is displayed - Invalid Credentials")
    public void errorMessageIsDisplayedInvalidCredentials() {
    }
}
