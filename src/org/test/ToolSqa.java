package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumJavaScript\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get(" http://toolsqa.com/");
	WebElement Last = d.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/toolsqa/?']"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)",Last);
    
    Thread.sleep(3000);
    WebElement First = d.findElement(By.xpath("(//span[text()='Selenium Training'])[1]"));
    js.executeScript("arguments[0].scrollIntoView(false)",First);
}
}
