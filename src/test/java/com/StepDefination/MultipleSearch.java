package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.MultipleSearchPage;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.en.*;

public class MultipleSearch extends Library {
    MultipleSearchPage mp;
    SeleniumReusable sr;
    String text ;

    @Given("Enter the {string} in the searchfield")
    public void enter_the_in_the_searchfield(String string) {
        mp = new MultipleSearchPage(driver);
        text = string;
        mp.enterSearch(string);
    }

    @Then("it should navigate to the next page and display the corresponding page")
    public void it_should_navigate_to_the_next_page_and_display_the_corresponding_page() {
        sr = new SeleniumReusable(driver);
        sr.getTitle();
        String path = "src/main/resources/ScreenShot/"+text+".png";
        System.out.println("Screen Shot"+path);
        sr.screenShot(path);
    }
}
