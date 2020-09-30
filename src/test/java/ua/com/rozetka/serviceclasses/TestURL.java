package ua.com.rozetka.serviceclasses;

import org.openqa.selenium.WebDriver;

public class TestURL {
    public WebDriver driver;

    public TestURL(WebDriver driver) {
        this.driver = driver;
    }

    public void goToTestURL() {
       driver.get("https://rozetka.com.ua/");
    }
}
