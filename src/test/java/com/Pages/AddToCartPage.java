package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends Library {
     SeleniumReusable se ;

     @FindBy(xpath = "//a/span[text()='Login']")
     WebElement login;

     @FindBy(xpath = "//a/li[text()='Flipkart Plus Zone']")
     WebElement flipkartplus;

     @FindBy(xpath = "//span[text()='Home & Furniture']")
     WebElement homeandfurniture;

     @FindBy(xpath = "//a[text()='Wall Lamp']")
     WebElement walllampLink;

     @FindBy(xpath = "//div[@data-id='WLMGQ8M7BHHWPZKE']")
     WebElement walllamp;

     @FindBy(xpath = "//input[@id='pincodeInputId']")
     WebElement pincode;

     @FindBy(xpath = "//span[text()='Check']")
     WebElement check;


    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    public void MoveLogin(){
        se.mouseHover(login);
    }

    public void MoveFlipKartPlus(){
        se.click(flipkartplus);
    }

    public void MoveHomeAndFurniture(){
        se.mouseHover(homeandfurniture);
    }

    public void MoveWallLamp(){
        se.click(walllampLink);
    }

    public void clickLamp(){
        se.click(walllamp);
    }

    public void EnterPincode() throws InterruptedException {
        se.windowHandle(walllamp);
        se.waitSleep();
        se.EnterValue(pincode,"400033");

    }

    public  void CheckPincode(){
        se.click(check);
    }
}
