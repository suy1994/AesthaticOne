package base;

import Listeners.WebEventListener;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import util.ExcelApiTest;
import util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public static SoftAssert sa;
    public static ExtentTest extentTest;
    public static ExcelApiTest excel;


    public TestBase() {
        PageFactory.initElements(driver,this);
    }

    @BeforeTest
    public static void initialization() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.silentOutput", "true");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-notifications");
            driver = new ChromeDriver(options);
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

//        e_driver = new EventFiringWebDriver(driver);
////         Now create object of EventListerHandler to register it with EventFiringWebDriver
//        eventListener = new WebEventListener();
//        e_driver.register(eventListener);
//        driver = e_driver;

        driver.manage().deleteAllCookies();
//        driver.manage().window().setSize(new Dimension(1440, 945));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

//        driver.get(prop.getProperty("url"));
    }

    public void createSoftAssertObject() {
        sa = new SoftAssert();
    }

    public static void createExcelSheetObject(){
        try {
            excel = new ExcelApiTest(System.getProperty("user.dir") + "/src/main/java/testdata/PhysicianTestData.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    @AfterTest
//    public void teardown(){
//        driver.quit();
//    }


}
