package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NearsurancePage;
import pages.HomePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NearsurancePageSteps {
    HomePage homePage = new HomePage();
    NearsurancePage nearsurancePage = new NearsurancePage();
    int tabs;

    @Given("I navigate to nearsurance tab {string}")
    public void i_navigate_to_nearsurance_tab(String tab) {
        homePage.clickRejectCookies();
        homePage.clickHomePageTabWithNoDropdownOptions(tab);
        assertThat(nearsurancePage.isLoaded()).isTrue();
    }

    @When("I try to open nearsurance whitepaper")
    public void i_try_to_open_nearsurance_whitepaper() {
        tabs = nearsurancePage.getBrowserTabs();
        nearsurancePage.clickNearsuranceWhitepaperButton();
    }

    @Then("new tab is opened with the nearsurance whitepaper")
    public void new_tab_is_opened_with_the_nearsurance_whitepaper() {
        assertThat(tabs < nearsurancePage.getBrowserTabs()).isTrue();
    }
}