package PageObjects;


import PageUIs.HomePageUIs;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends
        BasePage {
    private WebDriver driver;

    public HomePageObject (WebDriver driver) {
        this.driver = driver;
    }

    public void clickToAccountLink() {
        waitForElementClickable(driver, HomePageUIs.ACCOUNT_LINK);
        clickToElement(driver, HomePageUIs.ACCOUNT_LINK);
    }

	
}
