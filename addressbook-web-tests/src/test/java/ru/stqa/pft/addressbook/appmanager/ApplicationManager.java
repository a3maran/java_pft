package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.openqa.selenium.remote.BrowserType.*;


public class ApplicationManager {
  WebDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GpoupHelper gpoupHelper;
  private ContactHelper contactHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    if (!browser.equals(CHROME)) {
      if (browser.equals(FIREFOX)) {
        wd = new FirefoxDriver();
      } else if (browser.equals(EDGE)) {
        wd = new EdgeDriver();
      }
    } else {
      wd = new ChromeDriver();
    }
    /* wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); */
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    wd.get("http://localhost/addressbook/group.php");
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
    gpoupHelper = new GpoupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    contactHelper = new ContactHelper(wd);
  }


  public void stop() {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public GpoupHelper getGpoupHelper() {
    return gpoupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
