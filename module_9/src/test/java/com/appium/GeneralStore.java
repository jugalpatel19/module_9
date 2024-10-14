package com.appium;
/*
 * 3) Write an Appium Program to connect with emulator wit ecommerce based application using
Generalstore.app to perform locators like name, dropdown etc
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GeneralStore {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@Test
	public void before() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("jugal");
		options.setApp("D:\\appium\\apk file\\General-Store.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		 Thread.sleep(2000);
	
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
					+ "/android.widget.LinearLayout/android.widget.FrameLayout"
					+ "/android.view.ViewGroup/android.widget.RelativeLayout/"
					+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("jugal");
		      Thread.sleep(2000);
				
//		   	driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
//		   	Thread.sleep(2000);
//				
//			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//			Thread.sleep(2000);
//				
//		    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
//			+".scrollIntoView(text(\"Bahamas\"));")).click();
//		    	Thread.sleep(2000);
//		    	
//		    	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		    	Thread.sleep(2000);
//		    	
//		    	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
//		    	Thread.sleep(2000);
//		    	
//		    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
//		    			+".scrollIntoView(text(\"Air Jordan 9 Retro\"));")).click();
//		    		    	Thread.sleep(2000);
//		    		    	
//		    	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
//		    	Thread.sleep(2000);
//		    	
//		    	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		    	Thread.sleep(2000);
//		    	
		    	
		    	
		    	
		}

}


