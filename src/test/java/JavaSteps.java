package test.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import main.java.RegisterBLL;

public class JavaSteps extends TestCase{
	String userName, userEmail, actionButton;
	@Given("^User has entered \"([^\"]*)\" as name, email as \"([^\"]*)\"$")
	public void InputData(String name, String email) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		userName = name;
		userEmail = email;
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton = button;
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void System_display_message(String message) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(actionButton.equals("Register"))
		{
			RegisterBLL register = new RegisterBLL();
			assertEquals(message, register.Validate(userName, userEmail));
		}
	}

	@Then("^Send mail on given mail id$")
	public void Send_mail_on_given_mail_id() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RegisterBLL register = new RegisterBLL();
		assertEquals(true, register.SendMail());
	}

}
