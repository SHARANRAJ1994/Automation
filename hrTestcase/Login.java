package hrTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_actions.Baseclass;
import pageobjectmodel.Loginpage;

public class Login extends Baseclass {
	@Test
	public void HRLogin() {
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.Username.sendKeys(Prop.getProperty("username"));
		Loginpage.Password.sendKeys(Prop.getProperty("password"));
		Loginpage.Loginbutton.click();
	
	}
	@Test
	public void Company() {
		
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.Companydetail.click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		Loginpage.Companyedit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Loginpage.Companyname.sendKeys(Prop.getProperty("companyname"));
		Loginpage.Companyaddress.sendKeys(Prop.getProperty("companyadd"));
		Loginpage.Numberofemployees.sendKeys(Prop.getProperty("numberofemp"));
		Loginpage.Contactnumber.sendKeys(Prop.getProperty("contactnumber"));
		Loginpage.Email.sendKeys(Prop.getProperty("email"));
		Loginpage.Fullday.sendKeys(Prop.getProperty("fulldaytime"));
		Loginpage.Halfday.sendKeys(Prop.getProperty("halfdaytime"));
		Loginpage.NumberofLeaves.sendKeys(Prop.getProperty("numberofleaves"));
		
	}

}
