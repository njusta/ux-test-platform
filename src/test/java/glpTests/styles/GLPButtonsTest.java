package glpTests.styles;

import glp.styles.stylesPageObjects.GLPButtonsPageObjects;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import utilities.BaseClass;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by udhadpa on 11/15/17.
 */
public class GLPButtonsTest extends BaseClass {
    private final String url = "http://localhost:8000/src/main/java/glp/styles/fixtures/buttons.html";
    private static String env = "", browser = "", lBrowser = "", device = "", setMobile = "", setDesktop = "";
    private String color = "", backgroundColor = "", lineHeight = "", backgroundImg = "", borderWidth = "", textDecoration = "", cursor = "", padding = "", borderStyle = "", borderColor = "", borderRadius = "", textDecorationProperty = "", height = "", boxShadow = "", fontSize = "", fontWt = "", className = "";
    boolean isCSSProperty = false, isColor = false, isBackgroundColor = false, isLineHeight = false, isBackgrounImg = false, isBorderWidth = false, isTextDecoration = false, isCursor = false, isPadding = false, isBorderStyle = false, isBorderColor = false, isBorderRadius = false, isHeight = false, isBoxShadow = false, isFontSize = false, isFontWt = false, isClassName = false;
    List<String> borderWidths = Arrays.asList("border-top-width", "border-right-width", "border-bottom-width", "border-left-width");
    List<String> borderStyles = Arrays.asList("border-top-style", "border-right-style", "border-bottom-style", "border-left-style");
    List<String> borderColors = Arrays.asList("border-top-color", "border-right-color", "border-bottom-color", "border-left-color");
    List<String> borderRadii = Arrays.asList("border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius");
    List<String> paddings = Arrays.asList("padding-top", "padding-bottom", "padding-right", "padding-left");
    List<String> borderTop = Arrays.asList("border-top-width", "border-top-style", "border-top-color");

    GLPButtonsPageObjects btnPgObect = null;
    final static Logger log = Logger.getLogger(GLPButtonsTest.class.getName());


    @BeforeClass(alwaysRun = true)
    private void beforeClass() {
        btnPgObect = new GLPButtonsPageObjects();
        env = BaseClass.runEnv;
        setMobile = BaseClass.mobile;
        setDesktop = BaseClass.desktop;
        browser = BaseClass.sauceBrowser;
        lBrowser = BaseClass.localBrowser;
        device = BaseClass.appiumDriver;
        if (browser.equals("safari") || browser.equals("edge") || browser.equals("ie") || setMobile.equals("on")) {
            textDecorationProperty = "text-decoration";
        } else {
            textDecorationProperty = "text-decoration-line";
        }
    }

    @DataProvider(name = "All Buttons CSS Props Test Data")
    public Object[][] getDefaultButtonTestData() {
        return new Object[][]{
                {"Tertiary Btn", btnPgObect.tertiaryBtn, new String[]{commonUtils.hex2Rgb("#505759"), commonUtils.hex2RgbWithoutTransparency("#505759")}, new String[]{commonUtils.hex2Rgb("#f5f5f5"), commonUtils.hex2RgbWithoutTransparency("#f5f5f5")}, "32px", "22px", "none"},
                {"Default Btn", btnPgObect.defaultBtn, new String[]{commonUtils.hex2Rgb("#505759"), commonUtils.hex2RgbWithoutTransparency("#505759")}, new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}, "32px", "22px", "none"},
                {"Primary Btn", btnPgObect.primaryBtn, new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}, new String[]{commonUtils.hex2Rgb("#047a9c"), commonUtils.hex2RgbWithoutTransparency("#047a9c")}, "32px", "22px", "none"},
                {"CTA Btn", btnPgObect.ctaBtn, new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#ffb81c"), commonUtils.hex2RgbWithoutTransparency("#ffb81c")}, "32px", "22px", "none"},
        };
    }

    @Test(testName = "Verify CSS Props Buttons Test", dataProvider = "All Buttons CSS Props Test Data", groups = "desktop-regression")
    private void verifyButtonTest(String type, By elem, String[] expColor, String[] expBgColor, String expHeight, String expBorRad, String expTextDecoration) {
        color = commonUtils.getCSSValue(elem, "color");
        backgroundColor = commonUtils.getCSSValue(elem, "background-color");
        height = commonUtils.getCSSValue(elem, "height");
        textDecoration = commonUtils.getCSSValue(elem, textDecorationProperty);
        for (String cssProperty : borderRadii) {
            borderRadius = commonUtils.getCSSValue(elem, cssProperty);
            isBorderRadius = commonUtils.assertValue(borderRadius, expBorRad, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderRadius);
        }
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty);
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, new String[]{"30px", "0px"});
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " is not as per spec, actual: " + backgroundColor);
        }
        isHeight = commonUtils.assertValue(height, expHeight, " Height of " + type + " is not as per spec");
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isBackgroundColor && isHeight && isTextDecoration);
    }

    @DataProvider(name = "Buttons Border Test Data")
    public Object[][] getButtonsBorderTestData() {
        return new Object[][]{
                {"Default Btn", false, btnPgObect.defaultBtn, "solid", new String[]{commonUtils.hex2Rgb("#c7c7c7"), commonUtils.hex2RgbWithoutTransparency("#c7c7c7")}, "1px"},
                {"Default Btn", true, btnPgObect.defaultBtn, "solid", new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, "1px"},
        };
    }

    @Test(testName = "Verify Buttons Border Test", dataProvider = "Buttons Border Test Data", groups = "desktop-regression")
    private void verifyButtonBorderTest(String type, boolean hover, By elem, String expStyle, String[] expColor, String expWidth) {
        if (hover) {
            if (browser.equals("safari") || browser.equals("firefox")) {
                throw new SkipException("Hover operation not yet supported in firefox/safari browser drivers");
            }
            commonUtils.hoverOnElement(elem);
        }
        for (String cssProperty : borderStyles) {
            borderStyle = commonUtils.getCSSValue(elem, cssProperty);
            isBorderStyle = commonUtils.assertValue(borderStyle, expStyle, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderStyle);
        }
        for (String cssProperty : borderColors) {
            borderColor = commonUtils.getCSSValue(elem, cssProperty);
            isBorderColor = commonUtils.assertCSSProperties("border-color", borderColor, expColor);
            if (!isBorderColor) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + borderColor);
            }
            Assert.assertTrue(isBorderColor);
        }
        for (String cssProperty : borderWidths) {
            borderWidth = commonUtils.getCSSValue(elem, cssProperty);
            isBorderWidth = commonUtils.assertValue(borderWidth, expWidth, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderWidth);
        }
    }

    @DataProvider(name = "Button-Hover state Test Data")
    public Object[][] getButtonHoverStateTestData() {
        return new Object[][]{
                {"Tertiary Btn", btnPgObect.tertiaryBtn, new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#dcdcdc"), commonUtils.hex2RgbWithoutTransparency("#dcdcdc")}},
                {"Default Btn", btnPgObect.defaultBtn, new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}},
                {"Primary Btn", btnPgObect.primaryBtn, new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}, new String[]{commonUtils.hex2Rgb("#005a70"), commonUtils.hex2RgbWithoutTransparency("#005a70")}},
                {"CTA Btn", btnPgObect.ctaBtn, new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#e89f00"), commonUtils.hex2RgbWithoutTransparency("#e89f00")}}

        };
    }

    @Test(testName = "Verify Button Test-Hover state", dataProvider = "Button-Hover state Test Data", groups = {"desktop-regression"})
    private void buttonHoverStateTest(String type, By elem, String[] expColor, String[] expBgColor) throws Exception {
        if (browser.equals("safari") || browser.equals("firefox")) {
            throw new SkipException("Hover operation not yet supported in firefox/safari browser drivers");
        }
        commonUtils.hoverOnElement(elem);
        color = commonUtils.getCSSValue(elem, "color");
        backgroundColor = commonUtils.getCSSValue(elem, "background-color");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " in hover state is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " in hover state is not as per spec, actual: " + backgroundColor);
        }
        Assert.assertTrue(isColor && isBackgroundColor);
    }

    @DataProvider(name = "Button-Focus state Test Data")
    public Object[][] getButtonFocusStateTestData() {
        return new Object[][]{
                {"Tertiary Btn", "tertiary-btn", new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#dcdcdc"), commonUtils.hex2RgbWithoutTransparency("#dcdcdc")}},
                {"Default Btn", "default-btn", new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}},
                {"Primary Btn", "primary-btn", new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}, new String[]{commonUtils.hex2Rgb("#005a70"), commonUtils.hex2RgbWithoutTransparency("#005a70")}},
                {"CTA Btn", "cta-btn", new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}, new String[]{commonUtils.hex2Rgb("#e89f00"), commonUtils.hex2RgbWithoutTransparency("#e89f00")}}
        };
    }

    @Test(testName = "Verify Button Test-Focus state", dataProvider = "Button-Focus state Test Data", groups = {"desktop-regression"})
    private void buttonFocusStateTest(String type, String elem, String[] expColor, String[] expBgColor) throws Exception {
        if (browser.equals("safari") || browser.equals("firefox")) {
            throw new SkipException("Focus operation not yet supported in firefox/safari browser drivers");
        }
        commonUtils.focusOnElementById(elem);
        color = commonUtils.getCSSValue(By.id(elem), "color");
        backgroundColor = commonUtils.getCSSValue(By.id(elem), "background-color");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " in focus state is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " in focus state is not as per spec, actual: " + backgroundColor);
        }
        Assert.assertTrue(isColor && isBackgroundColor);
    }

    @Test(testName = "Verify Default Button Test-Disabled", groups = {"desktop-regression"})
    private void defaultButtonDisabledStateTest() throws Exception {
        color = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "color");
        isColor = commonUtils.assertCSSProperties("color", color, new String[]{commonUtils.hex2Rgb("#C7C7C7"), commonUtils.hex2RgbWithoutTransparency("#C7C7C7")});
        if (!isColor) {
            log.info("Color of Default Button in Disabled state  not as per spec, actual: " + color);
        }
        backgroundColor = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "background-color");
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, new String[]{commonUtils.hex2Rgb("#E9E9E9"), commonUtils.hex2RgbWithoutTransparency("#E9E9E9")});
        if (!isBackgroundColor) {
            log.info("Bg Color of Default Button in Disabled state  not as per spec, actual: " + backgroundColor);
        }
        boxShadow = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "box-shadow");
        isBoxShadow = commonUtils.assertValue(boxShadow, "none", "Bos shadow of Default Button in Disabled state  not as per spec");
        Assert.assertTrue(isColor && isBoxShadow && isBackgroundColor);
    }

    @DataProvider(name = "Link Button Test Data")
    public Object[][] getLinkButtonTestData() {
        return new Object[][]{
                {"Link Btn", btnPgObect.linkBtn, new String[]{commonUtils.hex2Rgb("#047A9C"), commonUtils.hex2RgbWithoutTransparency("#047A9C")}, new String[]{"rgba(0, 0, 0, 0)", "rgb(0,0,0)", "transparent"}, new String[]{"0px"}, "underline"},
                {"Link Btn 2.0", btnPgObect.linkBtn2, new String[]{commonUtils.hex2Rgb("#047A9C"), commonUtils.hex2RgbWithoutTransparency("#047A9C")}, new String[]{"rgba(0, 0, 0, 0)", "rgb(0,0,0)", "transparent"}, new String[]{"4px"}, "underline"},
                {"link-button-2.0-disabled", btnPgObect.linkBtn2Disabled, new String[]{commonUtils.hex2Rgb("#6A7070"), commonUtils.hex2RgbWithoutTransparency("#6A7070")}, new String[]{"rgba(0, 0, 0, 0)", "rgb(0,0,0)"}, new String[]{"4px"}, "none"}
        };
    }

    @Test(testName = "Verify Link Button Test", dataProvider = "Link Button Test Data", groups = "desktop-regression")
    private void verifyLinkButtonTest(String type, By elem, String[] expColor, String[] expBgColor, String[] expPadding, String expTextDecoration) {
        color = commonUtils.getCSSValue(elem, "color");
        backgroundColor = commonUtils.getCSSValue(elem, "background-color");
        textDecoration = commonUtils.getCSSValue(elem, textDecorationProperty);
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty);
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, expPadding);
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " is not as per spec, actual: " + backgroundColor);
        }
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isBackgroundColor && isTextDecoration);
    }

    @DataProvider(name = "Link Button-Hover state Test Data")
    public Object[][] getLinkButtonHoverStateTestData() {
        return new Object[][]{
                {"Link Btn", btnPgObect.linkBtn, new String[]{commonUtils.hex2Rgb("#005A70"), commonUtils.hex2RgbWithoutTransparency("#005A70")}, "none"},
                {"Link Btn 2.0", btnPgObect.linkBtn2, new String[]{commonUtils.hex2Rgb("#047a9c"), commonUtils.hex2RgbWithoutTransparency("#047a9c")}, "none"}
        };
    }

    @Test(testName = "Verify Link Button Test-Hover state", dataProvider = "Link Button-Hover state Test Data", groups = {"desktop-regression"})
    private void linkButtonHoverStateTest(String type, By elem, String[] expColor, String expTextDecoration) throws Exception {
        if ((browser.equals("firefox")) || browser.equals("safari") || browser.equals("ie") || lBrowser.equals("firefox")) {
            throw new SkipException("Hover operation not yet supported in firefox/safari browser drivers");
        }
        commonUtils.hoverOnElement(elem);
        color = commonUtils.getCSSValue(elem, "color");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " is not as per spec, actual: " + color);
        }
        textDecoration = commonUtils.getCSSValue(elem, textDecorationProperty);
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isTextDecoration);
    }

    @DataProvider(name = "Link Button-Focus state Test Data")
    public Object[][] getLinkButtonFocusStateTestData() {
        return new Object[][]{
                {"Link Btn", "link-btn", new String[]{commonUtils.hex2Rgb("#005A70"), commonUtils.hex2RgbWithoutTransparency("#005A70")}, "none"},
                {"Link Btn 2.0", "link-btn-2.0", new String[]{commonUtils.hex2Rgb("#047a9c"), commonUtils.hex2RgbWithoutTransparency("#047a9c")}, "none"}
        };
    }

    @Test(testName = "Verify Link Button Test-Focus state", dataProvider = "Link Button-Focus state Test Data", groups = {"desktop-regression"})
    private void linkButtonFocusStateTest(String type, String elem, String[] expColor, String expTextDecoration) throws Exception {
        if (browser.equals("safari") || browser.equals("firefox") || browser.equals("ie")) {
            throw new SkipException("Focus operation not yet supported in firefox/safari browser drivers");
        }
        commonUtils.focusOnElementById(elem);
        color = commonUtils.getCSSValue(By.id(elem), "color");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " in Focus state is not as per spec, actual: " + color);
        }
        textDecoration = commonUtils.getCSSValue(By.id(elem), textDecorationProperty);
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isTextDecoration);
    }

    @DataProvider(name = "Size Buttons Test Data")
    public Object[][] getSizeButtonsTestData() {
        return new Object[][]{
                {"small btn", btnPgObect.smallBtn, new String[]{"14px"}, new String[]{"32px"}, "32px"},
                {"large btn", btnPgObect.largeBtn, new String[]{"16px"}, new String[]{"40px"}, "40px"}
        };
    }

    @Test(testName = "Size Buttons Test", dataProvider = "Size Buttons Test Data", groups = "desktop-regression")
    private void sizeButtonsTest(String type, By elem, String[] expFontSize, String[] expLineHt, String expHeight) {
        fontSize = commonUtils.getCSSValue(elem, "font-size");
        lineHeight = commonUtils.getCSSValue(elem, "line-height");
        height = commonUtils.getCSSValue(elem, "height");
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty);
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, new String[]{"30px", "0px"});
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isFontSize = commonUtils.assertCSSProperties("font-size", fontSize, expFontSize);
        if (!isFontSize) {
            log.info(" Font size of " + type + " is not as per spec, actual: " + fontSize);
        }
        isLineHeight = commonUtils.assertCSSProperties("line-height", lineHeight, expLineHt);
        if (!isLineHeight) {
            log.info(" Line height of " + type + " is not as per spec, actual: " + lineHeight);
        }
        isHeight = commonUtils.assertValue(height, expHeight, " Height of " + type + " is not as per spec");
        Assert.assertTrue(isFontSize && isLineHeight && isHeight);
    }

    @DataProvider(name = "Buttons with Icon Test Data")
    public Object[][] getButtonsWithIconTestData() {
        return new Object[][]{
                {"small btn with calendar 18-icon", "#small-btn-calendar18icon > svg", "pe-icon--calendar-18", new String[]{commonUtils.hex2Rgb("#505759"), commonUtils.hex2RgbWithoutTransparency("#505759")}},
                {"large btn with calendar 18-icon", "#large-btn-calendar18icon > svg", "pe-icon--calendar-18", new String[]{commonUtils.hex2Rgb("#252525"), commonUtils.hex2RgbWithoutTransparency("#252525")}},
                {"small btn with calendar 24-icon", "#small-btn-calendar24icon > svg", "pe-icon--calendar-24", new String[]{commonUtils.hex2Rgb("#ffffff"), commonUtils.hex2RgbWithoutTransparency("#ffffff")}},
                {"large btn with calendar 24-icon", "#large-btn-calendar24icon > svg", "pe-icon--calendar-24", new String[]{commonUtils.hex2Rgb("#505759"), commonUtils.hex2RgbWithoutTransparency("#505759")}},
        };
    }

    @Test(testName = "Buttons with Icon Test", dataProvider = "Buttons with Icon Test Data", groups = "desktop-regression")
    private void buttonsWithIconTest(String type, String elem, String expClass, String[] expColor) {
        className = commonUtils.getAttributeValue(By.cssSelector(elem), "class");
        isClassName = commonUtils.assertValue(className, expClass, "Calendar icon for " + type + " is not as per spec");
        color = commonUtils.getCSSValue(By.cssSelector(elem), "color");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info("Color of the icon for " + type + " is not as per spec, actual : " + color);
        }
        Assert.assertTrue(isClassName && isColor);
    }


    /**
     * Mobile Tests
     */

    @Test(testName = "Mobiel : Verify CSS Props Buttons Test", dataProvider = "All Buttons CSS Props Test Data", groups = "mobile-regression")
    private void verifyButtonMobileTest(String type, By elem, String[] expColor, String[] expBgColor, String expHeight, String expBorRad, String expTextDecoration) {
        color = commonUtils.getCSSValue(elem, "color", "mobile");
        backgroundColor = commonUtils.getCSSValue(elem, "background-color", "mobile");
        height = commonUtils.getCSSValue(elem, "height", "mobile");
        textDecoration = commonUtils.getCSSValue(elem, textDecorationProperty, "mobile");
        for (String cssProperty : borderRadii) {
            borderRadius = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isBorderRadius = commonUtils.assertValue(borderRadius, expBorRad, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderRadius);
        }
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, new String[]{"30px", "0px"});
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " is not as per spec, actual: " + backgroundColor);
        }
        isHeight = commonUtils.assertValue(height, expHeight, " Height of " + type + " is not as per spec");
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isBackgroundColor && isHeight && isTextDecoration);
    }

    @Test(testName = "Mobile : Verify Buttons Border Test", dataProvider = "Buttons Border Test Data", groups = "mobile-regression")
    private void verifyButtonBorderMobileTest(String type, boolean hover, By elem, String expStyle, String[] expColor, String expWidth) {
        for (String cssProperty : borderStyles) {
            borderStyle = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isBorderStyle = commonUtils.assertValue(borderStyle, expStyle, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderStyle);
        }
        for (String cssProperty : borderColors) {
            borderColor = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isBorderColor = commonUtils.assertCSSProperties("border-color", borderColor, expColor);
            if (!isBorderColor) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + borderColor);
            }
            Assert.assertTrue(isBorderColor);
        }
        for (String cssProperty : borderWidths) {
            borderWidth = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isBorderWidth = commonUtils.assertValue(borderWidth, expWidth, cssProperty + " of " + type + " is not as per spec");
            Assert.assertTrue(isBorderWidth);
        }
    }


    @Test(testName = "Moile : Verify Default Button Test-Disabled", groups = {"mobile-regression"})
    private void defaultButtonDisabledStateMobileTest() throws Exception {
        color = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "color", "mobile");
        isColor = commonUtils.assertCSSProperties("color", color, new String[]{commonUtils.hex2Rgb("#C7C7C7"), commonUtils.hex2RgbWithoutTransparency("#C7C7C7")});
        if (!isColor) {
            log.info("Color of Default Button in Disabled state  not as per spec, actual: " + color);
        }
        backgroundColor = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "background-color", "mobile");
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, new String[]{commonUtils.hex2Rgb("#E9E9E9"), commonUtils.hex2RgbWithoutTransparency("#E9E9E9")});
        if (!isBackgroundColor) {
            log.info("Bg Color of Default Button in Disabled state  not as per spec, actual: " + backgroundColor);
        }
        boxShadow = commonUtils.getCSSValue(btnPgObect.defaultBtnDisabled, "box-shadow", "mobile");
        isBoxShadow = commonUtils.assertValue(boxShadow, "none", "Bos shadow of Default Button in Disabled state  not as per spec");
        Assert.assertTrue(isColor && isBoxShadow && isBackgroundColor);
    }


    @Test(testName = "Mobile : Verify Link Button Test", dataProvider = "Link Button Test Data", groups = "mobile-regression")
    private void verifyLinkButtonMobileTest(String type, By elem, String[] expColor, String[] expBgColor, String[] expPadding, String expTextDecoration) {
        color = commonUtils.getCSSValue(elem, "color", "mobile");
        backgroundColor = commonUtils.getCSSValue(elem, "background-color", "mobile");
        textDecoration = commonUtils.getCSSValue(elem, textDecorationProperty, "mobile");
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, expPadding);
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info(" Color of " + type + " is not as per spec, actual: " + color);
        }
        isBackgroundColor = commonUtils.assertCSSProperties("background-color", backgroundColor, expBgColor);
        if (!isBackgroundColor) {
            log.info(" Bg Color of " + type + " is not as per spec, actual: " + backgroundColor);
        }
        isTextDecoration = commonUtils.assertValue(textDecoration, expTextDecoration, "Text decoration of " + type + " is not as per spec");
        Assert.assertTrue(isColor && isBackgroundColor && isTextDecoration);
    }

    @Test(testName = "Mobile : Size Buttons Test", dataProvider = "Size Buttons Test Data", groups = "mobile-regression")
    private void sizeButtonsMobileTest(String type, By elem, String[] expFontSize, String[] expLineHt, String expHeight) {
        fontSize = commonUtils.getCSSValue(elem, "font-size", "mobile");
        lineHeight = commonUtils.getCSSValue(elem, "line-height", "mobile");
        height = commonUtils.getCSSValue(elem, "height", "mobile");
        for (String cssProperty : paddings) {
            padding = commonUtils.getCSSValue(elem, cssProperty, "mobile");
            isPadding = commonUtils.assertCSSProperties(cssProperty, padding, new String[]{"30px", "0px"});
            if (!isPadding) {
                log.info(cssProperty + " of " + type + " is not as per spec, actual: " + padding);
            }
            Assert.assertTrue(isPadding);
        }
        isFontSize = commonUtils.assertCSSProperties("font-size", fontSize, expFontSize);
        if (!isFontSize) {
            log.info(" Font size of " + type + " is not as per spec, actual: " + fontSize);
        }
        isLineHeight = commonUtils.assertCSSProperties("line-height", lineHeight, expLineHt);
        if (!isLineHeight) {
            log.info(" Line height of " + type + " is not as per spec, actual: " + lineHeight);
        }
        isHeight = commonUtils.assertValue(height, expHeight, " Height of " + type + " is not as per spec");
        Assert.assertTrue(isFontSize && isLineHeight && isHeight);
    }

    @Test(testName = "Mobile : Buttons with Icon Test", dataProvider = "Buttons with Icon Test Data", groups = "mobile-regression")
    private void buttonsWithIconMobileTest(String type, String elem, String expClass, String[] expColor) {
        className = commonUtils.getAttributeValue(By.cssSelector(elem), "class", "mobile");
        isClassName = commonUtils.assertValue(className, expClass, "Calendar icon for " + type + " is not as per spec");
        color = commonUtils.getCSSValue(By.cssSelector(elem), "color", "mobile");
        isColor = commonUtils.assertCSSProperties("color", color, expColor);
        if (!isColor) {
            log.info("Color of the icon for " + type + " is not as per spec, actual : " + color);
        }
        Assert.assertTrue(isClassName && isColor);
    }

    /*************
     * Common methods
     ************/
    @BeforeMethod(alwaysRun = true)
    private void beforeMethod(Method method) {
        System.out.println("Test Method----> " + this.getClass().getSimpleName() + "::" + method.getName());
        if (setDesktop.equals("on")) {
            commonUtils.getUrl(url);
        } else if (setMobile.equals("on")) {
            commonUtils.getUrl(url, "mobile");
        }
    }

    @AfterMethod(alwaysRun = true)
    private void afterMethod() {
        System.out.println("_________________________________________________");
    }

}
