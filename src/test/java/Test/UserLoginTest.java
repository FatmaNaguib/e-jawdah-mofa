package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Base.BaseClass;
import Pages.AvilableServices;
import Pages.UserLoginPage;
import Pages.UserOtpPage;

public class UserLoginTest {

	WebDriver driver;
	UserLoginPage userloginpage;
	UserOtpPage UserOtpPage;
	AvilableServices AvilableServices;

	@BeforeTest
	public void setup() {
		driver = BaseClass.driversetup("http://40.114.199.223/");
		userloginpage = new UserLoginPage(driver);
		UserOtpPage = new UserOtpPage(driver);
		AvilableServices = new AvilableServices(driver);
	}

	@Test(priority = 0)
//	@Parameters({"UserName","Password"})
	public void userlogin() {
		String y = userloginpage.userlogin("industrial_fund@gmail.com","A123");	
		AssertJUnit.assertEquals(y, "التحقق");

	}

	@Test(priority = 1)
	public void clickContinuebtn() {
		UserOtpPage.Continuebtn();
	}

	@Test(priority = 2)
	public void selectvisa() {
		AvilableServices.selectvisa();
	}

	@AfterTest
	public void closedriver() {
		BaseClass.closedriver();
	}
	 
}
