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
    }
}
