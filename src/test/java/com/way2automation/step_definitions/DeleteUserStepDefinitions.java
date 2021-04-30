package com.way2automation.step_definitions;

import com.way2automation.Utilities.BrowserUtil;
import com.way2automation.pages.UserPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class DeleteUserStepDefinitions {

    UserPage userPage = new UserPage();
    WebDriver driver;

    @Then("user clicks on X button on User Name row")
    public void user_clicks_on_x_button_on_user_name_row() {
     userPage.clicksOnDeleteButton();
    }


    @Then("user clicks on OK button")
    public void user_clicks_on_ok_button() {
     userPage.clicksOnOkButton();

    }
    @Then("user verify that User Name deleted")
    public void user_verify_that_user_name_deleted() {

        BrowserUtil.validateUsernameIsDeleted(driver, "novak");

    }


}
