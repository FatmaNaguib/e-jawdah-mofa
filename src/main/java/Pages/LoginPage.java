package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	By XPath = By.xpath("//input[@id=\"UserName\"]");
	By passxpath = By.xpath("//input[@id=\"Password\"]");
	By loginxpath =  By.xpath("//button[@class =\'btn btn-primary btn-cons m-t-10\']");
	By otpxpath = By.xpath("//h4[@class=\'panel-title\']");
	
	public void username(String username) {
		driver.findElement(XPath).sendKeys(username);
	}
	
	public void password(String password) {
		driver.findElement(passxpath).sendKeys(password);
	}
	
	public void cliklogin() {
		driver.findElement(loginxpath).click();
		
	}
	
	public String otptext() {
		return driver.findElement(otpxpath).getText();
		
	} 
	
	public String getlogintext() {
		 return driver.findElement(loginxpath).getText();
	}

}
