package seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/sortable");
		
		List<WebElement> sortable = driver.findElements(By.xpath("//*[@class='vertical-list-container mt-4']/child::*/li"));
	    int total = sortable.size();
		System.out.println("total: "+total);
		
		WebElement fromelement = sortable.get(4);
		WebElement toelement = sortable.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release(fromelement);
		action.build().perform();

	}

}
