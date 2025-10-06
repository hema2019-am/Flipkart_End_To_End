package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleSearchPage extends Library {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;
    SeleniumReusable sr ;
    public MultipleSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        sr  = new SeleniumReusable(driver);
    }


    public void enterSearch(String searchText){
        sr.EnterValue(searchBox,searchText);
    }

    public void ClickOnSearchButton() {
        searchBox.sendKeys(Keys.ENTER);
    }
}
