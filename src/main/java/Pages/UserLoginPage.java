package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPage {

	public WebDriver driver;

	public UserLoginPage( WebDriver ldrive) {

		this.driver = ldrive;
	}

	By userid = By.id("UserName");
	By passid = By.id("Password");
	By loginxpath = By.xpath("//button[@class=\"btn btn-primary btn-cons m-t-10\"]");
	By otpxpath = By.xpath("//h4[@class=\"panel-title\"]");
	By newregistrstionbutnxpath = By.xpath("//a[@class=\"btn btn-success btn-cons m-t-10 pull-right\"]"); 
	By registratiotitlenxpath = By.xpath("//h4[@class=\"panel-title\"]");
	By iamxpath = By.xpath("//a[@href=\"/Main/Login/IAM\"]");
	By iamtitle = By.xpath("//span[@class=\"step-text\"]");

	public String userlogin(String username, String password) {

		driver.findElement(userid).sendKeys(username);
		driver.findElement(passid).sendKeys(password);
		driver.findElement(loginxpath).click();
		return driver.findElement(otpxpath).getText();

	}


	public String clickregistrationbuttn(){
		driver.findElement(newregistrstionbutnxpath).click();
		return driver.findElement(registratiotitlenxpath).getText();

	}


	public String iambuttonclick() {
		driver.findElement(iamxpath).click();
		return driver.findElement(iamtitle).getText();
	}

}


