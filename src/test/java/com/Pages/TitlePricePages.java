package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TitlePricePages extends Library {

    SeleniumReusable se;

    @FindBy(xpath = "//div[@class = 'KzDlHZ']")
    List<WebElement> titles;

    @FindBy(xpath = "//div[@class = 'Nx9bqj _4b5DiR']")
    List<WebElement> prices;

    public TitlePricePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    public void getTitlePrices() {
       se.getMultipleTextFromMultipleElement(titles, prices);
    }
}
