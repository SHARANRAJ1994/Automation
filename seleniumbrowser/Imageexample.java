package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		//When click on image1 it will direct to home page.
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		image1.click();
		
		//To again come back to image page, using this.
		WebElement image2 = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		image2.click();
		
		//To find the image is broken? 
		WebElement image21= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		//using "naturalWidth" attribute of CSS selector to know the broken image.
		if (image21.getAttribute("naturalWidth").equals("0") ) {
			System.out.println("The image is broken");
		}

	}

}
