package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MouseHover {

    public MouseHover(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='figure']")
    public List<WebElement> images;

    @FindBy(xpath = "(//h5)[1]")
    public WebElement text1 ;

    @FindBy(xpath = "(//h5)[2]")
    public WebElement text2 ;

    @FindBy(xpath = "(//h5)[3]")
    public WebElement text3 ;


}
