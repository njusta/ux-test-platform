package glpTests.functionalTests;

import com.google.gson.JsonObject;
import elementsSDK.functional.functionalPageObjects.FunctionalButtonsPageObjects;
import elementsSDKTests.functionalTests.ButtonsTest;
import glp.functional.functionalPageObjects.GlpFunctButtonPageObjects;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import utilities.BaseClass;

import java.io.File;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by udhadpa on 11/17/17.
 */
public class GLPButtonsTest extends BaseClass {

    private final String buttonsUrl = "http://localhost:8000/src/main/java/glp/functional/fixtures/buttons.html";
    private final String absButtonsJSFilePath = new File("elementsSDK/functional/jsfiles/buttons/buttons.js").getAbsolutePath();
    private final String buttonsJSFilePath = constructPath(absButtonsJSFilePath);
    private final String absTempJSFilePath = new File("elementsSDK/functional/jsfiles/buttons/temp.js").getAbsolutePath();
    private final String tempJSFilePath = constructPath(absTempJSFilePath);

    private String testConfig = "", beforeFinalFormat = "", finalConfig = "", attribute = "", browserLogs = "", backgroundColor = "", lineHeight = "", height = "", fontSize = "", alertText = "";
    private static String browser = "";
    private final String incorrectElementIdErrorMsg = "Target container is not a DOM element";
    private final String incorrectComponentNameErrorMsg = "type is invalid";
    boolean isBackgroundColor = false, isAttribute = false, result = false, isLineHeight = false, isHeight = false, isFontSize = false, isAlertText = false;
    JavascriptExecutor js = null;
    WebElement element = null;
    Alert alert = null;
    JsonObject jsonDetailObject = null, jsonDetailPropertiesObject = null;
    //private String testConfig = "", fileContentsInAString = "", postFixConfig = "", preFixConfig = "", browserLogs = "", linksArrayValue = "", fontSize = "", marginBottom = "", lineHeight = "", color = "", beforeFinalFormat = "", finalFormat = "", finalConfig = "", textDecoration = "", textDecorationProperty = "", paddingBottom = "";
    Map<String, String> detailPropertiesMap = null, propsPropertiesMap = null;
    Map<String, JsonObject> propsConfigMap = null;
    JsonObject propsJsonObject = null;
    private String preConfigStr1 = "function init() {";
    private String preConfigStr2 = "document.body.dispatchEvent(new CustomEvent('o.InitCoachMark', ";
    private String postConfigStr1 = "));}window.onload = init;";

    final static Logger log = Logger.getLogger(GLPButtonsTest.class.getName());
    GlpFunctButtonPageObjects glpFuncBtnPgObj = null;

    @BeforeClass(alwaysRun = true)
    private void buttonsTestBeforeClass() {
        glpFuncBtnPgObj = new GlpFunctButtonPageObjects();
        if (!runEnv.equals("sauce")) {
            browser = BaseClass.localBrowser;
        } else {
            browser = BaseClass.sauceBrowser;
        }
    }

    @Test(testName = "test", groups = "desktop-regression")
    private void test() throws Exception {
        String[] detailsPropertiesList = new String[]{"elementId", "button-target", "componentName", "Button"};
        String[] propsPropertiesList = new String[]{"btnType", "cta", "btnSize", "large", "children", "children"};
        setConfigAndLaunch(detailsPropertiesList, propsPropertiesList);
        commonUtils.printFileContents(buttonsJSFilePath);
    }

        
    /**
     * Common Methods
     */

    private String buildJSONObjectDetailConfig(String[] detailsPropertiesList, String[] propsPropertiesList) throws Exception {
        int i = 0;
        if (!((detailsPropertiesList.length % 2 == 0) && ((propsPropertiesList.length % 2 == 0)))) {
            log.info("Pass even set of parameters.");
            return null;
        } else {
            //prepare the map for detail properties
            detailPropertiesMap = new LinkedHashMap<String, String>();
            for (i = 0; i < (detailsPropertiesList.length - 1); i = i + 2) {
                detailPropertiesMap.put(detailsPropertiesList[i], detailsPropertiesList[i + 1]);
            }

            //prepare the map for prop properties
            propsPropertiesMap = new LinkedHashMap<String, String>();
            for (i = 0; i < (propsPropertiesList.length - 1); i = i + 2) {
                propsPropertiesMap.put(propsPropertiesList[i], propsPropertiesList[i + 1]);
            }

            //build the props json object from the prop properties
            propsJsonObject = new JsonObject();
            for (Map.Entry<String, String> entry : propsPropertiesMap.entrySet()) {
                propsJsonObject.addProperty(entry.getKey(), entry.getValue());
            }

            //package the props json object into "props" key
            propsConfigMap = new LinkedHashMap<String, JsonObject>();
            propsConfigMap.put("opts", propsJsonObject);

            //build the detail properties json object
            jsonDetailObject = new JsonObject();
            jsonDetailPropertiesObject = new JsonObject();
            for (Map.Entry<String, String> entry : detailPropertiesMap.entrySet()) {
                jsonDetailPropertiesObject.addProperty(entry.getKey(), entry.getValue());
            }

            //add the props json object into detail properties json object
            for (Map.Entry<String, JsonObject> entry : propsConfigMap.entrySet()) {
                jsonDetailPropertiesObject.addProperty(entry.getKey(), String.valueOf(entry.getValue()));
            }

            //add detail properties json object to 'detail' attribute
            jsonDetailObject.add("detail", jsonDetailPropertiesObject);
            beforeFinalFormat = jsonDetailObject.toString().replaceAll("\\\\", "").replaceAll("\"\\{", "\\{").replaceAll("\\}\"", "\\}").replaceAll("\"", "").replaceAll(":", ":'").replaceAll(",", "',").replaceAll("'\\{", "\\{").replaceAll("'\\[", "\\[").replaceAll("\\]'", "'\\]").replaceAll("''", "'").replaceAll("' '", "'").replaceAll("\\}\\]", "'\\}\\]").replaceAll("\\}'", "\\}").replaceAll("'\\},", "\\},").replaceAll("\\},\\{text", "'\\},\\{text").replaceAll("'true'", "true").replaceAll("'true", "true").replaceAll("'false'", "false").replaceAll("'false", "false");

            finalConfig = preConfigStr1 + "\n" + preConfigStr2 + beforeFinalFormat + postConfigStr1;
            return finalConfig;
        }
    }

    private void setConfigAndLaunch(String[] detailsPropertiesList, String[] propsPropertiesList) throws Exception {
        testConfig = buildJSONObjectDetailConfig(detailsPropertiesList, propsPropertiesList);
        commonUtils.changeConfig(buttonsJSFilePath, testConfig);
        commonUtils.getUrl(buttonsUrl);
    }

    private void setConfigAndLaunch(String[] detailsPropertiesList, String[] propsPropertiesList, String mobile) throws Exception {
        testConfig = buildJSONObjectDetailConfig(detailsPropertiesList, propsPropertiesList);
        commonUtils.changeConfig(buttonsJSFilePath, testConfig);
        commonUtils.getUrl(buttonsUrl, "mobile");
    }

    private String constructPath(String absolutePath) {
        String path = absolutePath.substring(0, absolutePath.lastIndexOf("elementsSDK/functional")) + "src/main/java/" + absolutePath.substring(absolutePath.indexOf("elementsSDK/functional"));
        return path;
    }

    @BeforeMethod(alwaysRun = true)
    private void beforeMethod(Method method) throws Exception {
        System.out.println("Test Method----> " + this.getClass().getSimpleName() + "::" + method.getName());
    }

    @AfterMethod(alwaysRun = true)
    private void afterMethod() {
        System.out.println("_________________________________________________");
    }
}
