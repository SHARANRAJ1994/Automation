package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		
		WebElement auto = driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]"));
		 auto.sendKeys("o");
		 
		 // In this site, the auto suggestions are not predefined in the LIST tag? so unable to proceed.


	}

}
