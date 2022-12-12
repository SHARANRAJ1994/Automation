package seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonexample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http://testleaf.herokuapp.com/");
      
      WebElement Button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a/img"));
      Button.click();
      
      //To find the Position of the Button(Location) x and y:
      WebElement test= driver.findElement(By.id("position"));
      Point XYlocation= test.getLocation();
      int Xlocation= XYlocation.getX();
      int Ylocation= XYlocation.getY();
      System.out.println("X postion is :"+Xlocation + "Y Postition is :"+Ylocation);
      
      //To Find Background colour of the button
      WebElement Bgcolor = driver.findElement(By.id("color"));
     String Buttoncolor= Bgcolor.getCssValue("background-color");
     System.out.println("Button colour is :"+Buttoncolor);
     
     //To find the Size of the Button
     WebElement buttonsize= driver.findElement(By.id("size"));
     int height= buttonsize.getSize().getHeight();
     int width= buttonsize.getSize().getWidth();
     System.out.println("Height is :"+height + "Width is :"+width);
     
     //To Click the button:
     WebElement clickact=driver.findElement(By.id("home"));
     clickact.click();
     
	}

}
