package seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		
		WebElement frame = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[10]/a/img"));
		frame.click();
		
	  driver.switchTo().frame(0);
	   WebElement frame1 = driver.findElement(By.id("Click"));
	   frame1.click();
	  String text = driver.findElement(By.id("Click")).getText();
	  System.out.println("Text:" +text);
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(1);
	  driver.switchTo().frame("frame2");
	  
	  WebElement nestedframe = driver.findElement(By.id("Click1"));
	  nestedframe.click();
	  
	  driver.switchTo().defaultContent();
	  
	  List<WebElement> numberofframes = driver.findElements(By.tagName("iframe"));
	  int Noofframes = numberofframes.size();
	  System.out.println("Number of frames:"+Noofframes);

	}

}
