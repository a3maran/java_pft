package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import static org.openqa.selenium.remote.BrowserType.EDGE;

public class TestBase {

  public final ApplicationManager app = new ApplicationManager(EDGE);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

}
