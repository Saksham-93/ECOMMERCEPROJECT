package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage  {
	
	public WebDriver driver;
	
	By FirstName = By.xpath("//*[@id='firstname']");
	
	By LastName = By.xpath("//*[@id='lastname']");
	
	By EmailAddress = By.xpath("//*[@id='email_address']");
	
	By Password = By.xpath("//*[@id='password']");
	
	By ConfirmPassword = By.xpath("//*[@id='confirmation']");
	
	By RegisterButton = By.xpath("//*[@title='Register']/span");
	
	By ConfirmPage = By.xpath("//*[text()='Thank you for registering with Main Website Store.']");
	
	
	
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(FirstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(LastName);
	}
	
	public WebElement getEmailAddress() {
		return driver.findElement(EmailAddress);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getConfirmPassword() {
		return driver.findElement(ConfirmPassword);
	}
	public WebElement clickRegisterButton() {
		return driver.findElement(RegisterButton);
	}
	public WebElement getConfirmPage() {
		return driver.findElement(ConfirmPage);
	}
	
	

}
