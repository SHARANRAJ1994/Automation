package common_actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Reactbaseclass {
	public static Properties Propreact=null;
	public static WebDriver driver;
	
	public Properties loadproperties() throws IOException {
		
		FileInputStream objectstream= new FileInputStream("Hrconfigreact.properties");
		Propreact= new Properties();
		Propreact.load(objectstream);
		return Propreact;
	}
	
	//Need to set reference object for the attributes in the Config file
	@BeforeSuite
	public void Launch() throws IOException {
		loadproperties();
		String searchengine=Propreact.getProperty("browser");
		System.out.println("Using Browser:"+searchengine);
		String driverpath=Propreact.getProperty("path");
		String Linkurl=Propreact.getProperty("url");
		
		if(searchengine.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
		}	
			else if(searchengine.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", driverpath);
				driver= new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.navigate().to(Linkurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		}
		/*
		 * public void close() throws IOException { loadproperties();
		 * 
		 * driver.quit(); }
		 */

	
	}
	

