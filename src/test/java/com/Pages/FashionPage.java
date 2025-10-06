package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionPage extends Library {
    SeleniumReusable se;
    @FindBy(xpath = "//span[text()=\'Fashion\']/../preceding-sibling::div")
    WebElement fashion_link;

    @FindBy(xpath = "//span[text()='Baby & Kids']")
    WebElement baby_kids_link;

    @FindBy(xpath = "//a[normalize-space(text())=\"Girls' Sweatshirts\"]")
    WebElement girls_sweatShirt;

    @FindBy(xpath = "//div[text()='Price -- Low to High']")
    WebElement low_to_high;

    public FashionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    public void move_to_fashion_link() {
        se.mouseHover(fashion_link);
    }

    public void click_fashion_click(){
        se.mouseClick(fashion_link);
    }

    public void click_baby_kids_click(){
        se.mouseHover(baby_kids_link);
    }

    public void click_girls_sweatShirt(){
        se.mouseClick(girls_sweatShirt);
    }

    public void click_low_to_high(){
        se.mouseClick(low_to_high);
    }
}
