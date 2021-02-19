package com.demoqa.Step_Definitions;

import com.demoqa.Pages.ElementsPage;
import com.demoqa.Utilities.BrowserUtils;
import com.demoqa.Utilities.ConfigurationReader;
import com.demoqa.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ElementsStepDefs {

    Driver driver;
    ElementsPage elementsPage = new ElementsPage();

    @Given("The user on the main page")
    public void the_user_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Then("The user should be able to click the {string} button")
    public void the_user_should_be_able_to_click_the_button(String string) {
        elementsPage.elementbutton.click();
    }


    @Then("The user click on the {string} button")
    public void the_user_click_on_the_button(String string) {
        BrowserUtils.scrollToElement(elementsPage.dinamicproperties);
        elementsPage.dinamicproperties.click();


    }

    @Then("The user should be able to click Will enable five seconds after five seconds")
    public void the_user_should_be_able_to_click_Will_enable_five_seconds_after_five_seconds() {
        BrowserUtils.waitForClickablility(elementsPage.seconds, 5);
        elementsPage.seconds.click();
    }

    @Then("The user should be able to see Visible After five seconds")
    public void the_user_should_be_able_to_see_Visible_After_five_seconds() {
        elementsPage.visibility.isDisplayed();

    }
}