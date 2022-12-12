package seleniumbrowser;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
		home.click();
		
		driver.navigate().back();
		
		WebElement wheretogo = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a"));
		String direct = wheretogo.getAttribute("href");
		System.out.println(direct);
		
	    WebElement broken = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
	    broken.click();
	    
	   String title = driver.getTitle();
	   if (title.contains("404")) {
		System.out.println("The Page is broken");
	}
	   driver.navigate().back();
	   
	   WebElement gotohomepage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div"));
	   gotohomepage.click();
	   
	   List<WebElement> numberoflinks = driver.findElements(By.tagName("a"));
	   int totallinks = numberoflinks.size();
	   System.out.println("Number of links"+totallinks);
	}

}
