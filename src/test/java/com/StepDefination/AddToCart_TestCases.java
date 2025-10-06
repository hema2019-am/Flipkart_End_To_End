package com.StepDefination;

import com.Baseclass.Library;
import com.Pages.AddToCartPage;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.en.*;

public class AddToCart_TestCases extends Library {

    AddToCartPage addToCartPage;
    SeleniumReusable se;

    @Given("user can move to login link")
    public void user_can_move_to_login_link() {
        addToCartPage = new AddToCartPage(driver);
        se = new SeleniumReusable(driver);
        System.out.println("Parent Window");
        se.getTitle();
        addToCartPage.MoveLogin();
    }

    @When("user can click on flipkart plus zone")
    public void user_can_click_on_flipkart_plus_zone() {
        addToCartPage.MoveFlipKartPlus();
    }

    @When("mouse move to the Home&Funrniture link")
    public void mouse_move_to_the_home_funrniture_link() {
        addToCartPage.MoveHomeAndFurniture();
    }

    @When("going to click on the wall lamp")
    public void going_to_click_on_the_wall_lamp() {
        addToCartPage.MoveWallLamp();
    }

    @When("scroll down the page and click on one particular result")
    public void scroll_down_the_page_and_click_on_one_particular_result() {
        addToCartPage.clickLamp();
    }

    @When("enter the deliver pincode and check the link")
    public void enter_the_deliver_pincode_and_check_the_link() throws InterruptedException {
        addToCartPage.EnterPincode();
    }

    @Then("pincode should be checked and displayed and verify the titles")
    public void pincode_should_be_checked_and_displayed_and_verify_the_titles() throws InterruptedException {
        addToCartPage.CheckPincode();
        se.waitSleep();
        se = new SeleniumReusable(driver);
        se.getTitle();
        se.screenShot("src/main/resources/ScreenShot/checkPincode.png");

    }

}
