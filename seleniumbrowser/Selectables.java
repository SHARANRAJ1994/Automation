package seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		
		//To get the list of elements use "driver.findelements" and also at the end of the "Xpath" value ise "/li"
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
		int number = selectable.size();
		System.out.println("number of elements"+number);
		
		Actions multiselect = new Actions(driver);
		multiselect.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		//OR
		/*Actions mselect = new Actions(driver);
		mselect.clickAndHold(selectable.get(0));
		mselect.clickAndHold(selectable.get(1));
		mselect.clickAndHold(selectable.get(2));
		mselect.build().perform();*/
 
	}

}
