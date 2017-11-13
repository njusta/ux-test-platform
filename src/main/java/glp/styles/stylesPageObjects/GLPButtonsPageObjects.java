package glp.styles.stylesPageObjects;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by udhadpa on 11/15/17.
 */
public class GLPButtonsPageObjects {

    WebDriver driver = null;
    AppiumDriver appium = null;

    public GLPButtonsPageObjects(){
    }
    public By tertiaryBtn = By.id("tertiary-btn");

    public By defaultBtn=By.id("default-btn");
    public By defaultBtnDisabled=By.id("default-btn-disabled");

    public By primaryBtn=By.id("primary-btn");

    public By ctaBtn=By.id("cta-btn");

    public By linkBtn=By.id("link-btn");
    public By linkBtn2 = By.id("link-btn-2.0");
    public By linkBtn2Disabled = By.id("link-btn-2.0-disabled");

    public By smallBtn=By.id("small-btn");
    public By largeBtn=By.id("large-btn");

    public By smallBtnCalendar18Icon = By.id("small-btn-calendar18icon");
    public By largeBtnCalendar18Icon = By.id("large-btn-calendar18icon");
    public By smallBtnCalendar24Icon = By.id("small-btn-calendar24icon");
    public By largeBtnCalendar24Icon = By.id("large-btn-calendar24icon");


}
