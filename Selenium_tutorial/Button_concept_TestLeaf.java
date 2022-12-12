package Selenium_tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_concept_TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the site
		driver.get("https://testleaf.herokuapp.com/");
				
		//Window maximize
		driver.manage().window().maximize();
		
		//Click Button
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		
		//Find position
		
		WebElement position = driver.findElement(By.id("position"));
		Point xypoint = position.getLocation();
		int getx = xypoint.getX();
		int gety = xypoint.getY();
		System.out.println("X Value is :"+getx+ "Y value is:"+gety);
		
		//Find color
		
		WebElement colorbutton = driver.findElement(By.id("color"));
	    String color = colorbutton.getCssValue("background-color");
	    System.out.println("color is:"+color);
	    
	    //Find height & width
	    
	    WebElement getsize = driver.findElement(By.id("size"));
	    int height =  getsize.getSize().getHeight();
	    int width = getsize.getSize().getWidth();
	   
	    System.out.println(height);
	    
	    //Click home page
	    
	   WebElement home = driver.findElement(By.id("home"));
	   home.click();
	   
	   driver.close();

	}

}
