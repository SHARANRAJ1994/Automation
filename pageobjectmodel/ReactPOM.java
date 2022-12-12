package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReactPOM {
	
	//Login
	@FindBy(id="email")
	public static WebElement Username;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/form/div[2]/span/svg")
	public static WebElement eye;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div[2]/form/div[3]/div/label/span[1]/span[1]/input")
	public static WebElement Remembertoggle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div[2]/form/div[4]/button[1]")
	public static WebElement Login;
	
	//Company Details
	
	@FindBy(xpath="/html/body/div/div/div/header/div/button/svg/path")
	public static WebElement Menus;
	
	@FindBy(xpath="/html/body/div/div/div/div/div/nav/section[2]/div/div[2]/span")
	public static WebElement Companydetails;
	
	@FindBy(xpath="/html/body/div/div/div/main/p/div/div/div/div/div/div/div[1]/div[2]/button")
	public static WebElement companyedit;

}
