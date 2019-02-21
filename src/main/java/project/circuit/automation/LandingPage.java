package project.circuit.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends Page {
	@FindBy(css = "a[href='https://na.yourcircuit.com/login?region=us']")
	WebElement signIn;
	@FindBy(css = "a[u-localize='res_Signup']")
	WebElement signUp;

	public LandingPage(WebDriver driver) {
		super();

	}
	public void signInButton() {
		signIn.click();	
		signUp.click();
	}
}
