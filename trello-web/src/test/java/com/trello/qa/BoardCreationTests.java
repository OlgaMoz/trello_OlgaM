package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
  @Test
    public void testBoardCreation() {
      // Click on the button “Create new board” in the center
        click(By.cssSelector("[class='board-tile mod-add']"));

      fillBoardCreationForm("Olga's_test_board", "descr qa21");
     /* // Fill in the title of the board in the form
        type(By.cssSelector("[class='subtle-input']"), "Olga's_test_board");
      //Choose a picture for the board
        click(By.cssSelector("[class='icon-sm icon-check']"));
      //Choose team
      if(isElementPresent(By.cssSelector(".W6rMLOx8U0MrPx"))){
          click(By.cssSelector(".W6rMLOx8U0MrPx"));
          click(By.xpath("//nav[@class='SdlcRrTVPA8Y3K']//li[1]"));//no team
      }*/

        confirmBoardCreation();

      System.out.println("is Board Created ? "+ isBoardCreated());
      Assert.assertTrue(isBoardCreated());

    }

}
