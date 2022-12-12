package Selenium_tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the site
		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
				
		//Window maximize
		driver.manage().window().maximize();
		
		//Select by index
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(2);
		select.selectByValue("4");
		select.selectByVisibleText("UFT/QTP");
		
		//Get options
		
		List<WebElement> listoptions = select.getOptions();
		int options = listoptions.size();
		System.out.println("Size of value is :"+options);
		
		//By selecting particular field
        dropdown.sendKeys("Selenium");
        
        WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        
        Select multiselect1 = new Select(multiselect);
        multiselect1.selectByIndex(1);
        multiselect1.selectByIndex(2);
        multiselect1.selectByIndex(3);
        
        driver.close();
	}
}
