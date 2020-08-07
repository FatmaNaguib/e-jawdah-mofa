package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	By XPath = By.xpath("//*[@id=\"UserName\"]");
	
	public void username(String username) {
		driver.findElement(XPath).sendKeys(username);
	}
	
	public String getusername() {
		String text =  driver.findElement(XPath).getText();
		return text;
	}

}
