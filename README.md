### First thing first
Read cucumber doc and example
Read serenity-appium framework structure
Try to create new app: AutoTestExtra

### Issues and Solutions:
[main] ERROR net.thucydides.core.webdriver.WebDriverFacade - FAILED TO CREATE NEW WEBDRIVER_DRIVER INSTANCE class io.appium.java_client.AppiumDriver: Could not instantiate new WebDriver instance of type class io.appium.java_client.AppiumDriver (An unknown server-side error occurred while processing the command. Original error: A new session could not be created. Details: session not created: This version of ChromeDriver only supports Chrome version 84
```
=> It is because i used Chromedriver v84
=> Try to use lower versior, suit with chrome version of Emulator
```

---
[main] ERROR net.thucydides.core.webdriver.WebDriverFacade - FAILED TO CREATE NEW WEBDRIVER_DRIVER INSTANCE class io.appium.java_client.AppiumDriver: Could not instantiate new WebDriver instance of type class io.appium.java_client.AppiumDriver (Connection refused: no further information
```
=> Appium setting wrong Address
```
---
[main] ERROR net.thucydides.core.webdriver.WebDriverFacade - FAILED TO CREATE NEW WEBDRIVER_DRIVER INSTANCE class io.appium.java_client.AppiumDriver: Could not instantiate new WebDriver instance of type class io.appium.java_client.AppiumDriver (An unknown server-side error occurred while processing the command. Original error: No Chromedriver found that can automate Chrome '58.0.3029'. You could also try to enable automated chromedrivers download server feature. See https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/web/chromedriver.md for more details
```
=> chromedriver with chromeVersion 58 support 
=> Can't download chromedriver 2.31
=> download lastest Chromedriver and update Chrome in Emulator
```
---
Somehow Chrome in Emulator showing webview Chrome v58 issue even i updated it to v83
I put some system.out.print to see the process but program even has not gone through the first Step
just loaded Chrome with "data;" 3 times then returned error
```
=> It is because chromedriver and chrome in Emulator not matched
=> Install Emulator Android 10 with new hardware profile
=> Download chrome version that matched with chrome in Emulator (v74)
```
--- 
The page object class integration.pages.AutoTestPage looks dodgy
```
=> extends PageObject instead of MobilePageObject
```

--- 
Returned value cannot be converted to WebElement
=> Use below dependencies im pom
```
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>6.0.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.14.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-api</artifactId>
        <version>3.14.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-remote-driver</artifactId>
        <version>3.14.0</version>
    </dependency>
```

### Final Result
+ Connect with Emulator, Launch Chrome and Goto "demo.guru99.com/v4"
+ Tried to get webElement by @AndroidFindBy / getDriver().findElement(By.xpath()) but element cannot be found
+ Tried using MobileElement but failed too, due to webElement was set as final

