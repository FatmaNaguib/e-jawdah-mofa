package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmpLoginPage {
	
	WebDriver driver;
	
	public EmpLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	By userid = By.id("UserName");
	By passid = By.id("Password");
	By loginxpath =  By.xpath("//button[@class =\'btn btn-primary btn-cons m-t-10\']");
	By otpxpath = By.xpath("//h4[@class=\'panel-title\']");
	
	public void emplogin(String username, String password) {
		driver.findElement(userid).sendKeys(username);
		driver.findElement(passid).sendKeys(password);
		driver.findElement(loginxpath).click();
	}
	
	public String otptext() {
		return driver.findElement(otpxpath).getText();
		
	} 
	
	public String getlogintext() {
		 return driver.findElement(loginxpath).getText();
	}

}
