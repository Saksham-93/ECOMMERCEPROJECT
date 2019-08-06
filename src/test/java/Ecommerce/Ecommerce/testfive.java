package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MobilePage;
import pageObject.RegisterPage;
import pageObject.ShoppingCart;

public class testfive extends base {
	
	@Test
	public void fifthValidationTest() throws IOException {
		
		try {
			
		driver=initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hm = new HomePage(driver);
		hm.clickMyAccount().click();
		
		System.out.println(driver.getTitle());
		
		hm.clickCreateAccount().click();
		
		RegisterPage rp = new RegisterPage(driver);
		
		rp.getFirstName().sendKeys("Saksham2");
		
		rp.getLastName().sendKeys("Sahani2");
		
		rp.getEmailAddress().sendKeys("saksham.sahani2@gmail.com");
		
		rp.getPassword().sendKeys("saksham@93");
		
		rp.getConfirmPassword().sendKeys("saksham@93");
		
		rp.clickRegisterButton().click();
		
		rp.getConfirmPage().isDisplayed();
		
		hm.gettvButton().click();
		
		MobilePage mp = new MobilePage(driver);
		
		mp.clickAddtoWishlistLG().click();
		
	    ShoppingCart sc = new ShoppingCart(driver);
	    sc.clickHereButton().click();
		mp.clickAddToWishlistSamsung().click();
		
		sc.clickShareWishList().click();
		
		sc.getShareEmailAddress().sendKeys("saksham.sahani@gmail.com");
		sc.clickShareWishList().click();
		
		sc.getconfirmWishListPage().isDisplayed();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally
		{
			
		driver.close();
		}
	}

}
