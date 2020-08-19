package com.dkatlisLab.Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.dkatlisLab.Base.BaseClass;

public class  MidTransPillowPage extends BaseClass {
	
	WebElement element= null;

	
	
	@FindBy(id="inputPassword")
	public WebElement pwd;

	public void buyNowButtonClick()
	{
		//buyNowButton.click();
		driver.findElement(By.xpath("//a[text()='BUY NOW']")).click();
				//signIn.click();
	}
	
	public void clickOnCheckout()
	{
		driver.findElement(By.xpath("//div[text()='CHECKOUT']")).click();
				
	}
	public void clickOnContinue() throws InterruptedException
	{
		WebElement iframeElement= driver.findElement(By.id("snap-midtrans"));
		driver.switchTo().frame(iframeElement);
		
		WebElement continueButton= driver.findElement(By.xpath("//div/span[text()='Continue']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", continueButton);
		driver.switchTo().defaultContent();
	

	}
	
	public void selectCreditpayment() throws InterruptedException
	{
		

		WebElement iframeElement= driver.findElement(By.id("snap-midtrans"));
		driver.switchTo().frame(iframeElement);
		//Thread.sleep(5000);
		WebElement credtCardSelect=driver.findElement(By.xpath("//*[@id='payment-list']/div[1]/a/div[2]/div[1]"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", credtCardSelect);
		
	}
	
	public WebElement enterCardNo()
	{
		return driver.findElement(By.name("cardnumber"));
	}
	
	public WebElement enterExpiryDate()
	{
		return driver.findElement(By.xpath("//div[@class='input-group col-xs-7']//input"));
		
	
	}
	
	public WebElement enterCVV()
	{
		return driver.findElement(By.xpath("//div[@class='input-group col-xs-5']//input"));
	}
	
	public void clickonPayNowButton() throws InterruptedException{
	WebElement payNow= driver.findElement(By.xpath("//div[@class='text-button-main']"));
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", payNow);
	}
	
	public WebElement enterOTPPassword()
	{

		 WebElement iframeElement= driver.findElement(By.xpath("//div[@class='main-container']/div/iframe"));
		 driver.switchTo().frame(iframeElement);
		 return driver.findElement(By.xpath("//input[@type='password']"));
	
	
	}
	
	public void clickOkButton()
	{
		WebElement okButton=driver.findElement(By.xpath("//button[text()='OK']"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", okButton);
			driver.switchTo().defaultContent();
	
	}
	
	
	
	
	



}
