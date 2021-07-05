package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContentPage {

    public DynamicContentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a)[2]")
    public WebElement ClickHereLink ;
    //->  //a[.='click here']  text only
  //  -> //a[@href='/dynamic_content?with_content=static']

    @FindBy (xpath = "(//div[@class='large-10 columns'])[3]")
    public WebElement DynamicContent ;



}
