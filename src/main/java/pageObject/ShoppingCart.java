package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
	
	public WebDriver driver;
	
	By quantity = By.xpath("//*[@title='Qty']");
	
	By updateShoppingCart = By.xpath("(//button[@title='Update Shopping Cart'])[2]");
	
	By errorMessage = By.xpath("//*[@class='item-msg error']");
	
	By emptyCart = By.xpath("//*[@title='Empty Cart']");
	
	By emptyCartValidation = By.xpath("//*[@class='page-title']/h1");
	
	By clickHereButton = By.xpath("//a[text()='here']");
	
	By clickShareWishList = By.xpath("//*[@title='Share Wishlist']/span");
	
	By shareEmailAddress = By.xpath("//*[@id='email_address']");
	
	By ConfirmWishListShared = By.xpath("//*[text()='Your Wishlist has been shared.']");
	
	public ShoppingCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getQuantity() {
		
		return driver.findElement(quantity);
	}
	
	public WebElement clickUpdateShoppingCart() {
		return driver.findElement(updateShoppingCart);
	}
	
	public WebElement getErrorMessage() {
		return driver.findElement(errorMessage);
	}
	
	public WebElement clickEmptyCart() {
		return driver.findElement(emptyCart);
	}
	
	public WebElement getemptyCartText() {
		return driver.findElement(emptyCartValidation);
	}
	
	public WebElement clickHereButton() {
		return driver.findElement(clickHereButton);
	}
	
	public WebElement clickShareWishList() {
		return driver.findElement(clickShareWishList);
	}
	
	public WebElement getShareEmailAddress() {
		return driver.findElement(shareEmailAddress);
	}
	public WebElement getconfirmWishListPage() {
		return driver.findElement(ConfirmWishListShared);
	}

}
