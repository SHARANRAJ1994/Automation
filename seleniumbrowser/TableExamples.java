package seleniumbrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> numberofcolumns = driver.findElements(By.tagName("th"));
		int totalcolumns =numberofcolumns.size();
		System.out.println("Number of columns "+totalcolumns );
		
		List<WebElement> numberofrows = driver.findElements(By.tagName("tr"));
		int totalrows = numberofrows.size();
		System.out.println("Number of rows "+totalrows);
		
		//To find the Progress value:
		WebElement progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String Progressvalue = progress.getText();
		System.out.println("Progress is "+Progressvalue);
		
		//To find the lowest progress value and check it.
		List<WebElement> comparevalue = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberlist = new ArrayList<Integer>();
	
		for (WebElement object1 : comparevalue) {
			String strvalue = object1.getText().replace("%", "");
		//converting string value to Integer
			numberlist.add(Integer.parseInt(strvalue));
		}
		System.out.println("Progress: " +numberlist);
		//to get the minimum value
		Integer minimumprogress = Collections.min(numberlist);
		System.out.println("Minprogress: "+minimumprogress+"%");
		
		//Converting Integer to string
		String number = Integer.toString(minimumprogress)+"%";
		
		//creating Xpath with Lowest progress value
		String finalpath ="//td[normalize-space()="+"\""+number+"\""+"]"+"//following::td[1]";
		System.out.println(finalpath);
		
		WebElement check = driver.findElement(By.xpath(finalpath));
		check.click();
		}
	}


