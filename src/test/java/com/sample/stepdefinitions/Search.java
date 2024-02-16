package com.sample.stepdefinitions;

import com.sample.pages.BasePage;
import com.sample.utilities.BrowserUtil;
import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search extends BasePage {

    @Given("User is on Zillow home page")
    public void user_is_on_zillow_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("zillow"));

    }

    @Then("User should see Title")
    public void user_should_see_title() {
        //  wait.until(ExpectedConditions.visibilityOf(basePage.PressNHold));
        //  actions.clickAndHold(basePage.PressNHold).perform();

        wait.until(ExpectedConditions.titleContains("Real"));
        BrowserUtil.verifyTitle(ConfigurationReader.getProperty("expectedTitle"));



    }

    @When("user input the zipcode into the search box")
    public void user_input_the_zipcode_into_the_search_box() {
        searchInput.sendKeys(ConfigurationReader.getProperty("zipcode"));

    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        searchBtn.click();

    }


    @Then("user sees the zipcode in the headline")
    public void user_sees_the_zipcode_in_the_headline() {
        Assert.assertTrue(searchTitle.getText().contains(ConfigurationReader.getProperty( "zipcode")));


    }
}
