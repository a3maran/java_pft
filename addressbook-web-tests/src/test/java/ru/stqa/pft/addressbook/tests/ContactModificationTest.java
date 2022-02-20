package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModifocation() {
    app.getContactHelper().returnToHomePage();
    if(! app.getContactHelper().isThereAContact()){  //если ни одного контакта не существует в списке
      app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test1")); //создать контакт
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", null), false);
    app.getContactHelper().returnToHomePage();
  }

}
