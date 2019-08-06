package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MobilePage;

public class testeigth extends base{
	
	@Test
	public void dicountCoupons()  throws IOException{
		driver=initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		hp.mobileButton().click();
		
		MobilePage mp = new MobilePage(driver);
		mp.clickXperiaAddToCart().click();
		
		mp.enterCouponCode().sendKeys("GURU50");
		mp.clickApply().click();
		
		String dicounttext = mp.getDiscountText().getText();
		String actualtext = "-$5.00";
		
		Assert.assertEquals(dicounttext, actualtext);
		
		driver.close();
		
		
	}

}
