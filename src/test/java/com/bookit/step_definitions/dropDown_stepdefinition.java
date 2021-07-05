package com.bookit.step_definitions;

import com.bookit.pages.DropDownPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown_stepdefinition {

    DropDownPage dropDownPage = new DropDownPage() ;

    @Given("user is on the Dropdown page")
    public void user_is_on_the_dropdown_page() {

        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url + "/dropdown");

    }


    @When("user selects Option {int} and Option {int}")
    public void user_selects_option_and_option(Integer int1, Integer int2) {
// or command and slash to block the comment
        Select select = new Select(dropDownPage.dropDownBox) ;
//        List <WebElement> allOptions = select.getOptions();
//
//        // type variable allOption.iter and enter -> for loop
//        for (WebElement eachOption : allOptions) {
//            eachOption.click();
//            Assert.assertTrue(eachOption.isSelected());
//        }


       select.selectByVisibleText("Option 1");
       Assert.assertTrue(dropDownPage.option1.isSelected());
    //    select.selectByValue("2");
    //    Assert.assertTrue(dropDownPage.option2.isSelected());
        select.selectByIndex(2);  //selectByIndex() index starts from 0, 1, 2
        // xpath index 1, 2, 3
        Assert.assertTrue(dropDownPage.option2.isSelected());



    }

    @Then("user asserts Option {int} and Option {int} are selected.")
    public void user_asserts_option_and_option_are_selected(Integer int1, Integer int2) {
      //  Assert.assertTrue(dropDownPage.option2.isSelected());
    }



}
