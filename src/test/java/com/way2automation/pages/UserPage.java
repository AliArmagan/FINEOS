package com.way2automation.pages;

import com.way2automation.Utilities.ConfigurationReader;
import com.way2automation.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPage extends BasePage{


    @FindBy(xpath = "//button[.='OK']")
    private WebElement okButton;

    @FindBy(xpath = "//button[@type='add']")
    private WebElement addButton;

    @FindBy(name = "FirstName")
    private WebElement firstName;

    @FindBy(name = "LastName")
    private WebElement lastName;

    @FindBy(name = "UserName")
    private WebElement userName;

    @FindBy(name = "Password")
    private WebElement password;

    @FindBy( xpath= "(//input[@type ='radio'])[1]")
    private WebElement companyA;

    @FindBy(xpath = "(//input[@type ='radio'])[2]]")
    private WebElement companyB;

    @FindBy(xpath = "//select[@name='RoleId']")
    private WebElement rollID;

    @FindBy(xpath = "//input[@name ='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name ='Mobilephone']")
    private WebElement mobile;

    @FindBy(xpath = "//button[@class ='btn btn-success']")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[@class='btn btn-link'])[6]")
    private WebElement deleteButton;

    public void getUrl(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    public void clicksOnAddButton(){
     addButton.click();
    }

    public void enterFirstName(String FirstName) {
        firstName.sendKeys(FirstName);
    }
    public void enterLastName(String LastName) {
        lastName.sendKeys(LastName);
    }
    public void enterUserName(String UserName) {
        userName.sendKeys(UserName);
    }
    public void enterPassword(String Password){
        password.sendKeys(Password);
    }
    public void selectCompanyA() {
        companyA.click();
    }
    public void selectCompanyB() {
        companyB.click();
    }
    public void selectRollID(String name) {
        rollID.click();
        Select dropdown = new Select(rollID);
        dropdown.selectByVisibleText(name);
    }
    public void enterEmail(String Email) {
        email.sendKeys(Email);
    }
    public void enterMobile(String EnterMobile) {
        mobile.sendKeys(EnterMobile);
    }
    public void clickSaveButton() {
        saveButton.click();
    }
    public void validateName(WebDriver driver , String FirstName){

        WebDriverWait wait = new WebDriverWait(com.way2automation.Utilities.Driver.getDriver(), 10);

        String NAME = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr/td[1])[3]"))).getText();

        if(NAME.equals(FirstName)){
            System.out.println("New user created!");
        }else{
            System.out.println("!!Test failed!!");
        }

    }



    public void clicksOnDeleteButton(){
        deleteButton.click();
    }
    public void clicksOnOkButton(){
        okButton.click();
    }
    public void validateUsernameIsDeleted(WebDriver driver , String UserName ){

        WebDriverWait wait = new WebDriverWait(com.way2automation.Utilities.Driver.getDriver(), 10);

        String User = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody//tr[3]//td[3]"))).getText();

        if(!User.equals(UserName)){
            System.out.println("New user is created!");
        }else{
            System.out.println("!!Test failed!! "+User+" is not DELETED! ");
        }

    }






}


