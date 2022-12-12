package seleniumbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadexample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement uploadbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/form/div/input"));
		uploadbutton.click();
		// when the upload button clicked the Windows panel will open, to interact with windows need Java class as "StringSelection" and "Toolkit"
		//To Copy the upload content
		StringSelection select = new StringSelection("C:\\Users\\GIS0079\\Downloads\\sampleFile.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		//To paste the upload content use "Robot"class
		Robot paste = new Robot();
		paste.keyPress(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_ENTER);
		paste.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
