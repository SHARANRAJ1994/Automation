package Selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_concept_TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the site
		driver.navigate().to("https://testleaf.herokuapp.com/pages/radio.html");
		
		//Window maximize
		driver.manage().window().maximize();
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		unchecked.click();
		
		WebElement aboveage= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		aboveage.click();
	}

}
