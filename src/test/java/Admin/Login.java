package Admin;

import PageObjects.Admin.LoginPageObject;
import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import commons.Utils.DataMapper;
import commons.Utils.ReadExelOneRow;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    WebDriver driver;
private LoginPageObject loginPageObject;
private String username;
private String password;
    @Parameters({"browserName", "url"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        username = GlobalConstant.Username_Admin;
        password= GlobalConstant.Password_Admin;
        loginPageObject= PageGenerator.getLoginPageAdmin(driver);
    }

    @Test
    public void TC_01_Login_Successfull(){
loginPageObject.inputToUsername(username);
loginPageObject.inputToPassword(password);
loginPageObject.clickToButton();
    }
}
