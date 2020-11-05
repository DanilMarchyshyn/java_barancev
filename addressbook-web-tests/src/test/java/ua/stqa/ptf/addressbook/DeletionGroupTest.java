package ua.stqa.ptf.addressbook;

import org.testng.annotations.Test;

public class DeletionGroupTest extends TestBase {


  @Test
  public void testDeletionGroup() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }

}
