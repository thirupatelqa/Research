package com.research.thiru;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:/selenium_project/Research"
				+ "/src/main/java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement element = driver.findElement(By.id("hplogo"));
		Point point = element.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println(+xcord+"and"+ycord);
		Actions action = new Actions(driver);
		action.moveToElement(element, xcord, ycord).click();
		Thread.sleep(3000);
		element.sendKeys(Keys.TAB);
		element.sendKeys("Facebook");
		element.sendKeys(Keys.ENTER);
	}
}
