package PageObjects.User;
import PageUIs.User.ProductDetailPageUIs;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductDetailPageObject extends
		BasePage {
    private WebDriver driver;

    public ProductDetailPageObject(WebDriver driver) {
        this.driver = driver;
    }

	public String getPriceOfProduct() {
		waitForElementVisible(driver, ProductDetailPageUIs.PRODUCT_PRICE);
		return getElementText(driver, ProductDetailPageUIs.PRODUCT_PRICE);
	}
}
