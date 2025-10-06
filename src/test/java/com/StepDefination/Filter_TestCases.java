package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.FilterPage;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Filter_TestCases extends Library {
    FilterPage filter_page;
    SeleniumReusable sr;
    String text="//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]";
    @Then("it should select minimum and maximum amount")
    public void it_should_select_minimum_and_maximum_amount() throws InterruptedException {
        filter_page=new FilterPage(driver);
        sr = new SeleniumReusable(driver);
        String before = driver.findElement(By.xpath(text)).getText();
        System.out.println("Before Filter "+before);
        filter_page.Min();
        sr.waitSleep();
        filter_page.Max();
        sr.waitSleep();

    }
    @Then("select brand")
    public void select_brand() throws InterruptedException {
        filter_page=new FilterPage(driver);
        sr = new SeleniumReusable(driver);
        filter_page.Brand();
        sr.waitSleep();

    }
    @Then("select Ram")
    public void select_ram() throws InterruptedException {
        filter_page=new FilterPage(driver);
        sr = new SeleniumReusable(driver);
        filter_page.Ram();
        sr.waitSleep();

    }
    @Then("select the battery capacity")
    public void select_the_battery_capacity() throws InterruptedException {
        filter_page=new FilterPage(driver);
        sr = new SeleniumReusable(driver);
        filter_page.Battery();
        sr.waitSleep();
    }
    @Then("it should display the relevant details")
    public void it_should_display_the_relevant_details() {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        String after = driver.findElement(By.xpath(text)).getText();
        System.out.println("After Filter "+after);

    }
}
