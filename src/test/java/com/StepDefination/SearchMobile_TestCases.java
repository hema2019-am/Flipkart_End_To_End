package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.SearchPage;
import io.cucumber.java.en.*;

import java.io.IOException;

public class SearchMobile_TestCases extends Library {
    SearchPage sp;
    @Given("launch the flipkart application")
    public void launch_the_flipkart_application() throws IOException {
       //launchApplication();
    }
    @When("close the popup")
    public void close_the_popup() {
        System.out.println(driver.getTitle());
    }
    @Then("it navigates to the homescreen")
    public void it_navigates_to_the_homescreen() {
        sp = new SearchPage(driver);
        sp.HomeScreen();
    }
    @Given("user enter text in search fields")
    public void user_enter_text_in_search_fields() {
       sp.SearchText("mobile");
    }
    @When("click the search button")
    public void click_the_search_button() {
       sp.ClickOnSearchButton();
    }
    @Then("it should navigate to search result page and display the relvant details")
    public void it_should_navigate_to_search_result_page_and_display_the_relvant_details() {

      sp.Result();

    }

    @Then("Extract the whole result and print it in console")
    public void extract_the_whole_result_and_print_it_in_console() {
        System.out.println("Extract the whole result and print it in console");
        sp.printEntireResult();
    }
    @Then("print the Third result and keep it in the console")
    public void print_the_third_result_and_keep_it_in_the_console() {
        System.out.println("Third result and keep it in the console");
        sp.print3Result();
    }


}
