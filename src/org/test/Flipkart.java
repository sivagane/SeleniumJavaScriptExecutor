package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumJavaScript\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get(" https://www.flipkart.com/");
	
	WebElement EmailId = d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].setAttribute('value','sivag918@gmail.com');",EmailId);
    
    WebElement Pass = d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
    js.executeScript("arguments[0].setAttribute('value','siva080990');",Pass);

    WebElement Login = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
    js.executeScript("arguments[0].click();",Login);
}
}
