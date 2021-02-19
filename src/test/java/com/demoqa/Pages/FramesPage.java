package com.demoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement alertframewindows;

    @FindBy(xpath = "(//span[contains(text(),'Frames')])[1]")
    public WebElement framesmenu;

    @FindBy(xpath = "(//div[@id='frame1Wrapper'])")
    public WebElement fratext;

}
