package PageObjects;

import PageUIs.MyAccountDashboardPageUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountDashboardPageObject extends
		BasePage {
    private WebDriver driver;

    public AccountDashboardPageObject(WebDriver driver) {
        this.driver = driver;
    }

	public boolean isNameDisplay(String fullname) {
		waitForElementVisible(driver, MyAccountDashboardPageUI.FULLNAME);
		return getElementText(driver,  MyAccountDashboardPageUI.FULLNAME).contains(fullname);
	}

	public boolean isEmailDisplay(String emailAddress) {
		waitForElementVisible(driver, MyAccountDashboardPageUI.EMAIL);
		return getElementText(driver,  MyAccountDashboardPageUI.EMAIL).contains(emailAddress);
	}
	public String getMessageRegister() {
		waitForElementVisible(driver, MyAccountDashboardPageUI.REGISTER_MESSAGE);
		return getElementText(driver, MyAccountDashboardPageUI.REGISTER_MESSAGE);
	}




	public boolean isTitleMyDashboardDisplay() {
		waitForElementVisible(driver, MyAccountDashboardPageUI.TITLE);
		System.out.print(getElementText(driver,MyAccountDashboardPageUI.TITLE));
       return getElementText(driver,MyAccountDashboardPageUI.TITLE).equals("MY DASHBOARD");

    }


	public String getTextAccountInfo() {
		waitForElementVisible(driver,MyAccountDashboardPageUI.LOGIN_NAME_INFO);
		return getElementText(driver,MyAccountDashboardPageUI.LOGIN_NAME_INFO);
	}
}
