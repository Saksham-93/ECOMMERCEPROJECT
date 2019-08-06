package Ecommerce.Ecommerce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MobilePage;

public class testtwo extends base{
	
	@Test
	public void secondVlaidationTest() throws IOException{
		
		driver = initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		HomePage hm = new HomePage(driver);
		hm.mobileButton().click();
		
		String SonyXperiaPrice = driver.findElement(By.xpath("//*[@id='product-price-1']/span")).getText();
		
		MobilePage mp = new MobilePage(driver);
		mp.clickSonyXperia().click();
		
		//Validating that you are on SonyXperiaPage
		
		WebElement description = driver.findElement(By.xpath("(//*[@class='std'])[2]"));
		
		WebDriverWait wd = new WebDriverWait(driver, 5);
		wd.until(ExpectedConditions.visibilityOf(description));
		
		String descriptionpage=description.getText();
		
		if(descriptionpage.contains("this is Sony Xperia")) {
			
			System.out.println("You are on the Sony Xperia Detail Page");
		}
		
		String getProductValue = driver.findElement(By.xpath("(//*[@class='regular-price'])/span")).getText();
		
		// Validating that the Product Prize is Same on both Pages
		Assert.assertEquals(SonyXperiaPrice, getProductValue);
		
		driver.close();
		
	}

}
