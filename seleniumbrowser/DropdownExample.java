package seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("facebook signup"+Keys.ENTER);
		
		WebElement link = driver.findElement(By.partialLinkText("Facebook"));
		link.click();
		
	//Dropdown Date of birth: Day/Month/Year
		   //Day used selectByIndex method
				WebElement DOB1 = driver.findElement(By.id("day"));
				Select dateday = new Select(DOB1);
				dateday.selectByIndex(15);
	      //To get the List of options in the DAY Element using DOB1
				List<WebElement> daylist = dateday.getOptions();
				int dlist = daylist.size();
				    System.out.println("Number of Options in day :"+dlist);
				
		  //Month used selectByValue method
				WebElement DOB2 = driver.findElement(By.id("month"));
				Select datemonth = new Select(DOB2);
				datemonth.selectByValue("5");
	     //To get the List of options in MONTH Element using DOB2 
	 			List<WebElement> monthlist = datemonth.getOptions();
				int mlist = monthlist.size();
				    System.out.println("Number of Options in Month :"+mlist);
				    
		   //Year used selectByVisiblestring method
				WebElement DOB3 = driver.findElement(By.id("year"));
				Select dateyear = new Select(DOB3);
				dateyear.selectByVisibleText("1997");
				
	       //To get the List of options in YEAR ELEMENT using DOB3
	  			List<WebElement> yearlist = dateyear.getOptions();
				int ylist = yearlist.size();
				    System.out.println("Number of options in Year :"+ylist);

		//Can use "Sendkeys" to select the value in Dropdown
				    DOB1.sendKeys("1");
				    
	}

}
