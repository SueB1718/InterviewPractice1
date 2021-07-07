package com.bookit.step_definitions;

import com.bookit.pages.JavaScriptAlertsPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class javaScriptAlerts_stepdefinition {

    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();
    Alert alert;

    @Given("user is on Java Script Alert page.")
    public void user_is_on_java_script_alert_page() {
        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/javascript_alerts");
    }


    @When("user Clicks on JS Alert Button")
    public void user_clicks_on_js_alert_button() {
        javaScriptAlertsPage.JsAlertButton.click();
        alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @Then("asserts alert message.")
    public void asserts_alert_message() {
       Assert.assertTrue(javaScriptAlertsPage.ResultText.isDisplayed());
        Assert.assertEquals("You successfuly clicked an alert", javaScriptAlertsPage.ResultText.getText());
    }
    @When("user clicks on JS confirm Button and clicks ok on alert.")
    public void user_clicks_on_js_confirm_button_and_clicks_ok_on_alert() {
      javaScriptAlertsPage.JsConfirmButton.click();
        alert = Driver.getDriver().switchTo().alert();
       alert.accept();
    }
    @Then("test asserts the alert message.")
    public void test_asserts_the_alert_message() {
       Assert.assertTrue(javaScriptAlertsPage.JsConfirmButton.isDisplayed());
       Assert.assertEquals("You clicked: Ok", javaScriptAlertsPage.ResultText.getText());
    }

    @When("user clicks on JS Prompt Button and types a message on Prompt.")
    public void user_clicks_on_js_prompt_button_and_types_a_message_on_prompt() {
        javaScriptAlertsPage.JsPromptButton.click();
        alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("testing");
        alert.accept();
    }
    @Then("Test asserts that the alert message contains the typed message.")
    public void test_asserts_that_the_alert_message_contains_the_typed_message() {
        Assert.assertEquals("You entered: testing", javaScriptAlertsPage.ResultText.getText());
    }

}
