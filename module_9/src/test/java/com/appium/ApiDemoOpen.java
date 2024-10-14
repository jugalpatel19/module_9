package com.appium;

/*
 * 1) Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator
 */

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class ApiDemoOpen {
	public AndroidDriver driver;
@Test
	
	public void test() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("jugal");
	options.setApp("D:\\appium\\apk file\\apidemos-debug.apk");
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 Thread.sleep(2000);
	 driver.quit();
	 


}
}

	
