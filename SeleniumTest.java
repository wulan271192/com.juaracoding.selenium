package com.juaracoding.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/driverchrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		//WebElement pagelogin = driver.findElement(By.xpath("//a[text()='Masuk']"));
		//pagelogin.click();
		WebElement searchYoutube = driver.findElement(By.xpath("//input[@id='search']"));
		searchYoutube.sendKeys("exo");
		
		WebElement btnSearch = driver.findElement(By.id("search-icon-legacy"));
		btnSearch.click();
		
	}

}
