package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertEx {
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[9]/a/img")
	public static WebElement quick1;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[1]/div/div/button")
	public static WebElement accepted;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[2]/div/div/button")
	public static WebElement confirm;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[3]/div/div/button")
	public static WebElement Pbox;
	

}
