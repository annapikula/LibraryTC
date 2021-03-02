package com.libraryAutomation.StepDefinitions;

import com.libraryAutomation.pages.BooksPage;
import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPageElements;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookPageStepDefinitions {
    LoginPageElements loginPage = new LoginPageElements();

    @Given("User is logged in as Librarian")
    public void user_login_AsLibrarian() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libURL"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("librarian47"));
        loginPage.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("librarianPass47"));
        loginPage.signInButton.click();
    }
    LandingPage landing= new LandingPage();
    @And("User opens book tab")
    public void user_Opens_BookTab(){
        landing.booksTab.click();
    }
    BooksPage booksPage=new BooksPage();
    @Then("The default amount of books shown is {int}")
    public void default_BookCount(Integer int1){
        Select countDrp=new Select(booksPage.count);
        String defaultAct=countDrp.getFirstSelectedOption().getText();
        Integer defInt=Integer.parseInt(defaultAct);
        Assert.assertTrue(defInt==int1);
    }
    @When ("The user clicks the count dropdown and Selects {count}")
    public void clicks_Drop(String count){
        Select countDrp=new Select(booksPage.count);
        countDrp.selectByValue(count);


    }
    @Then("the amount {result} is displayed")
    public void the_amount_shown_is_displayed(String result) {
        System.out.println("poop");

    }




}
