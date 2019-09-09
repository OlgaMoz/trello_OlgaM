package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTests  extends TestBase{
  @Test
  public void testTeamCreationFromPlusButtonOnHeader() throws InterruptedException {
        int before = getTeamsCount();
       // System.out.println("before: " + before);
        clickOnPlusButtonOnHeader();
        selectCreateTeamFromDropDown();
        String teamName = "qa21";
        fillTeamCreationForm(teamName, "descr qa 21");
        clickContinueButton();
        String createdTeamName = getTeamNameFromTeamPage();
      returnToHomePage();
      int after = getTeamsCount();
     // System.out.println("after: "  + after);
      Assert.assertEquals(after, before+1);
      Assert.assertEquals(createdTeamName.toLowerCase(), teamName.toLowerCase());
  }
    @Test
    public void testTeamCreationFromLeftNavMenu() throws InterruptedException {
        int before = getTeamsCount();
        clickOnPlusButtonOnLeftNavMenu();
        String teamName = "qa21";
        fillTeamCreationForm(teamName, "descr qa 21");
        clickContinueButton();
        String createdTeamName = getTeamNameFromTeamPage();
        returnToHomePage();
        int after = getTeamsCount();
        // System.out.println("after: "  + after);
        //Assert.assertEquals(after, before+1);
        Assert.assertEquals(createdTeamName.toLowerCase(), teamName.toLowerCase());
    }

    /* @Test
    public void testTeamCreation() {
        System.out.println("isUserLoggedIn()"+ isUserLoggedIn());
        Assert.assertTrue(isUserLoggedIn());
    }*/
}
