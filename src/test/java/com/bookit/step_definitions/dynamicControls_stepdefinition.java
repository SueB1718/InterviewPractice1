package com.bookit.step_definitions;

import com.bookit.pages.DynamicControlsPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicControls_stepdefinition {

    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();

    @Given("user is on the Dynamic Controls page")
    public void user_is_on_the_dynamic_controls_page() {

        String url = ConfigurationReader.getProperty("baseUrl") ;
        Driver.getDriver().get(url+"/dynamic_controls");
    }

    @When("user clicks on the Remove Button and uses explicit wait.")
    public void user_clicks_on_the_remove_button_and_uses_explicit_wait() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        dynamicControlsPage.RemoveAddButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(dynamicControlsPage.itIsGoneMessage)
        );
    }

    @Then("test asserts the checkbox is gone.")
    public void test_asserts_the_checkbox_is_gone() {

        try{Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed()); }
        catch (Exception e) {
            System.out.println("no checkbox is exist");
        }
    }

    @Then("Test clicks on Add Button and uses explicit wait.")
    public void test_clicks_on_add_button_and_uses_explicit_wait() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5) ;
        dynamicControlsPage.RemoveAddButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(dynamicControlsPage.checkBox)) ;
    }

    @Then("Test asserts that the checkbox is present.")
    public void test_asserts_that_the_checkbox_is_present() {

        Assert.assertTrue(dynamicControlsPage.checkBox.isEnabled());
    }


    @When("user clicks on the Enable Button and uses explicit wait.")
    public void user_clicks_on_the_enable_button_and_uses_explicit_wait() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        dynamicControlsPage.EnableDisableButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(dynamicControlsPage.itIsEnabledDisabledMessage));

    }

    @Then("Test asserts that the text box is enabled.")
    public void test_asserts_that_the_text_box_is_enabled() {

        Assert.assertTrue(dynamicControlsPage.itIsEnabledDisabledMessage.isDisplayed());
      //  Assert.assertTrue(dynamicControlsPage.itIsEnabledMessage.getText().contains("enabled"));
    }


    @Then("Test clicks on the Disable Button and uses explicit wait.")
    public void test_clicks_on_the_disable_button_and_uses_explicit_wait() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        dynamicControlsPage.EnableDisableButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(dynamicControlsPage.itIsEnabledDisabledMessage));
    }

    @Then("Test asserts that the text box is disabled.")
    public void test_asserts_that_the_text_box_is_disabled() {

        Assert.assertTrue(dynamicControlsPage.itIsEnabledDisabledMessage.getText().contains("disabled"));
    }

}
