package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeTest
	public void setup() {
		

		 driver =  BaseClass.driversetup("http://40.114.199.223/main/login/ad");
		 loginpage = new LoginPage(driver);
	}
	

	 @Test
	 public void checktest() {
		
		loginpage.username("admin");
		loginpage.password("A123");
		loginpage.cliklogin();
		String y = loginpage.otptext();
		Assert.assertEquals(y, "التحقق");
		 	 }
}
