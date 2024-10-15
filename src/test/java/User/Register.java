package User;


import PageObjects.User.AccountDashboardPageObject;
import PageObjects.User.HomePageObject;
import PageObjects.User.RegisterPageObject;
import commons.BaseTest;



import static org.testng.Assert.assertEquals;

import commons.PageGenerator;
import commons.Utils.DataMapper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register extends BaseTest {
	WebDriver driver;
	String firstName;
	String lastName;
	String emailAdress;
	String password;
	String confirmPassword ;
	String fullname;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private AccountDashboardPageObject accountDashboardPage;

	@Parameters({ "browserName", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		DataMapper data_Mapper;
		data_Mapper = DataMapper.getUseData();
		firstName=data_Mapper.getFirstName();
		lastName=data_Mapper.getLastName();
		password=data_Mapper.getPassword();
		emailAdress= getEmailRandom(data_Mapper.getEmail());
		confirmPassword=data_Mapper.getPassword();
		fullname=firstName+" "+lastName;
		homePage = PageGenerator.getHomePage(driver);
		homePage.clickToAccountLink();
		registerPage = PageGenerator.getRegisterPage(driver);
		registerPage.clickToHeader(driver, "Register");
	}

	@Test
	public void TC_01_Register_with_valid_data() {
		registerPage.inputToTextboxByLable(driver, "firstname", firstName);
		registerPage.inputToTextboxByLable(driver, "lastname", lastName);
		registerPage.inputToTextboxByLable(driver, "email_address", emailAdress);
		registerPage.inputToTextboxByLable(driver, "password", password);
		registerPage.inputToTextboxByLable(driver, "confirmation", confirmPassword);
		registerPage.clickToLoginButton();
		accountDashboardPage = PageGenerator.getMyDashboardPage(driver);
		Assert.assertEquals(accountDashboardPage.getMessageRegister(),
				"Thank you for registering with Main Website Store.");
		Assert.assertTrue(accountDashboardPage.isNameDisplay(fullname));
		Assert.assertTrue(accountDashboardPage.isEmailDisplay(emailAdress));

	}

}
