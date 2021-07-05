package com.bookit.step_definitions;

import com.bookit.pages.FileUploadPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class fileUpload_stepdefinition {

    FileUploadPage fileUploadPage = new FileUploadPage();
    String path ="/Users/kyungsook/Downloads/some-file.txt";

    @Given("User is on file upload page")
    public void user_is_on_file_upload_page() {
        String url = ConfigurationReader.getProperty("baseUrl") ;
        Driver.getDriver().get(url+"/upload");
    }

    @When("user clicks Choose File button and select a file.")
    public void user_clicks_choose_file_button_and_select_a_file() {
    fileUploadPage.ChooseFileButton.sendKeys(path);
    }

    @When("user clicks Upload button")
    public void user_clicks_upload_button() {
     fileUploadPage.UploadButton.click();
    }

    @When("user uses Drag and Drop and clicks Upload button")
    public void user_uses_drag_and_drop_and_clicks_upload_button() {

        DropFile(new File(path),fileUploadPage.DragandDropArea, 0, 0);
    }

    public void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
        if (!filePath.exists())
            throw new WebDriverException("File not found: " + filePath.toString());

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        String JS_DROP_FILE =
                "var target = arguments[0]," +
                        "    offsetX = arguments[1]," +
                        "    offsetY = arguments[2]," +
                        "    document = target.ownerDocument || document," +
                        "    window = document.defaultView || window;" +
                        "" +
                        "var input = document.createElement('INPUT');" +
                        "input.type = 'file';" +
                        "input.style.display = 'none';" +
                        "input.onchange = function () {" +
                        "  var rect = target.getBoundingClientRect()," +
                        "      x = rect.left + (offsetX || (rect.width >> 1))," +
                        "      y = rect.top + (offsetY || (rect.height >> 1))," +
                        "      dataTransfer = { files: this.files };" +
                        "" +
                        "  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
                        "    var evt = document.createEvent('MouseEvent');" +
                        "    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
                        "    evt.dataTransfer = dataTransfer;" +
                        "    target.dispatchEvent(evt);" +
                        "  });" +
                        "" +
                        "  setTimeout(function () { document.body.removeChild(input); }, 25);" +
                        "};" +
                        "document.body.appendChild(input);" +
                        "return input;";

        WebElement input = (WebElement) jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
        input.sendKeys(filePath.getAbsoluteFile().toString());
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.stalenessOf(input));
    }


    @Then("user see file is uploaded")
    public void user_see_file_is_uploaded() {
        Assert.assertTrue(fileUploadPage.FileUploadedMessage.getText().equals("File Uploaded!"));
    }



}
