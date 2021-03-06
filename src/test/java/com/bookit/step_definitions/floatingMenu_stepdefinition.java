package com.bookit.step_definitions;

import com.bookit.pages.FloatingMenuPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class floatingMenu_stepdefinition {

  FloatingMenuPage floatingMenuPage = new FloatingMenuPage();

    @Given("user is on the Floating Menu page")
    public void user_is_on_the_floating_menu_page() {

       String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/floating_menu");
    }

    @When("user scrolls the page")
    public void user_scrolls_the_page() {
      JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
      js.executeScript("window.scrollBy(0, -750)");
    }

    @Then("floating menu is still displayed.")
    public void floating_menu_is_still_displayed() {
        Assert.assertTrue(floatingMenuPage.FloatingMenu.isDisplayed());
        Assert.assertTrue(floatingMenuPage.HomeButton.isDisplayed());
        Assert.assertTrue(floatingMenuPage.NewsButton.isDisplayed());
        Assert.assertTrue(floatingMenuPage.ContactButton.isDisplayed());
        Assert.assertTrue(floatingMenuPage.AboutButton.isDisplayed());


        List<WebElement> floatingLists=floatingMenuPage.floatingMenus;
        for (int i = 1; i < floatingLists.size()-1; i++) {
            Assert.assertTrue(floatingLists.get(i).isDisplayed());
   //type   floatingLists.get(i).getText().soutv then press enter
            System.out.println("floatingLists.get(i).getText() = " + floatingLists.get(i).getText());

//            floatingLists.get(i).getText() = Home
//            floatingLists.get(i).getText() = News
//            floatingLists.get(i).getText() = Contact
//            floatingLists.get(i).getText() = About

        }

        System.out.println("floatingLists.get(2).getText() = " + floatingLists.get(2).getText());
        //floatingLists.get(2).getText() = News
        System.out.println("floatingLists.size() = " + floatingLists.size());

    }


}


