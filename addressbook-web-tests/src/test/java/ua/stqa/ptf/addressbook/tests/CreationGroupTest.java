package ua.stqa.ptf.addressbook.tests;

import org.testng.annotations.*;
import ua.stqa.ptf.addressbook.model.GroupData;


public class CreationGroupTest extends TestBase {

  @Test
  public void testCreationGroup() throws Exception {
    app.gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("GroupName4", "test4", "test4"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
