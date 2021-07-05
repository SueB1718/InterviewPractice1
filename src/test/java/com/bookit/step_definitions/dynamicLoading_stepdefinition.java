package com.bookit.step_definitions;

import com.bookit.pages.DynamicLoadingPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicLoading_stepdefinition {

  DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

    @Given("User is on Dynamic Loading page")
    public void user_is_on_dynamic_loading_page() {

        String url = ConfigurationReader.getProperty("baseUrl") ;
        Driver.getDriver().get(url+"/dynamic_loading/2");
    }


    @When("user clicks the start button and uses explicit wait.")
    public void user_clicks_the_start_button_and_uses_explicit_wait() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        dynamicLoadingPage.StartButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(dynamicLoadingPage.HelloWorld));

    }
    @Then("Test asserts that “Hello World!” text is displayed.")
    public void test_asserts_that_hello_world_text_is_displayed() {
        Assert.assertTrue(dynamicLoadingPage.HelloWorld.isDisplayed());
     String actualText   = dynamicLoadingPage.HelloWorld.getText();
     String expectedText = "Hello World!" ;
    Assert.assertEquals(actualText, expectedText);

    }
}
