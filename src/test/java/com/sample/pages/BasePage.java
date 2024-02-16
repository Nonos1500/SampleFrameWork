package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.By;

public abstract class BasePage {

    public void navigateModule(String moduleName){
        switch (moduleName){
            case "rent":
                moduleName = "Rent Menu";
                break;
            case "buy":
                moduleName = "Buy Menu";
                break;
        }

        Driver.getDriver().findElement(By.xpath(
                "//a[@title='"+moduleName+"']"
        )).click();
    }
}
