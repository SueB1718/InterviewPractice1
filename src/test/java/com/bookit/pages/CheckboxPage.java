package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {

    public CheckboxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    // if the elements are not siblings
    // @FindBy(xpath = "(//[input[@type='checkbox'])[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    public WebElement checkbox2;


}
