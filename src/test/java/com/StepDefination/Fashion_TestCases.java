package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.FashionPage;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.FindBy;

public class Fashion_TestCases extends Library {

    FashionPage fs;
    SeleniumReusable se;
    String title;
    @Given("user move to fashion link")
    public void user_move_to_fashion_link() {
     fs = new FashionPage(driver);
     se = new SeleniumReusable(driver);
        System.out.println("Before clicking kids page");
     se.getTitle();
     fs.click_fashion_click();
    }
    @When("cusor move to kids link")
    public void cusor_move_to_kids_link() {

        fs.click_baby_kids_click();
    }
    @When("move to girls dress and click")
    public void move_to_girls_dress_and_click() {

        fs.click_girls_sweatShirt();
    }
    @When("click price high to low link")
    public void click_price_high_to_low_link() {

        fs.click_low_to_high();
    }
    @Then("it should navigate to search result page and display the relvant detais and get the title")
    public void it_should_navigate_to_search_result_page_and_display_the_relvant_detais_and_get_the_title() {
        System.out.println("After clicking kids link ");
        se.getTitle();
    }
}
