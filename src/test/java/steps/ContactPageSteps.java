package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.HomePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ContactPageSteps {
    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();

    @Given("I navigate to contact tab {string}")
    public void i_navigate_to_contact_tab(String tab) {
        homePage.clickRejectCookies();
        homePage.clickHomePageTabWithNoDropdownOptions(tab);
        assertThat(contactPage.isLoaded()).isTrue();
    }

    @When("I try to submit empty form")
    public void i_try_to_submit_empty_form() {
        contactPage.clickSendButton();
    }

    @Then("mandatory fields error messages are displayed")
    public void mandatory_fields_error_error_messages_are_displayed() {
        assertThat(contactPage.areErrorMessagesDisplayed()).isTrue();
    }
}