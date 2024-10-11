package pages;

import org.openqa.selenium.By;

public class NearsurancePage extends BasePage {
    public boolean isLoaded() {
        return isElementDisplayed(driver, nearsuranceWhitepaperButton);
    }

    //locators
    private final By nearsuranceWhitepaperButton = new By.ByLinkText("LEARN MORE IN OUR NEARSURANCE WHITEPAPER");

    public void clickNearsuranceWhitepaperButton(){
        click(driver, nearsuranceWhitepaperButton);
    }

    public int getBrowserTabs() {
        return driver.getWindowHandles().size();
    }
}
