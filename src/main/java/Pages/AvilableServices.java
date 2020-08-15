package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AvilableServices {
	
	WebDriver driver;
	String visaid = "6471e6d2-f379-42d4-a372-f05a5306ddc6";
	
	public AvilableServices (WebDriver ldriver) {
		this.driver = ldriver;
	}
	By vissastabxpath = By.xpath("//a[@href=\"#accordion1\"]");
	By visalink = By.xpath("//a[@href=\"/VisaProcessing/RequestFlow/Start?visaId="+ visaid +"\"]") ;
	
	public void selectvisa() {
		 driver.findElement(vissastabxpath).click();
		 driver.findElement(visalink).click();
	}

}
