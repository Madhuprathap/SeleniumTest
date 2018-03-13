package org.demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Flipkart {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			Navigation nav = driver.navigate();
			nav.to("https://flipkart.com/");
			//driver.findElement(By.cssSelector("._2AkmmA _29YdH8")).click();
			driver.findElement(By.linkText("Electronics")).click();
			driver.findElement(By.partialLinkText("Cam")).click();
			driver.close();
		}
}
