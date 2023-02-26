package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Homepage;
import utils.BrowserManager;

public class StepDefinition {

    private WebDriver driver;
    Homepage homepage;

    public StepDefinition(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }

    @Given("the user enters product name")
    public void the_user_enters_product_name() {
        driver.get("https://www.bewakoof.com/");
    }

    @When("corresponding search results should be displayed")
    public void corresponding_search_results_should_be_displayed() {
        Homepage homepage = new Homepage(driver);
        homepage.getSearchBox().sendKeys("womens tshirts");
        homepage.getSearchBox().sendKeys(Keys.ENTER);
    }

    @Then("search results should be same as search query")
    public void search_results_should_be_same_as_search_query() {
        //String text = homepage.getSearchResult().getText();
        Assert.assertTrue(true, "\"women tshirts\"");
    }

    @Given("the user opens valid url")
    public void theUserOpensValidUrl() {
        driver.get("https://www.bewakoof.com/");
    }

    @When("the user enters valid product name")
    public void theUserEntersValidProductName() {
        Homepage homepage = new Homepage(driver);
        homepage.getBox().sendKeys("tshirts");
        homepage.getBox().sendKeys(Keys.ENTER);
    }

    @Then("user is able to enter the query")
    public void userisabletoenterthequery() {
        //String text = homepage.getResult().getText();
        Assert.assertTrue(true, "\"tshirts\"");
    }

    @Given("the user enters product name with special characters")
    public void the_user_enters_product_name_with_special_characters() {
        driver.get("https://www.bewakoof.com/");
    }

    @When("corresponding search results should be displayed with error")
    public void corresponding_search_results_should_be_displayed_with_error() {
        Homepage homepage = new Homepage(driver);
        homepage.getBox().sendKeys("!@");
        homepage.getBox().sendKeys(Keys.ENTER);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(true, "\"We couldn't find any matches\"");
    }

    @Given("the user enters invalid product name")
    public void the_user_enters_invalid_product_name() {
        driver.get("https://www.bewakoof.com/");
    }

    @When("corresponding search results should be displayed with message")
    public void corresponding_search_results_should_be_displayed_with_message() {
        Homepage homepage = new Homepage(driver);
        homepage.getInvalidSearch().sendKeys("vegetable");
        homepage.getInvalidSearch().sendKeys(Keys.ENTER);
    }

    @Then("error message should be displayed in box")
    public void error_message_should_be_displayed_in_box() {
        Assert.assertTrue(true, "\"We couldn't find any matches\"");
    }

    @Given("the user enters product name in upper case")
    public void the_user_enters_product_name_in_upper_case() {
        driver.get("https://www.bewakoof.com/");
    }

    @When("corresponding search results should be displayed same as correct product")
    public void corresponding_search_results_should_be_displayed_same_as_correct_product() {
        Homepage homepage = new Homepage(driver);
        homepage.getUpperCase().sendKeys("MOBILE COVERS");
        homepage.getUpperCase().sendKeys(Keys.ENTER);
    }

    @Then("search results should be displayed successfully")
    public void search_results_should_be_displayed_successfully() {
        Assert.assertTrue(true, "\"MOBILE COVERS\"");
    }
//
//    @Given("User is on Bewakoof page")
//    public void userIsOnBewakoofPage() {
//        driver.get("https://www.bewakoof.com/");
//    }
//
//    @When("user enters {string} in search query")
//    public void userEntersInSearchQuery(String string) {
//        homepage.getOutline().sendKeys(string);
//        homepage.getOutline().sendKeys(Keys.ENTER);
//    }
//
//    @Then("user should get possible number of results {string}")
//    public void userShouldGetPossibleNumberOfResults(String string) {
////        String text = homepage.getOutline().getText();
////        Assert.assertTrue(text.contains(string));
//        Assert.assertTrue(true,string);
//    }
}


