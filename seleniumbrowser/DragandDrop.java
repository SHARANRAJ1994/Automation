package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
			
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		//to make the interaction with Keyboard and Mouse use the class "Actions"
		Actions object = new Actions(driver);
		object.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//OR
	//	object.dragAndDrop(from, to).build().perform();
		

	}

}
