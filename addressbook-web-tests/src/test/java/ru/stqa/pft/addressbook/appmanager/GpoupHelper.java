package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

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
        type(By.name("group_name"), groupData.name());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    public void initGroupCreation() {
        click(By.xpath("//input[@name='new']"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//input[@name='delete']"));
    }

    public void selectGroup() {
        click(By.xpath("//input[@name='selected[]']"));
    }


}
