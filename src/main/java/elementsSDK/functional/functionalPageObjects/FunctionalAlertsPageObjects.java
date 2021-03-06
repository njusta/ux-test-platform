package elementsSDK.functional.functionalPageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by udhadpa on 6/20/17.
 */
public class FunctionalAlertsPageObjects {

    public WebDriver driver = null;
    public AppiumDriver appium = null;

    public FunctionalAlertsPageObjects() {
    }

    public By alert = By.xpath("//*[@id='StaticAlert']/div/div");
    public By alertTitle = By.xpath("//*[@id='StaticAlert']/div/div/div/div/h2");
    public By alertTitleText = By.xpath("//*[@id='StaticAlert']/div/div/div/div/h2/strong");
    public By alertText = By.xpath("//*[@id='StaticAlert']/div/div/div/div/p");
    public By alertContent = By.xpath("//*[@id='StaticAlert']/div/div/div/div");
    public By closeAlert = By.xpath("//*[@id='StaticAlert']/div/div/button");
    public By alertIcon = By.xpath("//*[@id='StaticAlert']/div/div/div/span");
    public By svg = By.cssSelector("#StaticAlert > div > div > div > span > svg");
}
