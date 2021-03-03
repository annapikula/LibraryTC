package com.libraryAutomation.StepDefinitions;

import com.libraryAutomation.pages.LoginPageElements;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import com.sun.xml.internal.fastinfoset.sax.Properties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import javax.xml.crypto.Data;

public class LoginStepDefinitions {

    LoginPageElements loginPageElements = new LoginPageElements();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("libURL");
        Driver.getDriver().get(url);

        String expectedURL = "login.html";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedURL));

        System.out.println("actualURL = " + actualURL);









    }


    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {


        loginPageElements.usernameInput.sendKeys(ConfigurationReader.getProperty("librarian47"));



    }

    @Then("user enter librarian password")
    public void userEnterLibrarianPassword() {
        loginPageElements.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("librarianPass47"));
        loginPageElements.signInButton.click();

        Driver.closeDriver();
    }


    @When("user enters student username")
    public void userEntersStudentUsername() {

        loginPageElements.usernameInput.sendKeys(ConfigurationReader.getProperty("Student34"));
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        loginPageElements.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("StudentPass34"));
        loginPageElements.signInButton.click();
      //  Driver.closeDriver();
    }
}
