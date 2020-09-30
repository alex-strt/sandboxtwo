package ua.com.rozetka.serviceclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.com.rozetka.itempage.HelperBase;

public class PopUpCloser extends HelperBase {


    public PopUpCloser(WebDriver driver) {
        super(driver);
    }

    public void popUpClose() {
        click(By.cssSelector("span.exponea-close-cross"));
    }
}
