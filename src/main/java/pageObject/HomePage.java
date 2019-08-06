package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By mobileMenuButton = By.xpath("//a[text()='Mobile']");
	
	By MyAccount = By.xpath("(//*[@title='My Account'])[2]");
	
	By CreateAccount = By.xpath("//a[@title='Create an Account']");
	
	By TVButton = By.xpath("//a[text()='TV']");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement mobileButton() {
		
		return driver.findElement(mobileMenuButton);
	}
	
	public WebElement clickMyAccount() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement clickCreateAccount() {
		return driver.findElement(CreateAccount);
	}
	
	public WebElement gettvButton() {
		return driver.findElement(TVButton);
	}

}
