package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.UserLoginPage;

public class NewRegistarionTest {
	WebDriver driver;
	UserLoginPage userloginpage;

	@BeforeTest
	public void setup() {
		driver = BaseClass.driversetup("http://40.114.199.223/");
		userloginpage = new UserLoginPage(driver);

	}
	
	@Test
	private void clickregistration() {
		String z = userloginpage.clickregistrationbuttn();
		assertEquals(z, "تحديد نوع المستفيد");
		BaseClass.closedriver();
	}



	@AfterTest
	public void closedriver() {
		BaseClass.closedriver();
	}

}
