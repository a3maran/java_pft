package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GpoupHelper extends HelperBase {

  public GpoupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    click(By.xpath("//input[@name='submit']"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.xpath("//input[@name='new']"));
  }

  public void deleteSelectedGroups() {
    click(By.xpath("//input[@name='delete']"));
  }

  public void selectGroup(int index) {
    wd.findElements(By.xpath("//input[@name='selected[]']")).get(index).click();
  }


  public void ininGroupModification() {
    click(By.xpath("//input[@name='edit']"));
  }

  public void submitGroupModification() {
    click(By.xpath("//input[@name='update']"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
    returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.xpath("//input[@name='selected[]']"));
  }

  public int getGroupCount() {
    return wd.findElements(By.xpath("//input[@name='selected[]']")).size();
  }

  public List<GroupData> getGroupList() {
    List<GroupData> groups=new ArrayList<GroupData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element: elements) {
      String name = element.getText();
      GroupData group = new GroupData(name, null, null);
      groups.add(group);
    }
    return groups;
  }
}
