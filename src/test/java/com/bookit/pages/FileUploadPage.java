package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

    public FileUploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='file-upload']")
    public WebElement ChooseFileButton ;

    @FindBy(xpath = "//input[@id='file-submit']")
    public WebElement UploadButton ; //or use -> (//input)[2]

    @FindBy(xpath = "//div[@id='drag-drop-upload']")
    public WebElement DragandDropArea ;

    @FindBy(xpath = "//h3")
    public WebElement FileUploadedMessage ;

}
