package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends Library {
    SeleniumReusable se;
    public FilterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[5]/div[4]/div[1]/select")
    WebElement filter_min;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[5]/div[4]/div[3]/select")
    WebElement filter_value;

    @FindBy(xpath = "//div[text()='vivo']/preceding-sibling::div")
    WebElement filter_brand;

    @FindBy(xpath = "//div[text()='3 GB']/preceding-sibling::div")
    WebElement filter_ram;

    @FindBy(xpath = "//div[text()='Battery Capacity']/..")
    WebElement filter_battery_arrow;

    @FindBy(xpath = "//div[text()='3000 - 3999 mAh']/preceding-sibling::div")
    WebElement filter_battery;


    public void Min(){
        se =new SeleniumReusable(driver);
        se.dropdown(filter_min,"10000");
    }

    public  void Max(){
        se =new SeleniumReusable(driver);
        se.dropdown(filter_value,"20000");
    }

    public void Ram(){
        se =new SeleniumReusable(driver);
        se.click(filter_ram);
    }

    public void Brand(){
        se =new SeleniumReusable(driver);
        se.scrolldown(filter_brand);
        se.click(filter_brand);
    }

    public void Battery(){
        se =new SeleniumReusable(driver);
        se.click(filter_battery_arrow);
        se.click(filter_battery);
    }
}
