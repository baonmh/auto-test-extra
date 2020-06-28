package integration.serenitySteps;

import integration.pages.AutoTestPage;
import integration.pages.IFixitPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoTestExtraSteps extends ScenarioSteps {
    AutoTestPage autoTestPage;

    @Step
    public void gotoGuru() {
        autoTestPage.gotoGuru();
    }
//
//    @Step
//    public void clickOnCarAndTruckText() {
//        ifixitPage.clickOnCarAndTruckText();
//    }
//
//    @Step
//    public void clickOnStartARepairButton() {
//        ifixitPage.clickOnStartARepairButton();
//    }
//
//    @Step
//    public boolean isXCUIElementTypeNavigationBarShown() {
//        return ifixitPage.isXCUIElementTypeNavigationBarShown();
//    }
//
//    @Step
//    public void waitkOnXCUIElementTypeNavigationBar() {
//        ifixitPage.waitkOnXCUIElementTypeNavigationBar();
//    }
//
//    @Step
//    public void verifyItems() {
//        ifixitPage.verifyItems();
//    }

}
