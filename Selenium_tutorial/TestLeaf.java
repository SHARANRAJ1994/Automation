package Selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch the site
		driver.get("https://testleaf.herokuapp.com/");
		
		//Window maximize
		driver.manage().window().maximize();
		
	/*	//Click the particular element
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
        
        //Entered email ID
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        
        //Append the data
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("data");
        
        //Get default text entered
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
        
        //Clear the text module
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
        
        // Enable or Disable concept
        
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));*/
        
		
		
		                                   //or
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
		
		WebElement Emailbox = driver.findElement(By.id("email"));
		Emailbox.sendKeys("abc@gmail.com");
		
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("datas");
		
		WebElement text = driver.findElement(By.name("username"));
        text.getAttribute("value");
        System.out.println(text);
        
        
        WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        clear.clear();
        
        WebElement disabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        boolean A = disabled.isEnabled();
        System.out.println(A);
        
        driver.close();
        
	}

}


