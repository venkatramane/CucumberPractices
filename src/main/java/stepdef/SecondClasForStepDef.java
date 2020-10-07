package stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.SecondPage;

public class SecondClasForStepDef {
	
	SecondPage second;
	
	@Given("^just reEnter a name password$")
	public void just_reEnter_in_another_class(DataTable arg1) throws Throwable {
		second = new SecondPage();
		second.reEnter(arg1);
		
	   
	}

	@Then("^adjust in a class$")
	public void adjust_in_a_class() throws Throwable {
		System.out.println("Success");
	   
	}

}
