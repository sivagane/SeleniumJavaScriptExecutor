package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologys1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumJavaScript\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	WebElement PrivPol = d.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/Privacy_Policy_of_Greens_Technologys.html']"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)",PrivPol);
    
    WebElement Print = d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
    String t = Print.getText();
    System.out.println(t);
}
}
