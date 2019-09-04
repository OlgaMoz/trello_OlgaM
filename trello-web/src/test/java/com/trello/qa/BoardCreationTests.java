package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
  @Test
    public void testBoardCreation() {
      // Click on the button “Create new board” in the center
        click(By.cssSelector("[class='board-tile mod-add']"));
      // Fill in the title of the board in the form
        type(By.cssSelector("[class='subtle-input']"), "Olga's_test_board");
      //Choose a picture for the board
        click(By.cssSelector("[class='icon-sm icon-check']"));
      //Click on the button “Create Board”
        click(By.cssSelector("[class='primary']"));

      System.out.println("is Board Created ? "+ isBoardCreated());
      Assert.assertTrue(isBoardCreated());

    }
   /* @Test
    public void testBoardFromPrivateToPublicChange() {
        click(By.cssSelector("[class='board-header-btn perms-btn js-change-vis']"));
    }*/
   // [class="board-header-btn perms-btn js-change-vis"]

   /* public boolean isBoardCreated() {
        return isElementPresent(By.cssSelector("[class='primary mod-list-add-button js-save-edit']"));
    }*/


}
