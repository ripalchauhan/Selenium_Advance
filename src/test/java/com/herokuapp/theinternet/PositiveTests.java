package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class PositiveTests {
	@Test
	public void loginTest() {
		System.out.println("Starting Login test");
		
		//Create Driver
		System.setProperty("webdriver.chrome.driver","F:\\driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open main page
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		System.out.println("Main page is Opened.");
		
		//Click on Form Authentication link
		//driver.findElement(By.id("username")).sendKeys("tosmith");
		
		Assert.assertEquals(url,"https://the-internet.herokuapp.com/", "Match the result");
	}
}
