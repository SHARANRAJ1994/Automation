package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBsignup {
	
	//to find the element we are using @FindBy instead of "driver.findElement()"
	//using "static" is not required to create an object in the TestCase
	
	@FindBy(how=How.NAME,using="firstname")
	public static WebElement firstname1;
	
	@FindBy(name="lastname")
	public static WebElement lastname1;
	
	@FindBy(name="reg_email__")
	public static WebElement email;
	
	@FindBy(name="reg_email_confirmation__")
	public static WebElement reenteremail;
	
	@FindBy(name="reg_passwd__")
	public static WebElement password;
	
//	public static WebElement firstname(WebDriver driver) {
//		return driver.findElement(By.name("firstname"));
//	}
//	public static WebElement lastname(WebDriver driver) {
//		return driver.findElement(By.name("lastname"));
//	}
//	public static WebElement email(WebDriver driver) {
//		return driver.findElement(By.name("reg_email__"));
//	}
//	public static WebElement reenteremail(WebDriver driver) {
//		return driver.findElement(By.name("reg_email_confirmation__"));
//	}
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.name("reg_passwd__"));
//	}
	@FindBy(id="day")
	public static WebElement DOB1;
	
	@FindBy(id="month")
	public static WebElement DOB2;
	
	@FindBy(id="year")
	public static WebElement DOB3;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/input")
	public static WebElement gender;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div[1]/select")
	public static WebElement pronounbox;
	
	@FindBy(name="websubmit")
	public static WebElement submit;
	
}
