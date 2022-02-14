package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ApplicationManager {
    WebDriver wd;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GpoupHelper gpoupHelper;
    private ContactHelper contactHelper;


    public void init() {
        wd = new ChromeDriver();
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
