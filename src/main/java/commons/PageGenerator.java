package commons;


import PageObjects.User.*;
import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }
    public static AccountDashboardPageObject getMyDashboardPage(WebDriver driver) {
        return new AccountDashboardPageObject(driver);
    }
    public static ProductPageObject getProductPage(WebDriver driver) {
        return new ProductPageObject(driver);
    }
    public static ProductDetailPageObject getProductDetailPage(WebDriver driver) {
        return new ProductDetailPageObject(driver);
    }
    public static CartPageObject getCartPage(WebDriver driver) {
        return new CartPageObject(driver);
    }

    public static PageObjects.Admin.LoginPageObject getLoginPageAdmin(WebDriver driver) {
        return new PageObjects.Admin.LoginPageObject(driver);
    }

}
