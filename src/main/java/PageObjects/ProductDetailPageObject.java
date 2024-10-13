package PageObjects;
import PageUIs.ProductDetailPageUIs;
import PageUIs.RegisterPageUIs;
import commons.BasePage;
import commons.PageGenerator;
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
