package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browsers {
	WebDriver driver;
	long starttime;
	long endtime;
	
	@BeforeSuite(groups = {"Google"})
	public void openBrowsers() {
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0079\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(groups = {"Google"})
	public void openGoogle() {
		
		driver.navigate().to("https://www.google.com");
	}
	@Test
	public void openEdge() {
		driver.navigate().to("https://www.edge.com");
	}
    @AfterSuite(groups = {"Google"})
	public void close() {
	  endtime= System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println("Totaltime taken:" +totaltime);
	}
}
