package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("Madurai"+Keys.ENTER);
		
	WebElement clickmaduraipage= driver.findElement(By.partialLinkText("Madurai"));
		clickmaduraipage.click();
	}

}
