package integration.serenitySteps;

import integration.pages.AutoTestPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.net.MalformedURLException;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoTestExtraSteps extends ScenarioSteps {
    AutoTestPage autoTestPage;

    @Step
    public void gotoGuru() throws MalformedURLException {
        autoTestPage.gotoGuru();
    }
//
    @Step
    public void user_login() {
        autoTestPage.user_login();
    }


}
