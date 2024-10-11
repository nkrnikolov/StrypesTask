package pages;

import helpers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.getInstance().getWebDriver();
    }

    public void click(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void doubleClick(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(by);
        element.click();
        element.click();
    }

    public boolean isElementDisplayed(WebDriver driver, By locator) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(locator);
        return element.isDisplayed();
    }

    public String getText(WebDriver driver, By by){
        return driver.findElement(by).getText();
    }

    public String getUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }
}
