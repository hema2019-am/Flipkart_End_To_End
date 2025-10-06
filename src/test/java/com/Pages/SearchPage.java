package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Objects;

public class SearchPage extends Library {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    @FindBy(xpath =  "//html[@lang='en-IN']")
    private WebElement HomePage;

    @FindBy(xpath = "//*[@id='container']/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]")
            private List<WebElement> entireResult;

    String SearchText ;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    SeleniumReusable  seleniumReusable = new SeleniumReusable(driver);
    public void SearchText(String searchText) {
        SearchText = searchText;
        seleniumReusable.EnterValue(searchBox, searchText);
    }

    public void ClickOnSearchButton() {
        searchBox.sendKeys(Keys.ENTER);
    }

    public void HomeScreen() {
        System.out.println(HomePage.isDisplayed());

    }

    public void Result(){
        boolean isPage = driver.getCurrentUrl().contains(SearchText);
        System.out.println("Page is: " + isPage);
    }

    public void printEntireResult(){
        seleniumReusable.getMultipleText(entireResult);
    }

    public void print3Result(){
        seleniumReusable.get3Result(entireResult);
    }




}
