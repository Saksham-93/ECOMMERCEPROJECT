package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Loginemail = By.xpath("//*[@name='login[username]']");
	
	By password = By.xpath("//*[@name='login[password]']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getEmailAddress() {
		
		return driver.findElement(Loginemail);
	}
	
	public WebElement getPassword() {
		
		return driver.findElement(password);
	}

}
