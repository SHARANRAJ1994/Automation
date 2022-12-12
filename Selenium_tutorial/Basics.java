package Selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("youtube"+Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();


	}

}
