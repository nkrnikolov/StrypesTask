package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @ParameterType(".*")
    public String tab(String tab) {
        return tab;
    }

    @ParameterType(".*")
    public String url(String url) {
        return url;
    }
    @Given("I am on home page")
    public void i_am_on_home_page() {
        assertThat(homePage.isLoaded()).isTrue();
    }

    @When("I click home page tab with dropdown options {tab}")
    public void i_click_home_page_tab_with_dropdown_options(String tab) {
        homePage.clickHomePageTabWithDropdownOptions(tab);
    }

    @When("I click home page tab with no dropdown options {tab}")
    public void i_click_home_page_tab_with_no_dropdown_options(String tab) {
        homePage.clickHomePageTabWithNoDropdownOptions(tab);
    }

    @Then("I am redirected to {url}")
    public void i_am_redirected_to_url(String url) {
        url = url.replace("\"", "");
        assertThat(homePage.getCurrentUrl())
                .as("Check if the current URL is as expected")
                .contains(url);
    }
}
