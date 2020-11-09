package ua.stqa.ptf.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.stqa.ptf.addressbook.appmanager.ApplicationsManager;

public class TestBase {

    protected final ApplicationsManager app = new ApplicationsManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
