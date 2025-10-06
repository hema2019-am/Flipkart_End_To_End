package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.TitlePricePages;
import io.cucumber.java.en.*;

public class TitlePrice_TestCases extends Library {

    TitlePricePages titlePricePages;
    @Then("it should display the search result and get the title and price")
    public void it_should_display_the_search_result_and_get_the_title_and_price() {
     titlePricePages = new TitlePricePages(driver);
     titlePricePages.getTitlePrices();
    }
}
