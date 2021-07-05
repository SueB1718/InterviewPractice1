package com.bookit.step_definitions;

import com.bookit.pages.DynamicContentPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class dynamcicContent_stepdefinition {

    DynamicContentPage dynamicContentPage = new DynamicContentPage();

    @Given("user is already on Dynamic Content page")
    public void user_is_already_on_dynamic_content_page() {

        String url = ConfigurationReader.getProperty("baseUrl") ;
        Driver.getDriver().get(url+"/dynamic_content");

    }

    List<String> allContent = new ArrayList<>() ; // polymorphism

    @When("user clicks on the click here a couple of times.")
    public void user_clicks_on_the_click_here_a_couple_of_times() {
        for (int i=0; i<5 ; i++){
            dynamicContentPage.ClickHereLink.click();
         String eachContent   = dynamicContentPage.DynamicContent.getText();
         allContent.add(eachContent) ;
        }

        System.out.println("allContent = " + allContent); // type allContent.soutv

    }


    @Then("content changes on each refresh.")
    public void content_changes_on_each_refresh() {

        Assert.assertNotEquals(allContent.get(0), allContent.get(1));
    }


}
