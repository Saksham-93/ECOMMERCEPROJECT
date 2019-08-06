package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MobilePage {
	
	public WebDriver driver;
	
	By SonyXperia = By.xpath("//a[@title='Xperia']");
	
	By XperiaAddToCart = By.xpath("(//*[@title='Add to Cart'])[1]");
	
	By XperiaAddToCartCompare = By.xpath("(//*[@class='link-compare'])[1]");
	
	By IPhoneAddToCompare = By.xpath("(//*[@class='link-compare'])[2]");
	
	By Compare = By.xpath("//button[@title='Compare']/span");
	
	By ClearAll = By.xpath("//a[text()='Clear All']");
	
	By AddtoWishListLG = By.xpath("(//a[@class='link-wishlist'])[1]");
	
	By AddtoWishListSamsung = By.xpath("(//a[@class='link-wishlist'])[2]");
	
	By CouponCode = By.xpath("//*[@id='coupon_code']");
	
	By Apply = By.xpath("//*[@title='Apply']");
	
	By DiscountText =By.xpath("//*[text()='-$5.00']");
	
	
	public MobilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement clickSonyXperia() {
		
		return driver.findElement(SonyXperia);
	}
	
	public WebElement clickXperiaAddToCart() {
		return driver.findElement(XperiaAddToCart);
	}
	
	public WebElement clickXperiaAddtoCartCompare() {
		return driver.findElement(XperiaAddToCartCompare);
	}
	public WebElement clickIphoneAddToCompare() {
		return driver.findElement(IPhoneAddToCompare);
	}
	
	public WebElement clickCompare() {
		return driver.findElement(Compare);
	}
	
	public WebElement clickClearAll() {
		return driver.findElement(ClearAll);
	}
	
	public WebElement clickAddtoWishlistLG() {
		return driver.findElement(AddtoWishListLG);
	}
	
	public WebElement clickAddToWishlistSamsung() {
		return driver.findElement(AddtoWishListSamsung);
	}
	public WebElement enterCouponCode() {
		return driver.findElement(CouponCode);
	}
	public WebElement clickApply() {
		return driver.findElement(Apply);
	}
	public WebElement getDiscountText() {
		return driver.findElement(DiscountText);
	}

}
