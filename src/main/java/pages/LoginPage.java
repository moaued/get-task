package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="email")
	WebElement emailTxtBox ; 

	@FindBy(name="password")
	WebElement passwordTxtBox ; 

	@FindBy(xpath ="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	WebElement loginBtn ; 
	
	public void UserLogin(String email , String password) 
	{
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}

}
