package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "dropdown")
    public WebElement dropDownBox ;

    @FindBy(xpath = "//option[2]")
    public WebElement option1 ;

    @FindBy(xpath = "//option[3]")
    public WebElement option2 ;

}
