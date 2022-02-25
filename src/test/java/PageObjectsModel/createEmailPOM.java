package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createEmailPOM {
	
	WebDriver driver;
	
	public createEmailPOM (WebDriver x) {
		driver =x;
	}
	
	public WebElement getfirstname() {
		WebElement FirstName = driver.findElement(By.name("firstName"));
	    return FirstName ;
		}
	
	public WebElement getlastname() {
		WebElement LastName = driver.findElement(By.name("lastName"));
	    return LastName ;
		}
	
	public WebElement getemailaddress() {
		WebElement EmailAdd = driver.findElement(By.name("yid"));
	    return EmailAdd ;
		}
	
	public WebElement getpassword() {
		WebElement Password = driver.findElement(By.name("password"));
	    return Password ;
		}
	
	public WebElement getzipeCode() {
		WebElement ZipeCode = driver.findElement(By.name("shortCountryCode"));
	    return ZipeCode ;
		}
	public WebElement getmobilenumber() {
		WebElement MobileNumber = driver.findElement(By.name("phone"));
	    return MobileNumber ;
		}
	public WebElement getbirthmonth() {
		WebElement BirthMonth = driver.findElement(By.name("mm"));
	    return BirthMonth ;
		}
	public WebElement getday() {
		WebElement Day = driver.findElement(By.name("dd"));
	    return Day ;
		}
	
	public WebElement getyear() {
		WebElement Year = driver.findElement(By.name("yyyy"));
	    return Year ;
		}
	
	public WebElement getgender() {
		WebElement Gender = driver.findElement(By.name("freeformGender"));
	    return Gender ;
		}
	public WebElement getcontinue() {
		WebElement Continue = driver.findElement(By.name("signup"));
	    return Continue ;
		}

	
}
