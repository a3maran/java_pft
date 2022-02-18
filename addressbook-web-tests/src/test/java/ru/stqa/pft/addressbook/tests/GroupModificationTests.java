package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGpoupHelper().selectGroup();
    app.getGpoupHelper().ininGroupModification();
    app.getGpoupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGpoupHelper().submitGroupModification();
    app.getGpoupHelper().returnToGroupPage();
  }
}
