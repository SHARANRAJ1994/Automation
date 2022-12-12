package seleniumbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.DatePOM;

@Test
public class Datepickerexample {
	WebDriver driver;

public void Datepicker(){		
	// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0079\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");

		PageFactory.initElements(driver, DatePOM.class);
		
		DatePOM.calendar.click();
		
		DatePOM.nextbutton.click();
	
		DatePOM.date.click();

		 
	}

}
