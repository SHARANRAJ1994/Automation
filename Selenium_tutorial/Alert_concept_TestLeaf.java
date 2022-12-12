package Selenium_tutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_concept_TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the site
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Alert.html");
		
		//Window maximize
		driver.manage().window().maximize();
		
		WebElement alertclick = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertclick.click();
		
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmalert.click();
		
		Alert confirmalert1 = driver.switchTo().alert();
		confirmalert1.dismiss();
		
		WebElement promptalert = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptalert.click();
		
		Alert promptalert1 = driver.switchTo().alert();
		promptalert1.sendKeys("Test");
		promptalert1.accept();
	}

}
