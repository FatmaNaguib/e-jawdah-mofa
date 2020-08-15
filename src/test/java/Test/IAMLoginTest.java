package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.UserLoginPage;

public class IAMLoginTest {
	WebDriver driver;
	UserLoginPage userloginpage;
	
	@BeforeTest
	public void setup() {
		driver = BaseClass.driversetup("http://40.114.199.223/");
		userloginpage = new UserLoginPage(driver);
		
	}
	

	@Test
	private void clickiambtton() {
		//userloginpage.iambuttonclick();
		String x = userloginpage.iambuttonclick();
		assertEquals(x, "اسم المستخدم و كلمة المرور");
	}
	
	
	@AfterTest
	public void closedriver() {
		BaseClass.closedriver();
	}


}
