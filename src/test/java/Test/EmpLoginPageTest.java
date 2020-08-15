package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.BaseClass;
import Pages.EmpLoginPage;

public class EmpLoginPageTest {
	
	WebDriver driver;
	EmpLoginPage loginpage;
	
	@BeforeTest
	public void setup() {
		
		 driver =  BaseClass.driversetup("http://40.114.199.223/main/login/ad");
		 loginpage = new EmpLoginPage(driver);
	}
	
	 @Test
	 public void checktest() {
		
		loginpage.emplogin("admin","A123");
		String y = loginpage.otptext();
		Assert.assertEquals(y, "التحقق");
		 	 }
}
