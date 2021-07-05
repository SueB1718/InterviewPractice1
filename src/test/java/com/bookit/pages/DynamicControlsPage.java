package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement RemoveAddButton ;

    @FindBy(xpath = "(//button)[2]")
    public WebElement EnableDisableButton ;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itIsGoneMessage ;
    // check if you want to use text message -> //p[.='It's gone!']
    // -> (//p)[2]

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itIsEnabledDisabledMessage ;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox ;






}
