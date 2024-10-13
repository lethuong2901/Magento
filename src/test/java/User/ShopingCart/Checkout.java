package User.ShopingCart;
import PageObjects.*;
import commons.BaseTest;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Checkout extends BaseTest {
    WebDriver driver;
    private HomePageObject homePage;
    private ProductPageObject productPage;
    private CartPageObject shopingCartPage;
    private String discountCode;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
        driver= getBrowserDriver(browserName, url);
        homePage= PageGenerator.getHomePage(driver);
        homePage.clickToCategoryLink(driver,"Mobile");
        productPage= PageGenerator.getProductPage(driver);
        discountCode="GURU50";
    }


    @Test
    public void TC_01_Verify_Discount_Correct() {
//        shopingCartPage= productPage.AddProductToCart(driver,"Mobile");
//        shopingCartPage.inputDiscountCode(discountCode);
//      shopingCartPage.clickToApplyButton();
//      float price= shopingCartPage.getPriceOfProduct(driver,"Mobile");
//      float qty= shopingCartPage.getQtyOfProduct(driver,"Mobile");
//      float subTotal = price*qty;
//      float discount = subTotal*5/100;
//      float discountPrice= subTotal-discount;
//        Assert.assertEquals(shopingCartPage.getPriceAfterDiscount(),discountPrice);
    }

}
