package com.bookit.step_definitions;

import com.bookit.pages.LoginPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_stepdefinition {

//to make a global object i put here instead of each method

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        //calling chrome driver and then get(calling class ConfigurationReader.getProperty()
     //option 1  Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl")+"/login");
     // or option 2 create String url =... and Driver.get

        String url = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(url+"/login");

    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
    //    loginPage.userNameInputBox.sendKeys("tomsmith");
        loginPage.userNameInputBox.sendKeys(ConfigurationReader.getProperty("username"));

    }
    @When("user enters correct password")
    public void user_enters_correct_password() {
    loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @Then("log in successfully")
    public void log_in_successfully() {

    String ActualText = loginPage.loginSuccessMessage.getText()  ;
    String ExpectedText = " logged into a secure area!" ;
    //    Assert.assertEquals(ActualText,ExpectedText);
        // AssertText.contains -> if ExpectedText exactly same it will not work
        // it works " logged into a secure area!"
        // however if we use assertEquals text must be exactly same
        Assert.assertTrue(ActualText.contains(ExpectedText));



    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.loginButton.click();
    }


    @When("user enters incorrect username")
    public void user_enters_incorrect_username() {
        loginPage.userNameInputBox.sendKeys("kpark");

    }


    @When("user enters incorrect password")
    public void user_enters_incorrect_password() {
        loginPage.passwordInputBox.sendKeys("you can do it");

    }
    @Then("log in fails")
    public void log_in_fails() {
     String ActualFailMsg = loginPage.loginFailMessage.getText();
     String ExpectedFailMsg = " username is invalid!" ;

     // for contains make sure that you put less message to make it work
     Assert.assertTrue(ActualFailMsg.contains(ExpectedFailMsg));
    }

}
