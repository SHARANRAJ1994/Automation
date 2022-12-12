package seleniumbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		
		WebElement window = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[11]/a/img"));
		window.click();
		String parentwindow = driver.getWindowHandle();
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
		//To move the cursor focus from parent window to new open windows
		Set<String> newwindows = driver.getWindowHandles();
		for (String nwindows : newwindows) {
			driver.switchTo().window(nwindows);
		}
       WebElement neditbox = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
       neditbox.click();
       driver.close();
       
       //move the cursor focus to parent window
       driver.switchTo().window(parentwindow);
   
        WebElement multiplewindows = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
        multiplewindows.click();
        Set<String> Numberofwindowsopen = driver.getWindowHandles();
       
        for (String latest : Numberofwindowsopen ) {
			if (!latest.equals(parentwindow)) {
				driver.switchTo().window(latest);
				driver.close();
			}
		}
        int count = Numberofwindowsopen.size();
        System.out.println("Windows Open: "+count);
        
        driver.switchTo().window(parentwindow);

      WebElement dontcloseme = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
        dontcloseme.click();
        
        Set<String> dntcloseme = driver.getWindowHandles();
        for (String tick : dntcloseme) {
			if (!tick.equals(parentwindow)) {
			driver.switchTo().window(tick);
				driver.close();
			}
		}
	}
 
}
