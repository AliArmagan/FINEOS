package com.way2automation.step_definitions;

import com.way2automation.pages.UserPage;
import com.way2automation.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddUserStepDefinitions {

    UserPage userPage = new UserPage();
    WebDriver driver;

    @Given("user is on website")
    public void user_is_on_website() {
       userPage.getUrl();
    }

    @Given("user clicks on Add User button")
    public void user_clicks_on_add_user_button() {
        userPage.clicksOnAddButton();
    }

    @Then("user adds new user information")
    public void user_adds_new_user_information() {

        userPage.enterFirstName("Ali");
        userPage.enterLastName("Ali");
        userPage.enterLastName("ali");
        userPage.enterPassword("1234");
        userPage.enterUserName("aliali");
        userPage.enterEmail("ali@ali.ali");
        userPage.selectCompanyA();
        userPage.selectRollID("Customer");
        userPage.enterMobile("123321");


    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {

        userPage.clickSaveButton();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Then("user verify that new user name on the table")
    public void user_verify_that_new_user_name_on_the_table(){
        userPage.validateName(driver, "Ali");

    }

}
