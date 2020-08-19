package com.dkatlisLab.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class BaseClass extends Reporter{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;

	
	
	
	public static Properties prop;
	
	public BaseClass()
	{

		try 
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/dkatlisLab/config/config.properties");
			prop.load(ip);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	 public  WebDriver initialization() {
		 
		 
		 String browserValue= prop.getProperty("browser");
		 
		 if(browserValue.equalsIgnoreCase("firefox"))
		 {
				String filePathfirefox = System.getProperty("user.dir") + "//src//Driver//geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", filePathfirefox );
				driver = new FirefoxDriver(); 
			 
		 }
		 
		 else if(browserValue.equalsIgnoreCase("chrome"))
		 {
			String filePathchrome = System.getProperty("user.dir") + "//src//Driver//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", filePathchrome );
			driver = new ChromeDriver(); 
			
	     }


			wait = new WebDriverWait(driver, 30);
			System.out.println("Before maximize");
			driver.manage().window().maximize();
			System.out.println("After maximize");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 return driver;
		 



	}


}
