package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MobilePage;

public class testfour extends base {
	
	@Test
	public void fourthValidationTest() throws IOException {
		
        driver = initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hm = new HomePage(driver);
		hm.mobileButton().click();
		
		MobilePage mp = new MobilePage(driver);
		mp.clickXperiaAddtoCartCompare().click();
		mp.clickIphoneAddToCompare().click();
		
		mp.clickCompare().click();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		
		String parentWindow=it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		
		
		//Validation of Child Window
		String childText = driver.findElement(By.xpath("//*[@class='page-title title-buttons']/h1")).getText();
		String actualText = "COMPARE PRODUCTS";
		
		Assert.assertEquals(childText, actualText);
		
		driver.findElement(By.xpath("//*[@title='Close Window']/span")).click();
		
		driver.switchTo().window(parentWindow);
		
		mp.clickClearAll().click();
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}

}
