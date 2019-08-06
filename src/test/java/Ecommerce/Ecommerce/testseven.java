package Ecommerce.Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.TVHomepage;

public class testseven extends base {
	
	@Test
	public void seventhValidation() throws IOException {
		
		
         driver= initializedriver();
		
        driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount().click();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getEmailAddress().sendKeys("saksham.sahani@gmail.com");
		
		lp.getPassword().sendKeys("saksham@93");
		
		driver.findElement(By.xpath("//*[@title='Login']")).click();
		
		TVHomepage tp = new TVHomepage(driver);
		
		tp.clickMyOrders().click();
		
		tp.clickViewOrder().click();
		
		tp.clickPrintOrder().click();
		
		driver.quit();
		
		
		
		
	}

}
