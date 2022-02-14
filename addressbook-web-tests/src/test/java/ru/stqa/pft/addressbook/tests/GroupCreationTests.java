package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGpoupHelper().initGroupCreation();
    app.getGpoupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGpoupHelper().submitGroupCreation();
    app.getGpoupHelper().returnToGroupPage();
  }

}
