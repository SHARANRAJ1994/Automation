package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePOM {
	
	@FindBy(xpath="//*[@id=\'datepicker\']")
	public static WebElement calendar;
	
	@FindBy(xpath="//a[@title='Next']")
	public static WebElement nextbutton;
	
	@FindBy(xpath="//a[contains(text(),'20')]")
	public static WebElement date;

}
