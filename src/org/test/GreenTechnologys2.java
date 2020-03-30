package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologys2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumJavaScript\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/selenium-course-content.html");
	WebElement Close = d.findElement(By.className("close"));
    Close.click();
    
}
}
