package PageObjects.Admin;


import PageUIs.Admin.LoginPageUIs;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends
        BasePage {
    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToUsername(String username) {
        waitForElementVisible(driver, LoginPageUIs.USERNAME_TEXTBOX);
        sendkeyToElement(driver, LoginPageUIs.USERNAME_TEXTBOX, username);
    }

    public void inputToPassword(String password) {
        waitForElementVisible(driver, LoginPageUIs.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUIs.PASSWORD_TEXTBOX, password);
    }

    public void clickToButton() {
        waitForElementVisible(driver, LoginPageUIs.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUIs.LOGIN_BUTTON);
    }

    public void clickToCloseButton() {
        waitForElementVisible(driver, LoginPageUIs.CLOSE_ICON);
        clickToElement(driver, LoginPageUIs.CLOSE_ICON);
    }
}
