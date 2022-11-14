package clipboard_health_coding_exercise.step_definitions;

import clipboard_health_coding_exercise.pages.AmazonElectronicsTelevisionPage;
import clipboard_health_coding_exercise.pages.AmazonHomePage;
import clipboard_health_coding_exercise.pages.AmazonSamsungPage;
import clipboard_health_coding_exercise.pages.AmazonSecondWindowPage;
import clipboard_health_coding_exercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class AmazonSearch {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonElectronicsTelevisionPage amazonElectronicsTelevisionPage = new AmazonElectronicsTelevisionPage();
    AmazonSamsungPage amazonSamsungPage = new AmazonSamsungPage();
    AmazonSecondWindowPage amazonSecondWindowPage = new AmazonSecondWindowPage();

    WebDriver driver = Driver.getDriver();


    @Given("User is on Amazon.in Home page")
    public void user_is_on_amazon_in_home_page() {
        Driver.getDriver().get("https://www.amazon.in");
    }

    @When("Click on the hamburger menu in the top left corner.")
    public void click_on_the_hamburger_menu_in_the_top_left_corner() {
        amazonHomePage.hamburgerMenu.click();
    }

    @And("Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.")
    public void scroll_down_and_then_click_on_the_tv_appliances_and_electronics_link_under_shop_by_department_section() {
        amazonHomePage.tvAppliancesElectronicsLink.click();
    }

    @When("Click on Televisions under Tv, Audio & Cameras sub section.")
    public void click_on_televisions_under_tv_audio_cameras_sub_section() {
        amazonHomePage.televisionsLink.click();
    }

    @And("Scroll down and filter the results by Brand ‘Samsung’.")
    public void scroll_down_and_filter_the_results_by_brand_samsung() {
        amazonElectronicsTelevisionPage.checkBoxSamsung.click();
    }

    @When("Sort the Samsung results by click Sort By.")
    public void sort_the_samsung_results_by_click_sort_by() {
        amazonSamsungPage.sortBy.click();
    }


    @When("Choose price sort High to Low.")
    public void choose_price_sort_high_to_low() {
        amazonSamsungPage.highToLow.click();
    }

    @When("Click on the second highest priced item.")
    public void click_on_the_second_highest_priced_item() {
        amazonSamsungPage.secondHighPriceItem.click();
    }


    @And("Switch the Window.")
    public void switch_the_window() {
        // String SecondWindow = driver.getWindowHandle();

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("handles" + each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

    }

    @Then("Assert that “About this item” section is present and log this section text to console report.")
    public void assert_that_about_this_item_section_is_present_and_log_this_section_text_to_console_report() {

        Assert.assertEquals("About this item", amazonSecondWindowPage.aboutThisItem.getText().trim());

        System.out.println(amazonSecondWindowPage.text01.getText()+"\n"+amazonSecondWindowPage.text02.getText()+"\n"+amazonSecondWindowPage.text03.getText()+"\n"+amazonSecondWindowPage.text04.getText()+"\n"+amazonSecondWindowPage.text05.getText()+"\n"+amazonSecondWindowPage.text06.getText()+"\n"+amazonSecondWindowPage.text07.getText()+"\n"+amazonSecondWindowPage.text08.getText());

    }
}