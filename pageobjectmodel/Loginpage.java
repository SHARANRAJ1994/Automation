package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
//Login
	@FindBy(id="emailInput")
	public static WebElement Username;
	
	@FindBy(id="passwordInput")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id=\"login\"]/span[1]")
	public static WebElement Loginbutton;
	
//Company Details:
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/span/span[2]/p")
	public static WebElement Companydetail;

	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-list/div/div/mat-card/mat-card-content/div/div[1]/div[2]/button")
	public static WebElement Companyedit;
	
	@FindBy(id="companyNameInput")
	public static WebElement Companyname;
	
	@FindBy(id="companyAddressInput")
	public static WebElement Companyaddress;
	
	@FindBy(id="noOfEmployeesInput")
	public static WebElement Numberofemployees;
	
	@FindBy(id="contactNumberInput")
	public static WebElement Contactnumber;
	
	@FindBy(id="emailInput")
	public static WebElement Email;
	
	@FindBy(id="fullDayTimingInput")
	public static WebElement Fullday;
	
	@FindBy(id="halfDayTimeInput")
	public static WebElement Halfday;
	
	@FindBy(id="employeeIdInput")
	public static WebElement NumberofLeaves;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[8]/div[2]/button[2]/span[1]")
	public static WebElement Submit;
	
//Leaves- Apply Leaves
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[3]/span/mat-icon[2]")
	public static WebElement Leavemenu;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-nav-list/a[2]/span/mat-icon")
	public static WebElement ApplyLeave;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	public static WebElement Leavetype;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[1]/div[3]/div/mat-form-field/div/div[1]/div[1]/mat-date-range-input/div/div[2]/input")
	public static WebElement Selectdate;
	
	@FindBy(id="notesInput")
	public static WebElement Notes;
	
	@FindBy(id="reasonInput")
	public static WebElement Reason;
}
