package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
  @Test
    public void testBoardCreation() throws InterruptedException {
    clickOnTheButtonCreateNewBoardInTheCenter();
    String boardName = "OlTest";
    System.out.println("boardName: " + boardName);
    fillBoardCreationForm(boardName, "descr qa21");
    confirmBoardCreation();
    Thread.sleep(5000);
    String createdBoardName = getBoardNameFromBoardPage();
    Thread.sleep(5000);
    System.out.println("createdBoardName: " + createdBoardName);
    Assert.assertEquals(createdBoardName.toLowerCase(), boardName.toLowerCase());
    System.out.println("is Board Created ? "+ isBoardCreated());
    Assert.assertTrue(isBoardCreated());

    }
}
