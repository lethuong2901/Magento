package PageObjects;



import PageUIs.RegisterPageUIs;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends
		BasePage {
    private WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

	public HomePageObject clickToLoginButton() {
		   waitForElementClickable(driver, RegisterPageUIs.REGISTER_BUTTON);
	        clickToElement(driver,RegisterPageUIs.REGISTER_BUTTON);
		return PageGenerator.getHomePage(driver);
	}

	public void inputToTextboxByLable(WebDriver driver, String Lable, String value ) {
		waitForElementVisible(driver, RegisterPageUIs.FIELDNAME_TEXTBOX,Lable);
		sendkeyToElement(driver, RegisterPageUIs.FIELDNAME_TEXTBOX, value, Lable);
	}



}
