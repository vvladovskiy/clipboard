Feature: Amazon.in Navigation Pages Functionality

    User story: As a user, when I am on the Amazon.in Home page
    I should be able to check a second highest priced Samsung TV
    and take information about this TV.

    Background:
        Given User is on Amazon.in Home page

    @smoke
    Scenario: Page Navigation Functionality result "About this item"
        When Click on the hamburger menu in the top left corner.
        And Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.
        When Click on Televisions under Tv, Audio & Cameras sub section.
        And Scroll down and filter the results by Brand ‘Samsung’.
        When Sort the Samsung results by click Sort By.
        And Choose price sort High to Low.
        When Click on the second highest priced item.
        And Switch the Window.
        Then Assert that “About this item” section is present and log this section text to console report.


