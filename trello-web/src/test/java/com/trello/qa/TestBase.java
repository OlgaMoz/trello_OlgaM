package com.trello.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    @BeforeClass
    public void seUp() {
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();

     openSite("https://trello.com");

     //login("elena.telran@yahoo.com", "12345.com");
    login("oemozel@gmail.com","Anna2018");
    }

    public void login(String email, String password) {
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("[type=email]"),email);
        type(By.cssSelector("[type=password]"),password);
        click(By.id("login"));

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {

        driver.get(url);
    }

    public boolean isElementPresent(By locator) {

        return driver.findElements(locator).size()>0;
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.cssSelector("[data-test-id='header-member-menu-button']"));
    }

    public boolean isBoardCreated() {
        return isElementPresent(By.cssSelector("[class='primary mod-list-add-button js-save-edit']"));
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

    public void clickContinueButton() {
        click(By.cssSelector("[type='submit']"));
    }

    public void fillTeamCreationForm(String teamName, String description) {
        type(By.cssSelector("[data-test-id='header-create-team-name-input']"), teamName);
        type(By.cssSelector("textarea"), description);
    }

    public void selectCreateTeamFromDropDown() {
        click(By.cssSelector("[data-test-id='header-create-team-button']"));
    }

    public void clickOnPlusButtonOnHeader() {
    click(By.cssSelector("[data-test-id='header-create-menu-button']"));
    }

    public void confirmBoardCreation() {
        click(By.cssSelector("[class='primary']"));
    }

    public void fillBoardCreationForm(String boardName, String s) {

        type(By.cssSelector("[class='subtle-input']"), boardName);
        if (isElementPresent(By.cssSelector("[class='icon-sm icon-down subtle-chooser-trigger-dropdown-icon light']"))) {
            click(By.cssSelector("[class='icon-sm icon-down subtle-chooser-trigger-dropdown-icon light']"));
            click(By.xpath("//*[@class='pop-over-list org-chooser']//li[1]"));//no team
        }
    }

    public String getBoardNameFromBoardPage() {
      return driver.findElement(By.xpath("//span[@class='js-board-editing-target board-header-btn-text']")).getText();
       }

    public String getTeamNameFromTeamPage() {
      return driver.findElement(By.cssSelector("h1")).getText();
    }

    public int getTeamsCount() {
        return driver.findElements(By.xpath("//*[@class='_mtkwfAlvk6O3f']/../../..//li")).size();
    }

    public void returnToHomePage() throws InterruptedException {
        Thread.sleep(10000);
        click(By.cssSelector("a[href='/']"));
    }

    public void clickOnPlusButtonOnLeftNavMenu() {
        click((By.cssSelector(".icon-add.icon-sm")));
    }

    public void clickOnTheButtonCreateNewBoardInTheCenter() {
      click(By.cssSelector("[class='board-tile mod-add']"));
    }
}
