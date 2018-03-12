package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Navigation nav = driver.navigate();
		nav.to("https://amazon.in/");
		//driver.findElement(By.id("nav-link-shopall")).click();
		/*driver.findElement(By.partialLinkText("AbeBooks")).click();
		driver.findElement(By.id("hdr-nbc")).click();
		//driver.findElement(By.linkText("Photographs")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.id("hdr-nbc")).click();
		driver.findElement(By.className("col-sm-6")).click();*/
		driver.findElement(By.id("nav-link-yourAccount")).click();
		driver.findElement(By.id("ap_email")).sendKeys("xx@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("xx!");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("DSLR Camera");
		driver.findElement(By.cssSelector(".nav-input")).click();
		driver.findElement(By.partialLinkText("Canon EOS 1300D 18MP Digital SLR Camera (Black) with 18-55mm ISII Lens, 16GB Card and Carry Case")).click();
		//		driver.findElement(By.id("result_6")).click();
		//		driver.findElement(By.id("result_7")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Amazon Pay")).click();



	}
}