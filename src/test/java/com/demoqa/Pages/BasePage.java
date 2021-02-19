package com.demoqa.Pages;

import com.demoqa.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    public WebElement elements;

    public void menuget(String menu) {
        Driver.get().findElement(By.xpath("//h5[(contains(text()),'" + menu + "']")).click();

    }
}


