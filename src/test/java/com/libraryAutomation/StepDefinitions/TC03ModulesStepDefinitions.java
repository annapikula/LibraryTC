package com.libraryAutomation.StepDefinitions;

import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPageElements;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;

public class TC03ModulesStepDefinitions {
    LoginPageElements loginPageElements = new LoginPageElements();

    @Given("the student on the home page")
    public void the_student_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libURL"));
        loginPageElements.usernameInput.sendKeys(ConfigurationReader.getProperty("Student34"));
        loginPageElements.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("StudentPass34"));
        loginPageElements.signInButton.click();
    }

    LandingPage landingPage = new LandingPage();

    @Then ("the student should see following modules")
    public void student_should_see(ArrayList<String> tabs){
        Assert.assertTrue(landingPage.booksTab.isDisplayed());
        Assert.assertTrue(landingPage.borrowingBooksTab.isDisplayed());


    }



    @Given("the librarian on the homepage")
    public void the_librarian_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libURL"));
        loginPageElements.usernameInput.sendKeys(ConfigurationReader.getProperty("librarian47"));
        loginPageElements.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("librarianPass47"));
        loginPageElements.signInButton.click();
    }


    @Then("the librarian should see following modules")
    public void the_user_should_see_following_modules(ArrayList<String> tabs) {
    Assert.assertTrue(landingPage.dashboardTab.isDisplayed());
    Assert.assertTrue(landingPage.usersTab.isDisplayed());
    Assert.assertTrue(landingPage.booksTab.isDisplayed());

    }


}
