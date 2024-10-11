package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareersPage;
import pages.HomePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CareersPageSteps {
    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();

    @Given("I navigate to careers page {string}")
    public void i_navigate_to_careers_tab(String tab) {
        homePage.clickRejectCookies();
        homePage.clickHomePageTabWithNoDropdownOptions(tab);
        assertThat(careersPage.isLoaded()).isTrue();
    }

    @When("I search for open position {string}")
    public void i_search_for_open_position(String text) {
        careersPage.clickOpenPositionsDropdown();
        careersPage.clickOpenPositionsTechnology(text);
    }

    @Then("the search result is correct {string} {string}")
    public void the_search_result_is_correct(String position, String resultText) {
        assertThat(position).as("Check if search result contains search text").contains(resultText);
    }
}
