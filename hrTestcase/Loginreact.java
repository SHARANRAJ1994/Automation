package hrTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_actions.Reactbaseclass;
import pageobjectmodel.ReactPOM;

public class Loginreact extends Reactbaseclass {
	@Test
	public void HRLogin() {
		PageFactory.initElements(driver, ReactPOM.class);
		
		ReactPOM.Username.sendKeys(Propreact.getProperty("username"));
		System.out.println("Username:"+Propreact.getProperty("username"));
		
		ReactPOM.Password.sendKeys(Propreact.getProperty("password"));
		
		//ReactPOM.eye.click(); 
		
	    if(ReactPOM.Remembertoggle.isEnabled()) {
	    	boolean toggle= ReactPOM.Remembertoggle.isEnabled();
	 	    System.out.println("Remember my email:"+toggle);
	    	ReactPOM.Remembertoggle.click();	
	    }	    
		ReactPOM.Login.click();
	} 
   @Test
	public void Companydetails() {
		PageFactory.initElements(driver, ReactPOM.class);
		ReactPOM.Menus.click();
		ReactPOM.Companydetails.click();
		ReactPOM.companyedit.click();
	}
}
