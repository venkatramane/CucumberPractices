package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdCLassInCredinatial extends FBBasePage{
	
	@FindBy(name="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	
	public ThirdCLassInCredinatial(){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) {
		
		driver.navigate().to("https://www.sathya.in/login?ReturnUrl=%2F");
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		
//		driver.navigate().refresh();

}

	public void url(){
		driver.navigate().to("https://www.sathya.in/login?ReturnUrl=%2F");
	}
	public void usingagain(String un1, String pwd1) {
		
		
		
		username.sendKeys(un1);
		password.sendKeys(pwd1);
		submitBtn.click();
		
	}
}