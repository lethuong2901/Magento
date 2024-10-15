package User;
import PageObjects.User.AccountDashboardPageObject;
import PageObjects.User.HomePageObject;
import PageObjects.User.LoginPageObject;
import commons.BaseTest;

import static org.testng.Assert.assertEquals;

import commons.PageGenerator;
import commons.Utils.DataMapper;
import commons.Utils.ReadExelOneRow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    WebDriver driver;
    private HomePageObject homePage;
    private LoginPageObject loginPage;
    DataMapper dataMapper;
    String email;
    String password;
    String firstName;
    String lastName;
    String fullName;
    private AccountDashboardPageObject accountDashboardPage;
    ReadExelOneRow readExelOneRow;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void BeforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        dataMapper= DataMapper.getUseData();
        readExelOneRow =ReadExelOneRow.getExcelData();
        readExelOneRow.switchToSheet("User");
        homePage = PageGenerator.getHomePage(driver);
        homePage.clickToAccountLink();
        loginPage = PageGenerator.getLoginPage(driver);
        loginPage.clickToHeader(driver, "Log In");
        //With Json file
//        email= dataMapper.getEmail();
//        password= dataMapper.getPassword();
//        firstName=dataMapper.getFirstName();
//        lastName=dataMapper.getLastName();
//        fullName= firstName+" "+lastName;

        //With Excel file
        email= readExelOneRow.getCellData("User",1);
        password= readExelOneRow.getCellData("Password",1);
        firstName=dataMapper.getFirstName();
        lastName=dataMapper.getLastName();
        fullName= firstName+" "+lastName;
    }

   // @Test(dataProvider = "loginData", dataProviderClass = ReadExcel.class)
    public void TC_01_Login_Successful(String email, String password) {

    	loginPage.inputToEmailAdress(email);
        System.out.print("Email"+email);
    	loginPage.inputToPassword(password);
    	loginPage.clickToLoginButton();
        sleepInSecond(3);
    }

//    @Test
    public void TC_02_Login_Successful() {
        loginPage.inputToEmailAdress(email);
        System.out.print("Email"+email);
        loginPage.inputToPassword(password);
        loginPage.clickToLoginButton();
        accountDashboardPage= PageGenerator.getMyDashboardPage(driver);
        Assert.assertTrue(accountDashboardPage.isTitleMyDashboardDisplay());
        Assert.assertEquals(accountDashboardPage.getTextAccountInfo(),"Hello, "+fullName+"!");
    }

    @Test
    public void TC_03_Login_Successful() {
        loginPage.inputToEmailAdress(email);
        System.out.print("Email"+email);
        loginPage.inputToPassword(password);
        loginPage.clickToLoginButton();
        accountDashboardPage= PageGenerator.getMyDashboardPage(driver);
        Assert.assertTrue(accountDashboardPage.isTitleMyDashboardDisplay());
        Assert.assertEquals(accountDashboardPage.getTextAccountInfo(),"Hello, "+fullName+"!");
    }
	
}
