package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		
		WebElement radioselection = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[6]/a/img"));
		radioselection.click();
		
	  WebElement radio = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
	  boolean r1 = radio.isSelected();
	  System.out.println("Unchecked:"+r1);
	  
	  WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
	  boolean r2 = radio1.isSelected();
	  System.out.println("Checked:"+r2);
	  
	  WebElement age = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
      if (age.isSelected()) {
    	  String tick = age.getAttribute("value");
    	  System.out.println("Age :"+tick);
	}
}
}
