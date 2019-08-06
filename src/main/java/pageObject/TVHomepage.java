package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TVHomepage {
	
	public WebDriver driver;
	
	By LGLCDAddtoCart = By.xpath("(//*[@title='Add to Cart']/span)[1]");
	
	By EstimateButton = By.xpath("//*[@title='Estimate']/span");
	
	By EstimateTable = By.xpath("//*[@id='shopping-cart-totals-table']");
	
	By ProceedToCheckOut = By.xpath("(//*[@title='Proceed to Checkout'])[1]");
	
	By ContinueButton = By.xpath("(//*[@title='Continue'])[1]");
	
	By CheckMoneyOrderButton = By.xpath("//*[@id='p_method_checkmo']");
	
	By CheckOutTable = By.xpath("//*[@id='checkout-review-table']");
	
	By PlaceOrder = By.xpath("//*[@title='Place Order']");
	
	By OrderId = By.xpath("//*[@class='col-main']//p/a[1]");
	
	By StateProvince = By.xpath("(//*[@title='State/Province'])[1]");
	
	By ZipCode = By.xpath("//*[@id='postcode']");
	
	By Country = By.xpath("//*[@id='country']");
	
	By MyOrders = By.xpath("//a[text()='My Orders']");
	
	By ViewOrder = By.xpath("(//a[text()='View Order'])[1]");
	
	By PrintOrder = By.xpath("(//a[@class='link-print'])[1]");
	
	public TVHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement clickLGCart(){
		return driver.findElement(LGLCDAddtoCart);
	}
	
	public WebElement clickEstimateButton() {
		return driver.findElement(EstimateButton);
	}
	
	public WebElement getEstimateTable() {
		return driver.findElement(EstimateTable);
	}
	
	public WebElement clickProceedToCheckOut() {
		return driver.findElement(ProceedToCheckOut);
	}
	
	public WebElement clickContinueButton() {
		return driver.findElement(ContinueButton);
	}
	
	public WebElement clickCheckMoneyOrderButton() {
		return driver.findElement(CheckMoneyOrderButton);
	}
	public WebElement getCheckOutTable() {
		return driver.findElement(CheckOutTable);
	}
	public WebElement clickPlaceOrder() {
		return driver.findElement(PlaceOrder);
	}
	public WebElement getOrderId() {
		return driver.findElement(OrderId);
	}
	
	public WebElement selectProvince() {
		return driver.findElement(StateProvince);
	}
	
	public WebElement enterZipCode() {
		return driver.findElement(ZipCode);
	}
    public WebElement selectCountry() {
    	return driver.findElement(Country);
    }
    
    public WebElement clickMyOrders() {
    	
    	return driver.findElement(MyOrders);
    	
    }
    public WebElement clickViewOrder() {
    	return driver.findElement(ViewOrder);
    }
    
    public WebElement clickPrintOrder() {
    	return driver.findElement(PrintOrder);
    }
}
