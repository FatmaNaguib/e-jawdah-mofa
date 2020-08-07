package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginPageTest {
	
	//WebDriver driver;
	
	/*@BeforeTest
	public void setup() {
		
		BaseClass BC = new BaseClass();
		driver= BC.driversetup("http://40.114.199.223/");
	}*/

	 @Test
	 public void checktest() {
		WebDriver driver =  BaseClass.driversetup("http://40.114.199.223/");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.username("admin");
		String x =  loginpage.getusername();
		System.out.println(x);
		//Assert.assertEquals(x, "admin");
		 
	
		
	 }
}
