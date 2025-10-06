package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.SearchWithExcelPage;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.en.*;

import java.io.IOException;

public class SearchWithExcel_TestCases extends Library {

    SearchWithExcelPage searchWithExcelPage;
    SeleniumReusable se;
    @Given("Enter search text in search fields")
    public void enter_search_text_in_search_fields() throws IOException, InterruptedException {
     searchWithExcelPage = new SearchWithExcelPage(driver);
     searchWithExcelPage.SearchWithExcel();
    }
    @When("click search button")
    public void click_search_button() {
     se =new SeleniumReusable(driver);
     se.screenShot("src/main/resources/ScreenShot/SearchWithExcel.png");
    }
    @Then("it should display the relvant details")
    public void it_should_display_the_relvant_details() {
        se.getTitle();
    }

}
