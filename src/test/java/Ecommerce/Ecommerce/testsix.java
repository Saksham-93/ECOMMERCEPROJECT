package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.TVHomepage;

public class testsix extends base {
	
	@Test
	public void sixthValidation() throws IOException {
		
		try {driver= initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount().click();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getEmailAddress().sendKeys("saksham.sahani@gmail.com");
		
		lp.getPassword().sendKeys("saksham@93");
		
	    hp.gettvButton().click();
	    
	    TVHomepage tp = new TVHomepage(driver);
	    
	    tp.clickLGCart().click();
	    
	    Select se = new Select(tp.selectCountry());
	    se.selectByValue("IN");
	    
	    tp.enterZipCode().sendKeys("411057");
	    
	    tp.clickEstimateButton().click();
	    
	    System.out.println(tp.getEstimateTable().getText());
	    
	    
	    tp.clickProceedToCheckOut().click();
	    
	    tp.clickContinueButton().click();
	    tp.clickContinueButton().click();
	    
	    tp.clickCheckMoneyOrderButton().click();
	    tp.clickContinueButton().click();
	    
	    System.out.println(tp.getCheckOutTable().getText());
	    
	    tp.clickPlaceOrder().click();
	    
	    System.out.println(tp.getOrderId());
	    }
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			driver.close();
		}
		
		
	    
		
		
	}
	
	

}
