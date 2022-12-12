package seleniumbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.CheckboxPOM;

public class Checkboxexample {
	WebDriver driver;

	@Test
	public void checkboxes() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");

		PageFactory.initElements(driver, CheckboxPOM.class);

		CheckboxPOM.checkbox.click();

		/*
		 * WebElement checkbox = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[7]/a/img"));
		 * checkbox.click();
		 */

		CheckboxPOM.knowmlanguage.click();
		/*
		 * WebElement knownlanguage = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[1]/input[1]")); knownlanguage.click();
		 */

		boolean checkboxvalue = CheckboxPOM.checkbox2.isSelected();
		System.out.println("Is selected:" + checkboxvalue);
		/*
		 * WebElement checkbox2 =
		 * driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input")
		 * ); boolean checkboxvalue = checkbox2.isSelected();
		 * System.out.println("Is selected :"+checkboxvalue);
		 */

		if (CheckboxPOM.status.isSelected()) {
			CheckboxPOM.status.click();
		}

		/*
		 * WebElement status = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[3]/input[1]"));
		 * if (status.isSelected()) { status.click(); }
		 */
		if(CheckboxPOM.status1.isSelected()){
			CheckboxPOM.status1.click();
		}

		/*
		 * WebElement status1 = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[3]/input[2]")); if
		 * (status1.isSelected()) { status1.click(); }
		 */

		CheckboxPOM.select.click();

		/*
		 * WebElement select = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[4]/input[4]")); select.click();
		 */

	}

}
