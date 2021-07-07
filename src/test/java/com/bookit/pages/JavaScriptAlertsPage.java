package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage {

    public JavaScriptAlertsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement JsAlertButton;

    @FindBy(xpath = "(//button)[2]")
    public WebElement JsConfirmButton;

    @FindBy(xpath = "(//button)[3]")
    public WebElement JsPromptButton;

    @FindBy(xpath = "(//p)[2]")
    public WebElement ResultText;

}
