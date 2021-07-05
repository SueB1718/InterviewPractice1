package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage {

    public FileDownloadPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a)[2]")
    public WebElement somefileDownload ;


}
