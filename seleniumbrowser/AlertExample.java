package seleniumbrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import POM.AlertEx;

public class AlertExample {
	WebDriver driver;
@Test
	public void Alerttest() {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0079\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		
		PageFactory.initElements(driver, AlertEx.class);
		
		AlertEx.quick1.click();
		
		/*
		 * WebElement alert = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[9]/a/img"));
		 * alert.click();
		 */
		
		AlertEx.accepted.click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		
		/*
		 * WebElement alertbox = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		 * alertbox.click(); 
		 * Alert popup= driver.switchTo().alert(); 
		 * popup.accept();
		 */
		
		AlertEx.confirm.click();
		Alert confirmpopup=driver.switchTo().alert();
		confirmpopup.dismiss();
		
		/*
		 * WebElement confirmbox = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		 * confirmbox.click(); 
		 * Alert confirmpopup = driver.switchTo().alert();
		 * confirmpopup.dismiss();
		 */
		
		AlertEx.Pbox.click();
		Alert text =driver.switchTo().alert();
		text.sendKeys("Murugan");
		text.accept();
		
		/*
		 * WebElement pbox = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[3]/div/div/button")); 
		 * pbox.click();
		 * Alert text = driver.switchTo().alert(); 
		 * text.sendKeys("Murugan");
		 * text.accept();
		 */
      }

}
