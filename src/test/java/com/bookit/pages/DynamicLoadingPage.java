package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {

    public DynamicLoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button")
    public WebElement StartButton ;

    @FindBy(xpath = "//h4[.='Hello World!']")
    public WebElement HelloWorld ;

}
