package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CareersPage extends BasePage {
    public boolean isLoaded() {
        return isElementDisplayed(driver, openPositionsDropdown);
    }

    //Locators
    private final By openPositionsDropdown = new By.ByCssSelector(".facetwp-dropdown");
    private final By firstSearchResult = new By.ByCssSelector("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]");
    //open positions locators
    private final By qualityAssuranceOption = new By.ByCssSelector(".facetwp-dropdown > option[value='quality-assurance']");
    private final By pythonDevelopment = new By.ByCssSelector(".facetwp-dropdown > option[value='python-development']");
    private final By dataEngineering = new By.ByCssSelector(".facetwp-dropdown > option[value='data-engineering']");


    public void clickOpenPositionsDropdown(){
        click(driver, openPositionsDropdown);
    }

    public void clickOpenPositionsTechnology(String openPosition){
        switch (openPosition.toLowerCase()) {
            case "quality assurance" -> click(driver, qualityAssuranceOption);
            case "python development" -> click(driver, pythonDevelopment);
            case "data engineering" -> click(driver, dataEngineering);
            default -> throw new IllegalArgumentException("Not Supported tab: " + openPosition);
        }
    }

    public String getText() {
        return getText(driver, firstSearchResult);
    }
}
