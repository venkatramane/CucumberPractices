package stepdef;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FBBasePage;
import pages.SignUpPage;

public class SignUPStepDef extends FBBasePage {

	SignUpPage sign; // object for SignUp Page

	@Given("^open a browser$")
	public void open_a_browser() throws Throwable {
		FBBasePage.initialization();

	}

	// @Then("^enter name and pwd$")
	// public void valiade_Name() throws Throwable {

	// sign.login(credential);	
	// }
	


@Then("^enter name and pwd$")
public void enter_name_and_pwd(DataTable arg1) throws Exception{
	sign = new SignUpPage();
	sign.login(arg1);
}


//	@Then("^enter credinatial$")
//	public void enter_credinatial() throws Throwable {
//		sign.signUpCredi(null);
//
//	}
@Then("^enter credinatial$")
public void enter_credinatial(DataTable arg1) throws Throwable {
	sign.signUpCredi(arg1);
	

}

	@Then("^refresh browser$")
	public void refresh_browser() {


		driver.navigate().refresh();

	}

}
