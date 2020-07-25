package org.test.flipkart;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Sample {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J7(2016");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(u, cap);
		Thread.sleep(4000);
		MobileElement con = driver.findElement(By.xpath("//*[@text='CONTINUE']"));
	con.click();
	Thread.sleep(6000);
	MobileElement close = driver.findElement(By.id("com.flipkart.android:id/custom_back_icon"));
	close.click();
	Thread.sleep(4000);
	MobileElement search = driver.findElement(By.xpath("//*[@resource-id='com.flipkart.android:id/search_widget_textbox']"));
	search.click();
	Thread.sleep(4000);
	MobileElement searchtxt = driver.findElement(By.xpath("//*[@text='Search for Products, Brands and More']"));
	searchtxt.sendKeys("iphone");
	Thread.sleep(4000);
	MobileElement findproduct = driver.findElement(By.xpath("//*[@text='iphone 11']"));
	findproduct.click();
	Thread.sleep(4000);
	MobileElement notallow = driver.findElement(By.xpath("//*[@text='NOT NOW']"));
	notallow.click();
	Thread.sleep(4000);
	MobileElement selectproduct = driver.findElement(By.xpath("//*[@text='Apple iPhone 11 (Black, 128 GB)']"));
	selectproduct.click();
	
	
	
	
	
	
	
	
	
	
	}

}
