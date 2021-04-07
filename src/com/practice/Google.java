package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	    driver.findElement(By.xpath("//div//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
	    
	List<WebElement> list= driver.findElements(By.xpath("//div[@class='aajZCb']//ul//li/descendant::div[@class='sbl1']/span[contains(text(),'java')]/b"));
	 
	System.out.println("Number of Elements"+" "+list.size());
	    
	    
	for (int i=0; i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("download"))
		{
			list.get(i).click();
			break;
		}
			
		
	}
	driver.close();
	
	    
	    
	}

	
}
