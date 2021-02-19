package com.demoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{
    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    public WebElement elementbutton;

    @FindBy(xpath = "(//li[@id='item-8'])[1]")
    public WebElement dinamicproperties;

    @FindBy(xpath = "//button[@id='enableAfter']")
    public WebElement seconds;

    @FindBy(xpath = "//button[@id='visibleAfter']")
    public WebElement visibility;
}
