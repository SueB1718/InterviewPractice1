package com.bookit.step_definitions;

import com.bookit.pages.FileDownloadPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.File;

public class fileDownload_stepdefinition {

    FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private static String downloadPath = "/Users/kyungsook/Downloads" ;
    // when you copy the path 1. select the text downloaded
    // 2. right click
    // 3. press option  then you will see the change in -> copy....as pathname

    @Given("user is on the File Download page")
    public void user_is_on_the_file_download_page() {
        String url = ConfigurationReader.getProperty("baseUrl") ;
        Driver.getDriver().get(url+"/download");
}

    @When("user  clicks on the file.")
    public void user_clicks_on_the_file() {

        fileDownloadPage.somefileDownload.click();
    }


    @Then("asserts that the file is downloaded.")
    public void asserts_that_the_file_is_downloaded() {
   Assert.assertTrue(isFileDownloaded(downloadPath,"some-file.txt" ));

    }

        public boolean isFileDownloaded(String downloadPath, String fileName) {
            boolean flag = false;
            File dir = new File(downloadPath);
            File[] dir_contents = dir.listFiles();

            for (int i = 0; i < dir_contents.length; i++) {
                if (dir_contents[i].getName().equals(fileName))
                    return flag=true;
            }

            return flag;
    }

}
