package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MobilePage;
import pageObject.ShoppingCart;

public class testthree extends base{
	
	@Test
	public void thirdTestValidation() throws IOException {
		
        driver = initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hm = new HomePage(driver);
		hm.mobileButton().click();
		
		MobilePage mp = new MobilePage(driver);
		mp.clickXperiaAddToCart().click();
		
		ShoppingCart sc = new ShoppingCart(driver);
		
		WebDriverWait wd = new WebDriverWait(driver, 10);
		
		wd.until(ExpectedConditions.elementToBeClickable(sc.getQuantity()));
		
		sc.getQuantity().clear();
		sc.getQuantity().sendKeys("1000");
		
		sc.clickUpdateShoppingCart().click();
		
		String errorMessage=sc.getErrorMessage().getText();
		
		if(errorMessage.contains("The maximum quantity allowed for purchase is 500.")) {
			System.out.println("Correct Validation of ErrorMessage");
		}
		
		sc.clickEmptyCart().click();
		
		String EmptyCartText=sc.getemptyCartText().getText();
		
		String ActualEmptyCartText ="SHOPPING CART IS EMPTY";
		
		Assert.assertEquals(EmptyCartText, ActualEmptyCartText);
		
		driver.close();
		
		
	}

}
