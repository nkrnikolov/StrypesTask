package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public boolean isLoaded() {
        return isElementDisplayed(driver, menu);
    }

    //locators
    private final By menu = new By.ByCssSelector("[class] #header_pop:nth-of-type(1) [data-id='3c487578'] .elementor-nav-menu--layout-horizontal");
    //menu tabs
    private final By about = new By.ByXPath("//body/div[@id='page']/div[1]/section[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
    private final By services = new By.ByCssSelector("[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-45']");
    private final By customers = new By.ByCssSelector("[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-52'] .elementor-item");
    private final By nearsurance = new By.ByCssSelector("[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-749']");
    private final By resources = new By.ByCssSelector("[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-2634'] [aria-haspopup]");
    private final By careers = new By.ByXPath("//body/div[@id='page']/div[1]/section[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]");
    private final By contact = new By.ByXPath("//body/div[@id='page']/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]");
    //cookies
    private final By rejectCookiesButton = new By.ByCssSelector(".cky-consent-bar .cky-btn.cky-btn-reject");


    public void clickHomePageTabWithDropdownOptions(String tab) {
        tab = tab.replace("\"", "");
        switch (tab) {
            case "about" -> doubleClick(driver, about);
            case "services" -> doubleClick(driver, services);
            case "resources" -> doubleClick(driver, resources);
            default -> throw new IllegalArgumentException("Not Supported tab: " + tab);
        }
    }

    public void clickHomePageTabWithNoDropdownOptions(String tab) {
        tab = tab.replace("\"", "");
        switch (tab) {
            case "customers" -> click(driver, customers);
            case "nearsurance" -> click(driver, nearsurance);
            case "careers" -> click(driver, careers);
            case "contact" -> click(driver, contact);
            default -> throw new IllegalArgumentException("Not Supported tab: " + tab);
        }
    }

    public void clickRejectCookies(){
        click(driver, rejectCookiesButton);
    }

    public String getCurrentUrl(){
        return getUrl(driver);
    }
}