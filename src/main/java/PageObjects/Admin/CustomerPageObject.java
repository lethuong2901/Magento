package PageObjects.Admin;

import PageUIs.Admin.CustomerPageUIs;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class CustomerPageObject extends BasePage {
    private WebDriver driver;
    public CustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToSearchByEmail(String email) {
        waitForAllElementVisible(driver, CustomerPageUIs.EMAIL_TEXTBOX);
       sendkeyToElement(driver, CustomerPageUIs.EMAIL_TEXTBOX, email);
    }

    public void clickToSearchButton() {
        waitForElementClickable(driver, CustomerPageUIs.SEARCH_BUTTON);
        clickToElement(driver, CustomerPageUIs.SEARCH_BUTTON);
    }
}
