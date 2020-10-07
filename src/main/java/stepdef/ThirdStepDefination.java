package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.ThirdCLassInCredinatial;

public class ThirdStepDefination {
	
	ThirdCLassInCredinatial third;
	
	
	@Given("^navigating to sathya url$")
	public void navigating_to_sathya_url() throws Throwable {
		third = new ThirdCLassInCredinatial();
		System.out.println("Starting");
		
	    
	}

	@Then("^giving valied \"(.*)\" and \"(.*)\"$")
	public void giving_valied_username_and_Password(String username1, String passwd) throws Throwable {
		third.login(username1, passwd);
	  
	}
	
	@Then("^again navigating to sathyain$")
	public void navigating_agin() throws Throwable {
		
		System.out.println("Start Again");
	   
	}

	@Then("^enter again \"(.*)\" and \"(.*)\"$")
	public void enter_again_userandPwd(String username12, String passwd1) throws Throwable {
		
		third.url();
		
		third.usingagain(username12, passwd1);
		
	    
	}

}
