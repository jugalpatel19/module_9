package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalculatorOperation {
	@Test
	
	public void openCalc() throws MalformedURLException, InterruptedException {
	
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setCapability("deviceName", "One Plus HD1901");
	cap.setCapability("udid","03d42106");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "12.0");
	cap.setCapability( "appPackage","com.oneplus.calculator");
	cap.setCapability("appActivity","com.oneplus.calculator.Calculator");
	cap.setCapability("automationName", "UIAutomator2");
	
	URL url=new URL("http://127.0.0.1:4723/");
	
	AppiumDriver driver=new AppiumDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_1")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	Thread.sleep(2000);
	
	String msgString= driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	Thread.sleep(2000);
	
	System.out.println("msg is "+msgString);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/op_mul")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	Thread.sleep(2000);
	
	String msgString1= driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	Thread.sleep(2000);
	
	System.out.println("msg is "+msgString1);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_9")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_0")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/op_sub")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_0")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	Thread.sleep(2000);
	
	String msgString2= driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	Thread.sleep(2000);
	
	System.out.println("msg is "+msgString2);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_9")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_0")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/op_div")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_0")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	Thread.sleep(2000);
	
	String msgString3= driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	Thread.sleep(2000);
	
	
	
	System.out.println("msg is "+msgString3);

}


}
