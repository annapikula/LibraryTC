package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardTab;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersTab;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksTab;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooksTab;
}

