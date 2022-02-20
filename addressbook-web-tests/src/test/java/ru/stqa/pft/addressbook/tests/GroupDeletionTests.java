package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGpoupHelper().isThereAGroup()){  //если ни одной группы не существует в списке
      app.getGpoupHelper().createGroup(new GroupData("test1", null, null)); //создать группу
    }
    app.getGpoupHelper().selectGroup();
    app.getGpoupHelper().deleteSelectedGroups();
    app.getGpoupHelper().returnToGroupPage();
  }

}
