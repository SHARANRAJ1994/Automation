package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		
		WebElement Editbox = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
	    Editbox.click();		
		//Textbox to Enter a email address
		WebElement emailtext= driver.findElement(By.id("email"));
		emailtext.sendKeys("test@gmail.com");
		
		//Textbox to Append a value
		WebElement appendtext= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		appendtext.sendKeys("New");
		
		//get text value from textbox and Print it, in order to print the value, 
		//first should store the value in a element datatype
		WebElement copy= driver.findElement(By.name("username"));
		String test= copy.getAttribute("value");
		System.out.println("Value is:"+test);
		
		//Clear value in the textbox
		WebElement erase= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		erase.clear();
		
		//Check Textbox is disabled and Print the result(isEnabled will return boolean datatype)
		WebElement disabled= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean result= disabled.isEnabled();
		System.out.println("result:"+result);
		

	}

}
