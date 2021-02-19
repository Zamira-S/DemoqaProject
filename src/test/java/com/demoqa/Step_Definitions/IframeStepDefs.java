package com.demoqa.Step_Definitions;

import com.demoqa.Pages.FramesPage;
import com.demoqa.Utilities.BrowserUtils;
import com.demoqa.Utilities.ConfigurationReader;
import com.demoqa.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;


public class IframeStepDefs {
    Driver driver;

    FramesPage framesPage = new FramesPage();

    @Given("The user on the main page.")
    public void the_user_on_the_main_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Then("The user should be able to click the {string} button.")
    public void the_user_should_be_able_to_click_the_button(String menu) {


        framesPage.alertframewindows.click();
    }

    @Then("The user click on the {string} button.")
    public void the_user_click_on_the_button(String string) {
        framesPage.framesmenu.click();
    }

    @Then("The user verify the {string} text.")
    public void the_user_verify_the_text(String string) {

        Driver.get().switchTo().frame("frame1");
        BrowserUtils.waitFor(1);
        String actualText = Driver.get().findElement(By.id("sampleHeading")).getText();
        System.out.println("sampleHeading = " + actualText);
        Assert.assertEquals("This is a sample page", actualText);


    }

}
