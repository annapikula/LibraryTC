package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

import java.util.List;

public class UserStory_5numbers {


    public UserStory_5numbers() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement defaultNumber;

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement DropDown;




}
