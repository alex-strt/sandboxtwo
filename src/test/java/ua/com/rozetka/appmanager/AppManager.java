package ua.com.rozetka.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.com.rozetka.itempage.ItemOperation;
import ua.com.rozetka.personalaccount.SessionHelper;
import ua.com.rozetka.serviceclasses.PopUpCloser;
import ua.com.rozetka.serviceclasses.TestURL;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AppManager {
    public WebDriver driver;
    protected SessionHelper sessionHelper;
    protected TestURL testURL;
    protected PopUpCloser popUpCloser;
    protected ItemOperation itemOperation;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\third\\storage\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        itemOperation = new ItemOperation(driver);
        popUpCloser = new PopUpCloser(driver);
        testURL = new TestURL(driver);
        sessionHelper = new SessionHelper(driver);

    }

    public void close() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }
}
