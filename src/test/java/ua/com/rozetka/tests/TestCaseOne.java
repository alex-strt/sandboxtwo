package ua.com.rozetka.tests;

import org.testng.annotations.Test;
import ua.com.rozetka.itemsname.Item;
import ua.com.rozetka.serviceclasses.TestBase;


public class TestCaseOne extends TestBase {


    @Test
    public void testUntitledTestCase() throws Exception {
        testURL.goToTestURL();
        sessionHelper.login("alfabravo1233@gmail.com", "TEST123test");
        itemOperation.searchItem(new Item("ноутбук"));
        itemOperation.itemFeatureCombination();
        //popUpCloser.popUpClose();
        sessionHelper.logOut();
    }

}
