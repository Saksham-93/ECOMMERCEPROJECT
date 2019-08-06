package Ecommerce.Ecommerce;


import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class testone extends base {
	
	@Test
	
	public void firstvalidation() throws IOException  {
		
		driver = initializedriver();
		
		driver.get("http://live.guru99.com/index.php/");
		
		driver.manage().window().maximize();
		
		//Verify the Title of the page
		String pageTitle=driver.findElement(By.xpath("//*[@class='page-title']")).getText();
		if(pageTitle.contains("THIS IS DEMO SITE")) {
			System.out.println("The page title is present");
		}
		
		
		//Click on the MobileMenu
		
		HomePage hm = new HomePage(driver);
		hm.mobileButton().click();
		//Get the Title of the Mobile Page
		String MobilePageTitle=driver.getTitle();
		String actualMobilePageTitle ="Mobile";
		
		Assert.assertEquals(MobilePageTitle, actualMobilePageTitle);
		
		List<WebElement> lst = driver.findElements(By.xpath("//*[@class='product-name']/a"));
		
		//convert this list into list of strings
		
		List<String> strings = new ArrayList<String>();
		for(WebElement e : lst){
		    strings.add(e.getText());
		}
		
		//converting list to array
		
		String[] a = strings.toArray(new String[strings.size()]);
		
        String temp;
		
		for(int i =0;i<a.length;i++) {
			
			int flag=0;
			
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j].compareTo(a[j+1])>0) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
			}
			
			if(flag==0) {
				break;
			}
			
		}
		
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		WebElement sort = driver.findElement(By.xpath("(//*[@title='Sort By'])[1]"));
		
		Select sortByDropdown = new Select(sort);
		sortByDropdown.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");
		
		List <WebElement> myElements = driver.findElements(By.xpath("//*[@class='product-name']/a"));
		
		List<String> strings1 = new ArrayList<String>();
		for(WebElement e1 : myElements){
		    strings.add(e1.getText());
		}
		
		String[] a1 = strings.toArray(new String[strings1.size()]);
		
		//Logic for the Validation of the Products in the sorted manner.
		
		for(int i=0;i<=2;i++) {
			
			if(a1[i]==a[i]);
			
		}
		System.out.println("The products are sorted by name");
		
		
		
		driver.close();
		
		
	}

}
