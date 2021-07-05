package com.bookit.step_definitions;

import com.bookit.pages.IframePage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class iframe_stepdefinition {


    IframePage iframePage = new IframePage();

    @Given("User is on Ifram page")
    public void user_is_on_ifram_page() {

        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/iframe");
    }

    @When("user switches to Iframe and types some text.")
    public void user_switches_to_iframe_and_types_some_text() {

        iframePage.alertButton.click();
        Driver.getDriver().switchTo().frame(iframePage.textBox); // iframe WebElement
     //   Driver.getDriver().switchTo().frame(0); // iframe index value
     //   Driver.getDriver().switchTo().frame("mce_0_ifr") ; // iframe name value or id value id="mce_0_ifr"

      iframePage.yourContentGoesHere.sendKeys(Keys.BACK_SPACE+"Thank You!");
      // just to ensure that there is no typed words prior to cursor -> Keys.Back_Space
    }

    @Then("the typed text is as expected.")
    public void the_typed_text_is_as_expected() {
       String actualText = iframePage.yourContentGoesHere.getText();
       String expectedText = "Thank You!Your content goes here." ;
        // first time look at the line 32 -> i did not give space

        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
        Assert.assertTrue(actualText,equals(expectedText));
      //  Assert.assertTrue(actualText.contains(expectedText));

//        String actualText = iframePage.yourContentGoesHere.getText();
//        String ExpectedText = "Thank You!Your content goes here.";
//        Assert.assertTrue(actualText.equals(ExpectedText));
//
//        System.out.println("actualText = " + actualText);
//        System.out.println("expectedText = " + ExpectedText);


    }



}
