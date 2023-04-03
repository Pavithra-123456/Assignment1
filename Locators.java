package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("demoSalesManager");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

String title=driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd=new Select(source);
dd.selectByIndex(4);
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavi");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
driver.findElement(By.id("createLeadForm_description")).sendKeys("To develop a code");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavithraece@gmail.com");
WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select country=new Select(State);
country.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
String CreateLead=driver.getTitle();
System.out.println(CreateLead);








	}

}
