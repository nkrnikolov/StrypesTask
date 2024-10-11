package steps;

import helpers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
    @Before
    public void setupScenario() {
        WebDriverManager.getInstance().getWebDriver();
    }

    @After
    public void tearDownScenario() {
        WebDriverManager.getInstance().tearDriver();
    }
}
