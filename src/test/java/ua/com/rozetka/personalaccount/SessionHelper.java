package ua.com.rozetka.personalaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.com.rozetka.itempage.HelperBase;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password) {
        click(By.xpath("//a[contains(text(),'войдите в личный кабинет')]"));
        type(By.xpath("//input[@id='auth_email']"), username);
        click(By.cssSelector("div.modal__content"));
        type(By.xpath("//input[@id='auth_pass']"), password);
        click(By.cssSelector("button.button.button--large.button--green.auth-modal__submit"));
    }

    public void logOut() {
        click(By.linkText("Джон Смит"));
        click(By.linkText("Выход"));
    }

}
