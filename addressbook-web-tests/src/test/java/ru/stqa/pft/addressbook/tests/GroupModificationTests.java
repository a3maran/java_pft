package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGpoupHelper().isThereAGroup()){  //если ни одной группы не существует в списке
      app.getGpoupHelper().createGroup(new GroupData("test1", null, null)); //создать группу
    }
    app.getGpoupHelper().selectGroup();
    app.getGpoupHelper().ininGroupModification();
    app.getGpoupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGpoupHelper().submitGroupModification();
    app.getGpoupHelper().returnToGroupPage();
  }
}
