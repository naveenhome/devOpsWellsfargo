package test.java;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	private WebDriver driver;
	  private String baseUrl;
	@Given("^I have entered \"([^\"]*)\" in google$")
	public void I_have_entered_in_google(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.setProperty("webdriver.gecko.driver", "/Users/naveensingh/Downloads/geckodriver");
		driver = new FirefoxDriver();
	    baseUrl = "https://www.google.co.in/";
	    driver.get(baseUrl);
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys(arg1);
	}

	@Given("^Google is open in FireFox browser$")
	public void Google_is_open_in_FireFox_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Given("^URL for google is \"([^\"]*)\"$")
	public void URL_for_google_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^I click on google \"([^\"]*)\" button$")
	public void I_click_on_google_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.name("btnK")).click();
	}

	@Then("^it should display all matching result$")
	public void it_should_display_all_matching_result() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("lst-ib")).getAttribute("value");
		Assert.assertEquals("Naveen Kumar Singh", result);
	}

}
