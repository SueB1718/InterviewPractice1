package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessagePage {
    public NotificationMessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Click here']") //for text  //a[.='Click here']
    public WebElement ClickHereLink ;

   @FindBy(xpath = "(//div[@class='large-12 columns'])[1]")
    public WebElement NotificationMessages ;




}
