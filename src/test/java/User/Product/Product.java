package User.Product;
import PageObjects.*;
import commons.BaseTest;

import static org.testng.Assert.assertEquals;

import commons.PageGenerator;
import commons.Utils.DataMapper;
import commons.Utils.ReadExcel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Product extends BaseTest {
    WebDriver driver;
    private HomePageObject homePage;
    private ProductPageObject productPage;
    private ProductDetailPageObject productDetailPage;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
       driver= getBrowserDriver(browserName, url);
       homePage= PageGenerator.getHomePage(driver);
       homePage.clickToCategoryLink(driver,"Mobile");
       productPage= PageGenerator.getProductPage(driver);
    }


    @Test
    public void TC_01_Verify_Price_Equal() {
        String priceAtProduct= productPage.getPriceOfProduct("IPhone");
      productDetailPage=productPage.clickToProductName(driver,"IPhone");
      Assert.assertEquals(priceAtProduct,productDetailPage.getPriceOfProduct());
    }

}
