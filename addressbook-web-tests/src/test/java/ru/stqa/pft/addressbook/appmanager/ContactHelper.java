package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("email"), contactData.getEmail());
    //if (creation) { //если это создание контакта, то
   //   new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup()); //выбор элемента из выпадающего списка
   // } else { //иначе, это модификация и поля выбора группы нет
   //   Assert.assertFalse(isElementPresent(By.name("new_group")));
    //}
  }


  public void initAddNewContact() {
    click(By.linkText("add new"));
  }

  public void returnToHomePage() {
    click(By.xpath("//a[contains(text(),'home')]"));
  }

  public void selectContact() {
    click(By.xpath("//td/input[@type ='checkbox']"));
  }

  public void deletContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void acceptCloseWindow() {
    wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//img[@src='icons/pencil.png']"));
  }

  public void submitContactCreation() {
    click(By.xpath("//input[21]"));
  }


  public void createContact(ContactData contact) {
    initAddNewContact();
    fillContactForm(contact, true);
    submitContactCreation();
    returnToHomePage();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//td/input[@type ='checkbox']"));
  }
}