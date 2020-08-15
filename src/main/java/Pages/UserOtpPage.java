package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserOtpPage {
	
	WebDriver driver;
	
	public  UserOtpPage( WebDriver ldrive) {
		this.driver = ldrive;
		
	}

	By Continuebtnid = By.id("btnContinue");

	
	public void Continuebtn() {
		
		driver.findElement(Continuebtnid).click();
	}
} 
