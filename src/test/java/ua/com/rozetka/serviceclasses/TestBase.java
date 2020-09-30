package ua.com.rozetka.serviceclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.com.rozetka.appmanager.AppManager;

public class TestBase extends AppManager {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        init();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        close();
    }

}
