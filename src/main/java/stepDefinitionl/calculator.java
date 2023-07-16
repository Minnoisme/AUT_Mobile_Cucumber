package stepDefinitionl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calculator {

    @Given("open the calculator app")
    public void open_the_calculator_app() {
        System.out.println("This is step : open the calculator app");
    }
    @Given("Click to number one")
    public void click_to_number_one() {
        System.out.println("This is step : click to number one");

    }
    @Given("Click to plus button")
    public void click_to_plus_button() {
        System.out.println("This is step : Click to plus button");

    }
    @Given("Click to number two")
    public void click_to_number_two() {
        System.out.println("This is step : Click to number two");

    }

    @When("Click to equal button")
    public void click_to_equal_button() {
        System.out.println("This is step : Click to equal button");

    }

    @When("The result should be three")
    public void The_result_should_be_three() {
        System.out.println("This is step : The result should be three");

    }

    @Given("open the browser")
    public void open_the_browser() {
        System.out.println("This is step : open the browser");

    }

    @Given("navigate to google.com")
    public void navigate_to_google_com() {
        System.out.println("This is step : navigate to google.com");

    }

    @Given("input text {string}")
    public void input_text(String string) {
        System.out.println("This is step : input text " + string);

    }

    @When("click to search button")
    public void click_to_search_button() {
        System.out.println("This is step : click to search button");

    }

    @Then("The result should be show")
    public void the_result_should_be_show() {
        System.out.println("This is step : The result should be show");

    }
}
