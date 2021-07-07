package com.bookit.step_definitions;

import com.bookit.pages.OpenNewTabPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class openNewTab_stepdefinition {

   OpenNewTabPage openNewTabPage = new OpenNewTabPage();

    @Given("user is on Open in New Tab page")
    public void user_is_on_open_in_new_tab_page() {
        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/windows");
    }

    @When("user clicks on the Click Here link.")
    public void user_clicks_on_the_click_here_link() {
       openNewTabPage.clickHereLink.click();
    }

    @Then("asserts that a new tab is opened with text New Window.")
    public void asserts_that_a_new_tab_is_opened_with_text_new_window() {
      //  String windowHandle = Driver.getDriver().getWindowHandle(); type; then option enter twice
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        //interview question:  return type string for getWindowHandle()
        //return type set for getWindowHandles() *** set no duplicate , no index for set
        for (String EachWindowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(EachWindowHandle);
            System.out.println("EachWindowHandle = " + EachWindowHandle);
            System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

             if(Driver.getDriver().getTitle().equals("New Window")){
                 Assert.assertEquals(openNewTabPage.newWindowText.getText(), Driver.getDriver().getTitle());
             }
        }

        String finalExpected = "New Window" ;
        String finalActualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(finalExpected, finalActualTitle);

        System.out.println("openNewTabPage.newWindowText.getText() = " + openNewTabPage.newWindowText.getText());
        Assert.assertEquals("New Window", openNewTabPage.newWindowText.getText());
    }
}
