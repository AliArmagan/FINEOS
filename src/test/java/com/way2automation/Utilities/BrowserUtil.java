package com.way2automation.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    public static void validateName(WebDriver driver , String FirstName ){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


        String NAME = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr/td[1])[3]"))).getText();

        //System.out.println(NAME);

        if(NAME.equals(FirstName)){
            System.out.println("New user created!");
        }else{
            System.out.println("!!Test failed!! Created name is "+NAME);
        }

    }

    public static void validateUsernameIsDeleted(WebDriver driver , String UserName ){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


        String User = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody//tr[3]//td[3]"))).getText();

        //System.out.println(User);

        if(!User.equals(UserName)){
            System.out.println("New user created!");
        }else{
            System.out.println("!!Test failed!! "+User+" not DELETED! ");
        }

    }


}
