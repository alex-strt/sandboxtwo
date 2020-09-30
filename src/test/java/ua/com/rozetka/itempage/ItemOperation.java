package ua.com.rozetka.itempage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.com.rozetka.itemsname.Item;
import ua.com.rozetka.itemsname.ItemOne;
import ua.com.rozetka.itemsname.ItemTwo;

public class ItemOperation extends HelperBase {

    public ItemOperation(WebDriver driver) {
        super(driver);
    }


    public void itemFeatureCombination() {
        click(By.cssSelector("span.goods-tile__title"));
        click(By.xpath("//a[contains(text(),'Характеристики')]"));
        click(By.xpath("(//a[contains(@href, 'https://rozetka.com.ua/acer_nx_hvgeu_006/p211390015/comments/')])[2]"));
        click(By.xpath("//a[contains(text(),'Видеообзор')]"));
        click(By.linkText("Фото"));
        click(By.xpath("//a[contains(text(),'Покупают вместе')]"));
    }

    public void searchItem(Item item1) {
        type(By.xpath("//input[@name='search']"), item1.getItem());
        click(By.cssSelector("button.button.button_color_green.button_size_medium.search-form__submit"));
    }



    public void searchFirstItem(ItemOne itemOne1) {
        type(By.xpath("//input[@name='search']"), itemOne1.getItemOne());
        click(By.cssSelector("button.button.button_color_green.button_size_medium.search-form__submit"));
    }


    public void searchSecondItem(ItemTwo itemTwo1) {
        type(By.xpath("//input[@name='search']"), itemTwo1.getItemTwo());
        click(By.cssSelector("button.button.button_color_green.button_size_medium.search-form__submit"));
    }


    public void returnToHomepage() {
        click(By.xpath("//img[@alt='Интернет магазин Rozetka.ua - №1']"));
    }


}
