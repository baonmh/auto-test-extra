package integration.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import javax.xml.xpath.XPath;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AutoTestPage extends PageObject {

    public AutoTestPage(WebDriver driver) {
        super(driver);
    }

    public void gotoGuru() throws MalformedURLException {
        getDriver().get("http:demo.guru99.com/v4");

    }

    public void user_login(){

    }

//
//    public void waitkOnXCUIElementTypeNavigationBar() {
//        (new WebDriverWait(getDriver(), 60))
//                .until(ExpectedConditions.elementToBeClickable(XCUIElementTypeNavigationBar));
//    }
//
//    public boolean isXCUIElementTypeNavigationBarShown() {
//        return element(XCUIElementTypeNavigationBar).isDisplayed();
//    }
//
//    public void verifyItems() {
//        boolean hasAcuraIntegra = element(AcuraIntegraText).isDisplayed();
//        boolean hasAcuraMDX = element(AcuraMDXText).isDisplayed();
//        boolean hasAcuraRL = element(AcuraRLText).isDisplayed();
//        boolean hasAcuraTL = element(AcuraTLText).isDisplayed();
//        boolean hasAcuraTSX = element(AcuraTSXText).isDisplayed();
//
//        Assert.assertEquals(hasAcuraIntegra, true);
//        Assert.assertEquals(hasAcuraMDX, true);
//        Assert.assertEquals(hasAcuraRL, true);
//        Assert.assertEquals(hasAcuraTL, true);
//        Assert.assertEquals(hasAcuraTSX, true);
//    }
}
