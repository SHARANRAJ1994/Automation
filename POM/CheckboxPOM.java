package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPOM {
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[7]/a/img")
	public static WebElement checkbox;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[1]/input[1]")
	public static WebElement knowmlanguage;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[2]/input")
	public static WebElement checkbox2;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[3]/input[1]")
	public static WebElement status;

	@FindBy(xpath="/html/body/div/div/div[3]/section/div[3]/input[2]")
	public static WebElement status1;
	
	@FindBy(xpath="/html/body/div/div/div[3]/section/div[4]/input[4]")
	public static WebElement select;
}
