package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;

public class SignUpPage extends FBBasePage{
	
	@FindBy(xpath="//input[@value='Log In to Existing Account']")
	WebElement clicking;
	
	@FindBy(xpath="//input[@type='email' and @name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='text' and @name='firstname']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='text' and @name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@type='text' and @name='reg_email__']")
	WebElement emailname;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwdname;

	
	public SignUpPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(DataTable credential) throws Exception{
		clicking.click();
		
		Thread.sleep(3000);
		for(Map<String,String> data : credential.asMaps(String.class, String.class)){
			email.sendKeys(data.get("phone"));
			pwd.sendKeys(data.get("pwd"));
			
		}
	}
	
	public void signUpCredi(DataTable credi){
		
		for(Map<String,String> mainData : credi.asMaps(String.class, String.class)){
			username.sendKeys(mainData.get("firstname"));
			//firstname|lastname|email|password
			lastname.sendKeys(mainData.get("lastname"));
			emailname.sendKeys(mainData.get("email"));
			pwdname.sendKeys(mainData.get("password"));
			
			
		}
		
	}
	
	

}
