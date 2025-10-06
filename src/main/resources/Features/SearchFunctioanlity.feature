Feature: To validate the flipkart application

  Background:
    Given launch the flipkart application
    When close the popup
    Then it navigates to the homescreen

  @tc001 @Regression
  Scenario: To validate the search functionality
    Given user enter text in search fields
    When click the search button
    Then it should navigate to search result page and display the relvant details
    Then Extract the whole result and print it in console
    Then print the Third result and keep it in the console
    And select Ram
    And it should select minimum and maximum amount
    And select brand
    And select the battery capacity
    Then it should display the relevant details

  @tc002 @Regression
  Scenario: To validate the fashion functionality
    Given user move to fashion link
    When cusor move to kids link
    And move to girls dress and click
    And click price high to low link
    Then it should navigate to search result page and display the relvant detais and get the title

  @tc003 @Regression
  Scenario Outline: To verify the search functionalities with various values
    Given Enter the "<searchtext>" in the searchfield
    When click the search button
    Then it should navigate to the next page and display the corresponding page
    Examples:
      | searchtext |
      | Shirts     |
      | Saree      |
      | Suit       |
      | Sandle     |

  @tc004 @Regression
  Scenario: To validate upto addcart functionality
    Given user can move to login link
    When user can click on flipkart plus zone
    And mouse move to the Home&Funrniture link
    And going to click on the wall lamp
    And scroll down the page and click on one particular result
    And enter the deliver pincode and check the link
    Then pincode should be checked and displayed and verify the titles

  @tc005 @Regression
  Scenario: To get the title and price from the search result

    Given user enter text in search fields
    When click the search button
    Then it should display the search result and get the title and price


    @tc006 @Regression
    Scenario: To test the search functionality with excel
      Given Enter search text in search fields
      When click search button
      Then it should display the relvant details



