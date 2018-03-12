package org.demo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSiteAddToCart {
	static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "D:/Personal/workspace/SeleniumLib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,  TimeUnit.SECONDS);
	}
	
	private static void waitForLoad() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			driver.navigate().to("http://www.amazon.in/");
			driver.manage().window().maximize();
			
			waitForLoad();
			driver.findElement(By.id("nav-link-yourAccount")).click();
			
			waitForLoad();
			driver.findElement(By.id("ap_email")).sendKeys("xx@gmail.com");
			driver.findElement(By.id("ap_password")).sendKeys("xxx!");
			driver.findElement(By.id("signInSubmit")).click();
			
			waitForLoad();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");;
			driver.findElement(By.xpath(".//*[@class='nav-search-submit nav-sprite']/input")).click();
			
			waitForLoad();
			driver.findElement(By.xpath(".//*[@id='s-results-list-atf']/"
					+ "li[1]/div/div/div/div[2]/div[2]/a")).click();
			
			waitForLoad();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		    driver.close();
		    driver.switchTo().window(tabs2.get(1));
//		    driver.findElement(By.id("nav-link-yourAccount")).click();
//			driver.findElement(By.id("submit.add-to-cart-announce")).click();
			driver.findElement(By.xpath(".//*[@id='addToCart']/div/div/div/div[2]/span/sapn/input")).click();
			waitForLoad();
			driver.findElement(By.xpath(".//*[@id='intl_pop_multi_atc']/a")).click();
			
			waitForLoad();
			driver.findElement(By.xpath(".//*[@id='hlb-next-steps']/a")).click();
			
			waitForLoad();
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		
	}

}
