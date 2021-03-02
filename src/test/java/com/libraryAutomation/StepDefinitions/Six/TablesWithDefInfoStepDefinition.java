package com.libraryAutomation.StepDefinitions.Six;

import com.libraryAutomation.pages.LoginPageElements;
import com.libraryAutomation.pages.StudentLanding;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class TablesWithDefInfoStepDefinition {
    LoginPageElements loginPage = new LoginPageElements();
    @Given("the user on the homepage")
    public void user_login_AsStudent() {

        Driver.getDriver().get(ConfigurationReader.getProperty("libURL"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("Student34"));
        loginPage.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("StudentPass34"));
        loginPage.signInButton.click();
    }
    StudentLanding tables=new StudentLanding();
        @Then ("the user should be see the following column names")
    public void user_see_column_names(List<String> expectedList){
            ArrayList<String> actHeaders= new ArrayList<String>();
            for (WebElement each: tables.tables) {
                String str=each.getText();
                actHeaders.add(str);
            }
            Assert.assertTrue(actHeaders.equals(expectedList));








    }
}
