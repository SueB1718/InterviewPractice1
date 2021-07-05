package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDropPage {

    public DragDropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "column-a")
    public WebElement columnA ;

    @FindBy (id = "column-b")
    public WebElement columnB ;

    @FindBy(xpath = "(//header)[1]" )
    public WebElement headerA ;

    @FindBy(xpath = "(//header)[2]" )
    public WebElement headerB ;
}
