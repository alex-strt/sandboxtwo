package ua.com.rozetka.tests;

import org.testng.annotations.Test;
import ua.com.rozetka.itemsname.ItemOne;
import ua.com.rozetka.itemsname.ItemTwo;
import ua.com.rozetka.serviceclasses.TestBase;


public class TestCaseTwo extends TestBase {

        @Test
    public void testUntitledTestCase() throws Exception {
        testURL.goToTestURL();
        sessionHelper.login("alfabravo1233@gmail.com", "TEST123test");
        itemOperation.searchFirstItem(new ItemOne("ноутбук"));
        itemOperation.returnToHomepage();
        itemOperation.searchSecondItem(new ItemTwo("смартфон"));
        //popUpCloser.popUpClose();
        sessionHelper.logOut();

    }

}
