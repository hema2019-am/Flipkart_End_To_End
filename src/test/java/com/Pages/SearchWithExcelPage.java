package com.Pages;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import com.utlis.ExcelUtlities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchWithExcelPage extends Library {

    SeleniumReusable se;
    public SearchWithExcelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;
    @FindBy(xpath =  "//*[@id=\"container\"]/div/div[2]/div/div")
    private WebElement HomePage;

    public void SearchWithExcel() throws IOException, InterruptedException {
        ExcelUtlities utlities = new ExcelUtlities();
        for(int i = 1;  i <= 6 ; i++){
            se.EnterValue(searchBox,utlities.ExcelRead("Sheet1",i,0));
            searchBox.sendKeys(Keys.ENTER);
            se.waitSleep();
            if(HomePage.isDisplayed()){
                utlities.ExcelWrite("Sheet1",i,1,"Pass");
            }else{
                utlities.ExcelWrite("Sheet1",i,1,"Fail");

            }
            se.navigationBack();
        }
    }
}
