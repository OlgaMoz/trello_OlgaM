package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTestsN extends  TestBase{
  @Test
  public void testTeamCreationFromPlusButtonOnHeader() throws InterruptedException {
    int before = getTeamsCount();
      System.out.println("before: " + before);
   /* clickOnPlusButtonOnHeader();
    //selectCreateTeamFromDropDown();
    selectCreateTeamFromDropDoun();
   // String teamName = "qa21";
    fillTeamCreationForm("qa21", "descr qa 21");
    clickContinueButton();
   // String createdTeamName = getTeamNameFromTeamPage();
    returnToHomePage();
    int after = getTeamsCount();
    Assert.assertEquals(after, before+1);*/
   // Assert.assertEquals(createdTeamName.toLowerCase(), teamName.toLowerCase());
  }

 /* @Test
  public void testTeamCreationFromLeftNavMenu() throws InterruptedException {
    int before = getTeamsCount();
    clickOnPlusButtonOnLeftNavMenu();
    fillTeamCreationForm("h", "g");
    clickContinueButton();
    String createdTeamName = getTeamNameFromTeamPage();
    returnToHomePage();
    int after = getTeamsCount();

    Assert.assertEquals(after, before+1);
    Assert.assertEquals(createdTeamName, "h");
  }

  public void clickOnPlusButtonOnLeftNavMenu() {
    click(By.cssSelector(".icon-add.icon-sm"));
  }

  @Test(enabled=false)
  public void testTeamCuncellCreationFromPlusButtonOnHeader(){
    clickOnPlusButtonOnHeader();
    selectCreateTeamFromDropDown();
    fillTeamCreationForm("qa21", "descr qa 21");
    clickXButton();
    //Assert


    Assert.assertTrue(isUserLoggedIn());
  }*/


    public void returnToHomePage() throws InterruptedException {
        super.returnToHomePage();
    }


}
