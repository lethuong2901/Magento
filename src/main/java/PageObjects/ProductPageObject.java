package PageObjects;



import PageUIs.ProductPageUIs;
import PageUIs.RegisterPageUIs;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class ProductPageObject extends
		BasePage {
    private WebDriver driver;

    public ProductPageObject(WebDriver driver) {
        this.driver = driver;
    }

	public ProductDetailPageObject clickToProductName(WebDriver driver, String productName) {
		waitForElementClickable(driver, ProductPageUIs.PRODUCT_NAME,productName);
		clickToElement(driver, ProductPageUIs.PRODUCT_NAME,productName);
		return PageGenerator.getProductDetailPage(driver);
	}

	public String getPriceOfProduct(String productName) {
		waitForElementVisible(driver, ProductPageUIs.PRODUCT_PRICE,productName);
		return getElementText(driver, ProductPageUIs.PRODUCT_PRICE,productName);
	}

	public CartPageObject AddProductToCart(WebDriver driver, String productName) {
		waitForElementClickable(driver,ProductPageUIs.ADD_CART_BUTTON,productName);
		clickToElement(driver,ProductPageUIs.ADD_CART_BUTTON,productName);
		return PageGenerator.getCartPage(driver);
	}
}
