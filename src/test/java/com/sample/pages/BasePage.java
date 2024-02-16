package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "search-box-input")
    public WebElement searchInput;

    @FindBy (xpath = "//button[@type = 'submit']")
    public WebElement searchBtn;

    @FindBy (xpath = "//h1[@class='collapsedListView']")
    public WebElement searchTitle;

}
