package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FloatingMenuPage {

    public FloatingMenuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3")
    public WebElement FloatingMenu ;

    @FindBy(xpath = "(//a)[2]")
    public WebElement HomeButton ;

    @FindBy(xpath = "(//a)[3]")
    public WebElement NewsButton ;

    @FindBy(xpath = "(//a)[4]")
    public WebElement ContactButton ;

    @FindBy(xpath = "(//a)[5]")
    public WebElement AboutButton ;

    @FindBy(xpath = "//a")
    public List<WebElement> floatingMenus ;

}
