package com.bookit.step_definitions;

import com.bookit.pages.DragDropPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragDrop_stepdefinition {

    DragDropPage dragDropPage = new DragDropPage();

    @Given("user is already on Drag and Drop page")
    public void user_is_already_on_drag_and_drop_page() {

    String url  =  ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/drag_and_drop");

    }


    @When("user drags element A to element B")
    public void user_drags_element_a_to_element_b() {

        System.out.println("DragDropPage.headerA = " + dragDropPage.headerA.getText());
        System.out.println("DragDropPage.headerB = " + dragDropPage.headerB.getText());

        Actions actions = new Actions(Driver.getDriver()) ;
        if(dragDropPage.columnA.getText().equals("A")){
            actions.dragAndDrop(dragDropPage.columnA, dragDropPage.columnB).perform();
        }else{
            actions.dragAndDrop(dragDropPage.columnB, dragDropPage.columnA).perform();
        }


    }

    @Then("text on element A and B are switched.")
    public void text_on_element_a_and_b_are_switched() {

      if ( dragDropPage.columnA.getText().equals("B")){
        Assert.assertTrue(dragDropPage.columnA.getText().equals("B"));
      }else {
          Assert.assertTrue(dragDropPage.columnA.getText().equals("A"));

      }

        if ( dragDropPage.columnA.getText().equals("B")){
            Assert.assertTrue(dragDropPage.columnA.getText().equals(dragDropPage.headerB.getText()));
        }else {
            Assert.assertTrue(dragDropPage.columnA.getText().equals(dragDropPage.headerA.getText()));

        }



    }



}
