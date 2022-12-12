package Mainmethod;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.FBsignup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {
	WebDriver driver;
	
	
	@Test
public void facebookLogin(){
	 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS0079\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("facebook sign up"+Keys.ENTER);
		
		WebElement link= driver.findElement(By.partialLinkText("Facebook"));
		link.click();
		
//using PAGE FACTORY TO INITIALIZE THE ELEMENTS
		PageFactory.initElements(driver,FBsignup.class);

		FBsignup.firstname1.sendKeys("Mark");
		FBsignup.lastname1.sendKeys("Antony");
		FBsignup.email.sendKeys("mantony@gmail.com");
		FBsignup.reenteremail.sendKeys("mantony@gmail.com");
		FBsignup.password.sendKeys("mantony123");
////PageObjectModel FBsignup
//		FBsignup.firstname(driver).sendKeys("Mark");
//		FBsignup.lastname(driver).sendKeys("Antony");
//		FBsignup.email(driver).sendKeys("mantony@gmail.com");
//      FBsignup.reenteremail(driver).sendKeys("mantony@gmail.com");
//      FBsignup.password(driver).sendKeys("mantony123");
		
// TextBoxes
		/*
		 * WebElement firstname1 = driver.findElement(By.name("firstname"));
		 * firstname1.sendKeys("Mark");
		 * 
		 * WebElement lastname1 = driver.findElement(By.name("lastname"));
		 * lastname1.sendKeys("Antony");
		 * 
		 * WebElement email = driver.findElement(By.name("reg_email__"));
		 * email.sendKeys("Mantony@gmail.com");
		 * 
		 * WebElement reenteremail =
		 * driver.findElement(By.name("reg_email_confirmation__"));
		 * reenteremail.sendKeys("Mantony@gmail.com");
		 * 
		 * WebElement password = driver.findElement(By.name("reg_passwd__"));
		 * password.sendKeys("mantony123");
		 */
		
		
//Dropdown Date of birth
		/*WebElement DOB1 = driver.findElement(By.id("day"));
		Select dateday = new Select(DOB1);
	 	dateday.selectByIndex(15);*/
		     Select dateday = new Select(FBsignup.DOB1);
		     dateday.selectByIndex(15);
		  //To get the List of options in the DAY Element using DOB1
		     List<WebElement> daylist = dateday.getOptions();
		     int dlist = daylist.size();
		     System.out.println("Number of Options in day :"+dlist);
		
			/*
			 * WebElement DOB2 = driver.findElement(By.id("month")); 
			 * Select datemonth = new Select(DOB2); 
			 * datemonth.selectByValue("5");
			 */
		    Select datemonth = new Select(FBsignup.DOB2);
		    datemonth.selectByValue("5");
		 //To get the List of options in MONTH Element using DOB2 
		    List<WebElement> monthlist = datemonth.getOptions();
		    int mlist = monthlist.size();
		    System.out.println("Number of Options in Month :"+mlist);
		
			/*
			 * WebElement DOB3 = driver.findElement(By.id("year")); 
			 * Select dateyear = new Select(DOB3); 
			 * dateyear.selectByVisibleText("1997");
			 */
		  
		    Select dateyear = new Select(FBsignup.DOB3);
		    dateyear.selectByVisibleText("1997");
		 //To get the List of options in YEAR ELEMENT using DOB3
		    List<WebElement> yearlist = dateyear.getOptions();
		    int ylist = yearlist.size();
		    System.out.println("Number of Options in Year :"+ylist);
		    
		    
//Gender Radio	    
			/*
			 * WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/input"));
			 * gender.click(); 
			 * boolean status = gender.isSelected();
			 */
		    FBsignup.gender.click();
		    boolean status = FBsignup.gender.isSelected();
		    System.out.println("Custom is selected? :"+status);
		
//Pronoun dropdown		
		/*
		 * WebElement pronounbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div[1]/select")); 
		 * Select Probox = new Select(pronounbox); 
		 * Probox.selectByIndex(3);
		 */
		
		Select probox = new Select(FBsignup.pronounbox);
		probox.selectByIndex(3);
		
//Button
		/*
		 * WebElement submitbuttoncolor = driver.findElement(By.name("websubmit"));
		 * String bgcolor = submitbuttoncolor.getCssValue("background-color");
		 * System.out.println("Submit button color is:"+bgcolor);
		 */
		
		String bgcolor = FBsignup.submit.getCssValue("background-color");
		System.out.println("Submit button color is:" +bgcolor);
		
		/*
		 * WebElement submitbuttonsize = driver.findElement(By.name("websubmit"));
		 * int submitbuttonheight = submitbuttonsize.getSize().getHeight(); 
		 * int submitbuttonwidth = submitbuttonsize.getSize().getWidth();
		 * System.out.println("Height of submitbutton is:"+submitbuttonheight +"Width of submitbutton is:"+submitbuttonwidth);
		 */
		
		int height = FBsignup.submit.getSize().getHeight();
		int width = FBsignup.submit.getSize().getWidth();
		System.out.println("Height:" +height + "Width:"+width);
		
		
	}

}