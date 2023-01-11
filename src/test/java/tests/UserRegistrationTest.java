package tests;



import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase
{

	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 
	Faker faker = new Faker(new Random(24));
	
	String firstName= faker.name().firstName();
	 String lastName =faker.name().lastName();
	  
String phonee=faker.regexify("00223[0-9]{8}|^\\+223[0-9]{8}^[0-9]{8}");
	String email =faker.internet().emailAddress();
	String password=faker.internet().password(8, 16, true, false);
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
	
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstName,lastName,phonee, email , password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Signup successfull please login."));
	}
	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void RegisteredUserCanLogin() 
	{
		
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(email,password);
	}
	
	
	
	
}
