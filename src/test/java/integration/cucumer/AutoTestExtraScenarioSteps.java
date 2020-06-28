package integration.cucumer;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import integration.serenitySteps.AutoTestExtraSteps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestExtraScenarioSteps {

    @Steps
    AutoTestExtraSteps autoTestExtraSteps;

    @Given("^User go to Guru$")
    public void user_go_to_Guru() throws Exception {
        System.out.println("debug-usergotoGuru-before");
        autoTestExtraSteps.gotoGuru();
        System.out.println("debug-usergotoGuru-after");
    }

    @And("^User login$")
    public void user_login() throws Exception {
        System.out.println("debug-user_login-before");
        autoTestExtraSteps.user_login();
        System.out.println("debug-user_login-after");
//        throw new PendingException();
    }

    @Then("^Verify login successful$")
    public void verify_login_successful() throws Exception {
        System.out.println("debug-verify_login_successful-before");

        System.out.println("debug-verify_login_successful-after");
        // Write code here that turns the phrase above into concrete actions
    }

//    @And("^User go to Guru$")
//    public void gotoGuru() {
//        autoTestExtraSteps.gotoGuru();
//        sleep(2);
//    }
//
//    @And("^User login$")
//    public void loginGuru() {
//        autoTestExtraSteps.loginGuru();
//        sleep(2);
//    }
//
//    @Then("^Verify login successful$")
//    public void verifyLogin() {
//        autoTestExtraSteps.verifyLogin();
//        sleep(2);
//    }

//    @And("^User clicks on Car and Truck category$")
//    public void clickOnCarTruckCategory() {
//        iFixitSteps.clickOnCarAndTruckText();
//    }

//    @And("^User clicks on Acura category$")
//    public void clickOnAcuraCateogry() {
//        iFixitSteps.clickOnAcuraText();
//    }

//    @When("^User waits for Navigation Bar$")
//    public void waitForNavigationBar() {
//        iFixitSteps.waitkOnXCUIElementTypeNavigationBar();
//    }

//    @Then("^Verify five items display: Acura Integra, Acura MDX, Acura RL, Acura TL, Acura TSX$")
//    public void verifyItems() {
//        iFixitSteps.verifyItems();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
