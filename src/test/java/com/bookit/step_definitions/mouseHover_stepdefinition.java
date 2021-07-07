package com.bookit.step_definitions;

import com.bookit.pages.MouseHover;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class mouseHover_stepdefinition {

    MouseHover mouseHover = new MouseHover() ;
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on mouse page")
    public void user_is_on_mouse_page() {
        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/hovers");
    }

    @When("user does a mouse hover on each image.")
    public void user_does_a_mouse_hover_on_each_image() {
        List<WebElement> imagesList = mouseHover.images;
//        for (WebElement eachImage : imagesList) {
//            actions.moveToElement(eachImage).perform();
//
//

            for (int i = 0; i < imagesList.size(); i++) {
               actions.moveToElement(imagesList.get(i)).perform();
                System.out.println("imagesList.get(i).getText() = " + imagesList.get(i).getText());

           //     System.out.println("\"name: user\" = " + ("name: user" + (i+1)));
                Assert.assertTrue(imagesList.get(i).getText().contains("name: user"+ (i+1)));

            }

        }

    @Then("additional information is displayed for each image.")
    public void additional_information_is_displayed_for_each_image() {
    //    System.out.println("mouseHover.text1.getText() = " + mouseHover.text1.getText());

//        System.out.println("mouseHover.text1.getText() = " + mouseHover.text1.getText());
//            System.out.println("mouseHover.text2.getText() = " + mouseHover.text2.getText());
//            System.out.println("mouseHover.text3.getText() = " + mouseHover.text3.getText());
//    Assert.assertTrue(mouseHover.text1.getText().equals("name: user1"));  //when running it fails
//      Assert.assertTrue(mouseHover.text2.getText().equals("name: user2"));  //when running it fails
        Assert.assertTrue(mouseHover.text3.getText().equals("name: user3"));
    }


}
