package Admin;

import PageObjects.Admin.CustomerPageObject;
import PageObjects.Admin.LoginPageObject;
import User.Login;
import User.Register;
import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import commons.Utils.DataMapper;
import commons.Utils.ReadExelOneRow;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPageObject;
    private CustomerPageObject customerPage;
    private String username;
    private String password;
    private String email;
    private DataMapper dataMapper;


    @Parameters({"browserName", "urlAdmin"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        username = GlobalConstant.Username_Admin;
        password = GlobalConstant.Password_Admin;
        dataMapper = DataMapper.getUseData();
        email= dataMapper.getEmail();
        loginPageObject = PageGenerator.getLoginPageAdmin(driver);
        loginPageObject.inputToUsername(username);
        loginPageObject.inputToPassword(password);
        loginPageObject.clickToButton();
        loginPageObject.clickToCloseButton();
    }

    @Test
    public void TC_01_VerifyCreateNewAccount() {
        customerPage= PageGenerator.getCustomer(driver);
        customerPage.inputToSearchByEmail(email);
        customerPage.clickToSearchButton();
    }
}
