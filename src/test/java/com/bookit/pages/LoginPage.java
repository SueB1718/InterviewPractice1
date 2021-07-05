package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ // PageFactory initiating all the objects on this page
        // PageFactory allows to use @FindBy
        PageFactory.initElements(Driver.getDriver(), this); }

@FindBy(id="username")
    public WebElement userNameInputBox ;

    @FindBy(id="password")
    public WebElement passwordInputBox ;

    @FindBy(xpath = "//div[@id='flash']")// later check if the id propterty is same as others
    public WebElement loginSuccessMessage ;

    @FindBy(xpath ="//i[@class='fa fa-2x fa-sign-in']")
    public WebElement loginButton ;

    @FindBy(xpath = "//div[@class='flash error']")
    public WebElement loginFailMessage ;




}
