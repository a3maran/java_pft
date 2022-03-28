package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> befor = app.getGpoupHelper().getGroupList();
    app.getGpoupHelper().createGroup(new GroupData("test1", null, null));
    List<GroupData> after = app.getGpoupHelper().getGroupList();
    Assert.assertEquals(after.size(), befor.size() + 1);
  }

}
