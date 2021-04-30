package com.way2automation.pages;

import com.way2automation.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    
}
