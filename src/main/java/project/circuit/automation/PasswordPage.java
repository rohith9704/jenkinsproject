package project.circuit.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage  {
	protected WebDriver driver;
	

	@FindBy(css = "input[name='password']")
	WebElement enterPassword;
	@FindBy(css = "button[type='submit']")
	WebElement submitButton;

	public PasswordPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void password(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	public void nextbutton() {
        submitButton.click();		
		
	}
	
}
