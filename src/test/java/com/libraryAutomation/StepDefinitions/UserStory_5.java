package com.libraryAutomation.StepDefinitions;

import com.libraryAutomation.pages.UserStory_5numbers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserStory_5 {


    UserStory_5numbers userStory_5numbers = new UserStory_5numbers();
    Select select;


    @Then("user should see {int} in default")
    public void user_should_see_in_default(Integer int1) throws InterruptedException {

        Thread.sleep(3000);

        select = new Select(userStory_5numbers.defaultNumber);
        String actual = select.getFirstSelectedOption().getText();


        Assert.assertEquals(int1 + "", actual);

        System.out.println(actual);
    }


    @When("I click <count> it should show")
    public void i_click_count_it_should_show(List<String> dataTable) {



        select = new Select(userStory_5numbers.DropDown);
        List<WebElement> webElements = select.getOptions();

        for (WebElement each : webElements) {
            System.out.println("each.getText() = " + each.getText());



        }

    }

}
