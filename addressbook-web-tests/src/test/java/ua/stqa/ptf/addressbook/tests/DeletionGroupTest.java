package ua.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;

public class DeletionGroupTest extends TestBase {


  @Test
  public void testDeletionGroup() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
