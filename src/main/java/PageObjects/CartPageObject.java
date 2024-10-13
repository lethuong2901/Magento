package PageObjects;



import PageUIs.CartPageUIs;
import PageUIs.RegisterPageUIs;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class CartPageObject extends
		BasePage {
    private WebDriver driver;

    public CartPageObject(WebDriver driver) {
        this.driver = driver;
    }

	public void inputDiscountCode(String discountCode) {
		waitForElementVisible(driver, CartPageUIs.DISCOUNT_TEXTBOX);
		sendkeyToElement(driver, CartPageUIs.DISCOUNT_TEXTBOX,discountCode);
	}

	public void clickToApplyButton() {
		waitForElementClickable(driver,CartPageUIs.APPLY_DISCOUNT_BUTTON);
		clickToElement(driver,CartPageUIs.APPLY_DISCOUNT_BUTTON);
	}
}
