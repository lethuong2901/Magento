package PageObjects.User;


import PageUIs.User.LoginPageUIs;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends
        BasePage {
    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void inputToPassword(String password) {
        waitForElementVisible(driver, LoginPageUIs.PASSWORD_TEXTBOX);
        sendkeyToElement(driver,LoginPageUIs.PASSWORD_TEXTBOX ,password);
    }

    public void clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUIs.SUBMIT_BUTTON);
        clickToElement(driver, LoginPageUIs.SUBMIT_BUTTON);
    }

    public void inputToEmailAdress(String email) {
        waitForElementVisible(driver, LoginPageUIs.EMAIL_TEXTBOX);
        sendkeyToElement(driver,LoginPageUIs.EMAIL_TEXTBOX ,email);
    }
}
