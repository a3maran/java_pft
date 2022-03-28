package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGpoupHelper().isThereAGroup()) {  //если ни одной группы не существует в списке
      app.getGpoupHelper().createGroup(new GroupData("test1", null, null)); //создать группу
    }
    List<GroupData> befor = app.getGpoupHelper().getGroupList();
    app.getGpoupHelper().selectGroup(befor.size()-1);
    app.getGpoupHelper().ininGroupModification();
    app.getGpoupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGpoupHelper().submitGroupModification();
    app.getGpoupHelper().returnToGroupPage();
    List<GroupData> after = app.getGpoupHelper().getGroupList();
    Assert.assertEquals(befor.size(), after.size());
  }
}
