package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewTabPage {

    public OpenNewTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h3")
    public WebElement newWindowText ;

    @FindBy(xpath = "(//a)[2]")
    public WebElement clickHereLink ;

}
