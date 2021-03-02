package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentLanding {
    public StudentLanding() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//th")
    public List<WebElement> tables;
}
