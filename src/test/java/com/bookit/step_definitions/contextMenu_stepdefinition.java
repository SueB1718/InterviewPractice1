package com.bookit.step_definitions;

import com.bookit.pages.ContextMenuPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class contextMenu_stepdefinition {

    ContextMenuPage contextMenuPage = new ContextMenuPage() ;


    @Given("user is on Context Menu page")
    public void user_is_on_context_menu_page() {
      String url  = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/context_menu");

    }

    @When("User right clicks on the context menu.")
    public void user_right_clicks_on_the_context_menu() {

        Actions actions = new Actions(Driver.getDriver()) ;

        actions.contextClick(contextMenuPage.contextBox).perform();

    }
    @When("the alert menu text pops up.")
    public void the_alert_menu_text_pops_up() {
        // in order to use alert object
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
   //     String actualText = contextMenuPage.alertMessage.getText() ;
   // System.out.println("actual Text = " + actualText );

    }
    @Then("asserts the alert menu text.")
    public void asserts_the_alert_menu_text() {
        Assert.assertTrue(contextMenuPage.alertMessage.isEnabled());


    }

}
