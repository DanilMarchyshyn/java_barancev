package ua.stqa.ptf.addressbook;

import org.testng.annotations.*;


public class CreationGroupTest extends TestBase {

  @Test
  public void testCreationGroup() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("GroupName4", "test4", "test4"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
