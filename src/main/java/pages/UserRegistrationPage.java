package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;




public class UserRegistrationPage extends PageBase 
{
	WebDriver driver;
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="account_type")
	WebElement account_type;

	
	@FindBy(name="first_name")
	WebElement fnTxtBox; 
	
	@FindBy(name="last_name")
	WebElement lnTxtBox ;
	
	@FindBy(name="phone")
	WebElement phone ; 
	
	@FindBy(name="email")
	WebElement emailTxtBox ; 
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div/form/div[5]/div/input")
	WebElement passwordTxtBox ; 

	@FindBy(name="signup_token")
	WebElement registerBtn ; 
	
	@FindBy(css="div.result")
	public WebElement successMessage ; 
	



	
	public void userRegistration(String firstName , String lastName ,String phonee, String email , String password ) 
	{
	
		Select dropdown = new Select(account_type);  

		
		setTextElementText(fnTxtBox, firstName);
		setTextElementText(lnTxtBox, lastName);
		setTextElementText(phone,phonee);
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		dropdown.selectByVisibleText("Customer");	
		driver.switchTo().frame("a-lggqlj7elpt7");
		driver.findElement(By.className("rc-anchor-content")).click();
				clickButton(registerBtn);
	}
	

	
	
}
