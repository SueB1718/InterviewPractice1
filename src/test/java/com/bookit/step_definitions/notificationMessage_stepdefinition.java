package com.bookit.step_definitions;

import com.bookit.pages.NotificationMessagePage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class notificationMessage_stepdefinition {

    NotificationMessagePage notificationMessagePage = new NotificationMessagePage();

    @Given("user is on Notification Message page.")
    public void user_is_on_notification_message_page() {
        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/notification_message_rendered");
    }

    @When("user clicks on the Click Here link a multiple times.")
    public void user_clicks_on_the_click_here_link_a_multiple_times() {
     //  notificationMessagePage.ClickHereLink.click();
    }

    @Then("asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful” messages show on click.")
    public void asserts_that_one_of_the_action_successful_action_unsuccessful_please_try_again_and_action_unsuccessful_messages_show_on_click() {

        List<String> messages =new ArrayList<>();

        for (int i = 0; i <7 ; i++) {

            notificationMessagePage.ClickHereLink.click();
            System.out.println("notificationMessagePage.Notfication.getText() = " + notificationMessagePage.NotificationMessages.getText());
            messages.add(notificationMessagePage.NotificationMessages.getText());

            if(messages.get(i).contains("Action successfu")){
                Assert.assertTrue(messages.get(i).contains("Action successfu"));
                System.out.println("Action successful==>pass2");}

           else  if(messages.get(i).contains("Action unsuccesful, please ")){
                Assert.assertTrue(messages.get(i).contains("Action unsuccesful, please"));
                System.out.println("pass");

            }else{
                Assert.assertTrue(messages.get(i).contains("Action Unsuccessfu"));
                System.out.println("\"pass3\" = " + "pass3");
            }

        }


        
        System.out.println("messages = " + messages);
        Assert.assertTrue(messages.contains(notificationMessagePage.NotificationMessages.getText()));
    }

}
