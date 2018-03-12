package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Navigation nav = driver.navigate();
		nav.to("https://amazon.in/");
		driver.findElement(By.id("nav-link-yourAccount")).click();
		driver.findElement(By.id("ap_email")).sendKeys("xx@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("xxx");
		driver.findElement(By.id("signInSubmit")).click();
	}
}