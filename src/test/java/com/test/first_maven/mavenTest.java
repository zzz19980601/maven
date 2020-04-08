package com.test.first_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenTest {
	private static ChromeDriver chromeDriver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openChrome();
		chromeDriver.findElement(By.id("kw")).sendKeys("音乐");
		List<WebElement> buttons = chromeDriver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		chromeDriver.quit();

	}
	public static void openChrome(){
		System.setProperty("webdriver.chrome.driver", "D:/tools/chromedriver.exe");
		chromeDriver  = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");
	}

}
