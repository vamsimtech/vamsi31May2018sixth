package samplePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserCheck {
	@Test
public void launchCheck(){
	System.out.println("launch Check");
	System.setProperty("webdriver.chrome.driver", "E:\\selenium software\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	
}
}
