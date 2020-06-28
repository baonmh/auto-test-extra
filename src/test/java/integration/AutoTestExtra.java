package integration;

import integration.serenitySteps.AutoTestExtraSteps;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/integration/resources/features/autotestextra.feature" ,
        plugin = {"json:target/cucumber_json/cucumber.json"} )
public class AutoTestExtra {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public AutoTestExtraSteps userSteps;
    //@Test
    public void verifyInvalidLogin(){
        try {

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
