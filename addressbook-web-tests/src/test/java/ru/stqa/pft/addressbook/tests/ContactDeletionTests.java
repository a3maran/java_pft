package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().returnToHomePage();
    if(! app.getContactHelper().isThereAContact()){  //если ни одного контакта не существует в списке
      app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4")); //создать контакт
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deletContact();
    app.getContactHelper().acceptCloseWindow();
  }

}
