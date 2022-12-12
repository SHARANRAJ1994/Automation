package common_actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;


public class Baseclass {
	public static Properties Prop=null;
	public static WebDriver driver=null;
	
	//Read the data and Load the data from Config properties file
	public Properties Loadproperty() throws IOException {
		FileInputStream fileobject= new FileInputStream("Hrconfig.properties");
		Prop= new Properties();
		Prop.load(fileobject);
		return Prop;
	}
	@BeforeSuite
	public void launch() throws IOException {
		Loadproperty();
		String searchengine= Prop.getProperty("browser");
		System.out.println(searchengine);
		
		String driverpath= Prop.getProperty("path");
		System.out.println(driverpath);
		
		String linkURL= Prop.getProperty("url");
		System.out.println(linkURL);
		
		if(searchengine.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverpath);
			 driver=new ChromeDriver();
			
		}
		else if (searchengine.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",driverpath);
			 driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(linkURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	       
	}
	/*
	 * public void breakdown() {
	 * 		Loadproperty();

	 *  driver.quit(); }
	 */
}
