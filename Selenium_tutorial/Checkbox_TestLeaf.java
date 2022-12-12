package Selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_TestLeaf {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		//Launch the site
		 driver.navigate().to("https://testleaf.herokuapp.com/pages/checkbox.html");
			
		//Window maximize
		 driver.manage().window().maximize();
		 
		//To click SQL
		WebElement SQL = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]"));
		SQL.click();
		
		//Selected or not have to check
		WebElement unselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
	    boolean select = unselect.isSelected();
	    System.out.println(select);
	    
	    //Statement print as true or false
	   WebElement select1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
	   boolean sel = select1.isSelected();
	   System.out.println(sel);
	   
	   //Statement print as true or false
	  WebElement select2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
	  boolean sel2 = select2.isSelected();
	  System.out.println(sel2);
	  
	  
		  driver.close();
	}

}
