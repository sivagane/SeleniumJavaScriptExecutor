package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumJavaScript\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.adactin.com/HotelApp/");
	WebElement User = d.findElement(By.id("username"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].setAttribute('value','Sivaganesh');",User);
    
    WebElement Pass = d.findElement(By.id("password"));
    js.executeScript("arguments[0].setAttribute('value','08091990');",Pass);
    WebElement Login = d.findElement(By.id("login"));
    js.executeScript("arguments[0].click();",Login);
}
}
