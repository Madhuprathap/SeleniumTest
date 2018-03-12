package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("https://flipkart.com/");
		/*WebElement unObj = driver.findElement(By.cssSelector("a._2k0gmP"));
		unObj.click();*/
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.className("_2zrpKA")).sendKeys("xx.com");
		//		driver.findElement(By.id("continue")).click();
		driver.findElement(By.cssSelector("[type=password]")).sendKeys("xx$xx");
		driver.findElement(By.cssSelector("button[type=submit]")).submit();
	}

}
