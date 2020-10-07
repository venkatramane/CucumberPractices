package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;

public class SecondPage extends FBBasePage{
	
	@FindBy(xpath="//input[@value='Log In to Existing Account']")
	WebElement clicking;
	
	@FindBy(xpath="//input[@type='email' and @name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pwd;
	
	public SecondPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void reEnter(DataTable credg) throws Exception{
		
		List<List<String>> value = credg.raw();
		
		clicking.click();
		email.clear();
		email.sendKeys(value.get(0).get(0));
		
		Thread.sleep(3000);
		
		pwd.clear();
		pwd.sendKeys(value.get(0).get(1));
	}

}
