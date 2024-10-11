package pages;

import org.openqa.selenium.By;

public class ContactPage extends BasePage {
    public boolean isLoaded() {
        return isElementDisplayed(driver, sendButton);
    }

    //locators
    private final By sendButton = new By.ByCssSelector(".hs-button.large.primary");
    //error messages
    private final By wrongEmailErrorMessage = new By.ByCssSelector(".field.hs-email.hs-fieldtype-text.hs-form-field.hs_email > ul[role='alert']  .hs-error-msg.hs-main-font-element");
    private final By termsAndConditionsErrorMessage = new By.ByCssSelector(".field.hs-LEGAL_CONSENT\\.subscription_type_4681882.hs-fieldtype-booleancheckbox.hs-form-field.hs_LEGAL_CONSENT\\.subscription_type_4681882 > ul[role='alert']  .hs-error-msg.hs-main-font-element");
    private final By completeAllMandatoryFieldsErrorMessage = new By.ByCssSelector(".hs_error_rollup .hs-main-font-element");

    public void clickSendButton(){
        click(driver, sendButton);
    }

    public boolean areErrorMessagesDisplayed(){
        return isElementDisplayed(driver, wrongEmailErrorMessage) &&
               isElementDisplayed(driver, termsAndConditionsErrorMessage) &&
               isElementDisplayed(driver, completeAllMandatoryFieldsErrorMessage);
    }
}
