package project.gitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("asha.likhitha92@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1993asha");
		driver.findElement(By.id("u_0_b")).click();
		

	}
	
}


