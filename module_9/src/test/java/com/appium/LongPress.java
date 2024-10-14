package com.appium;

import static org.testng.Assert.assertEquals;

import java.lang.annotation.ElementType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
public class LongPress extends RealDvice {
	
	@Test
	public void press() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(3000);
		
		
		WebElement e1= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPress(e1);
		Thread.sleep(2000);
		
		String msg=driver.findElement(By.id("android:id/title")).getText();
		assertEquals(msg, "Sample menu");
		
	}


	}
