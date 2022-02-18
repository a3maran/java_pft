package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.firstname());
    type(By.name("lastname"), contactData.lastname());
    type(By.name("address"), contactData.address());
    type(By.name("email"), contactData.email());
    click(By.xpath("//input[21]"));
  }

  public void initAddNewContact() {
    click(By.linkText("add new"));
  }

  public void returnToHomePage() {
    click(By.xpath("//a[contains(text(),'home')]"));
  }

  public void selectContact() {
    click(By.xpath("//input[@id='1']"));
  }

  public void deletContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void acceptCloseWindow() {
    wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[5]/td[8]/a/img"));
  }
}
