package com.dkatlisLab.StepDefnition;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.dkatlisLab.Base.BaseClass;
import com.dkatlisLab.Pages.MidTransPillowPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditSuccessStepDef extends BaseClass{
	
	String EXPECTED_SUCCESS_MSG="Thank you for your purchase.";
	String EXPECTED_COLOR_CODE="#ff6167";
	public static WebDriver driver;
	
	MidTransPillowPage midTransPillowPage;
	
	public CreditSuccessStepDef()
	{
		driver =initialization();
		midTransPillowPage= new MidTransPillowPage();
	}


@Given("^open browser and launch url$")
public void open_browser_and_launch_url(){

	driver.get(prop.getProperty("url"));

   
}

@When("^I clicked on Buy now$")
public void i_clicked_on_Buy_now() throws Throwable {
	midTransPillowPage.buyNowButtonClick();

}

@Then("^I clicked on checkout button on Shopping Cart$")
public void i_clicked_on_checkout_button_on_Shopping_Cart() throws Throwable {
	midTransPillowPage.clickOnCheckout();
   
}

@Then("^I clicked on Continue button on Ordar Summary Page$")
public void i_clicked_on_Continue_button_on_Ordar_Summary_Page() throws Throwable {
	midTransPillowPage.clickOnContinue();
   
}

@Then("^On Payment Page select payment type as Credit Card$")
public void on_Payment_Page_select_payment_type_as_Credit_Card() throws Throwable {
	midTransPillowPage.selectCreditpayment();
    
}

@Then("^enter valid card number$")
public void enter_valid_card_number() throws Throwable {
	midTransPillowPage.enterCardNo().sendKeys(prop.getProperty("cardNumberForSuccessScenario"));

  
}

@Then("^enter valid expiry date$")
public void enter_valid_expiry_date() throws Throwable {
	midTransPillowPage.enterExpiryDate().sendKeys(prop.getProperty("expiry"));
  
}

@Then("^enter valid cvv$")
public void enter_valid_cvv() throws Throwable {
	midTransPillowPage.enterCVV().sendKeys(prop.getProperty("cvv"));
  
}

@Then("^click on Pay now button$")
public void click_on_Pay_now_button() throws Throwable {
    midTransPillowPage.clickonPayNowButton();
   
}

@Then("^enter valid password$")
public void enter_valid_password() throws Throwable {
    midTransPillowPage.enterOTPPassword().sendKeys(prop.getProperty("bankOTP"));
    

}

@Then("^click ok$")
public void click_ok() throws Throwable {
    midTransPillowPage.clickOkButton();
    
}


@Then("^close browser$")
public void close() throws Throwable {
   driver.close();
    
}

@SuppressWarnings("deprecation")
@Then("^verify successfull message$")
public void verify_successfull_message() throws Throwable {
    
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Thank you for your purchase.']")));
	driver.findElement(By.xpath("//span[text()='Thank you for your purchase.']")).isDisplayed();
	String actualMsg=driver.findElement(By.xpath("//span[text()='Thank you for your purchase.']")).getText();
	Assert.assertEquals(EXPECTED_SUCCESS_MSG, actualMsg);
 
}



@Then("^enter card number for negative scenario$")
public void enter_card_number_for_negative_scenario() throws Throwable {
	midTransPillowPage.enterCardNo().sendKeys(prop.getProperty("cardNumberforNegativeScenario"));

}

@SuppressWarnings("deprecation")
@Then("^enter invalid expiry date$")
public void enter_invalid_expiry_date() throws Throwable {
	midTransPillowPage.enterExpiryDate().sendKeys(prop.getProperty("invalidExpiry"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/label")));
	String color = driver.findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/label")).getCssValue("color");
	String hexcolorCode=Color.fromString(color).asHex();
	Assert.assertEquals(EXPECTED_COLOR_CODE, hexcolorCode);
		

}




	
	

}
