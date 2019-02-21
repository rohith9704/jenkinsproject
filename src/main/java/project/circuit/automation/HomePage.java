package project.circuit.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page{
	@FindBy(css = "a[href='https://na.yourcircuit.com/login?region=us']")
	WebElement signIn;
	@FindBy(name = "username")
	WebElement username;
	@FindBy(css = "button[u-localize='res_Next']")
	WebElement nextButton;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(css = "button[type='submit']")
	WebElement submitButton;
	@FindBy(css = "a[aria-controls='panel-selectorPanel-1']")
	WebElement conversation;
	//creating the forms 
	@FindBy(xpath = "//*[@id='selector-scroller']/div/ul/li/a/div")
	WebElement communities;
	@FindBy(css ="div[u-localize='res_Create']")
	WebElement createFromButton;
	@FindBy(css = "input[ng-model='conversation.topic']")
	WebElement conversationTitle;
	@FindBy(css = "textarea[ng-model='conversation.description']")
	WebElement description;
	@FindBy(css = "u-autocomplete[selected-objects='conversation.participants']")
	WebElement participant;
	@FindBy(css = "div[class='component flex-shrink-0 add-conversation-header-button']")
	WebElement startButton;


	//Intilializing my page objects
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void functionaility() {
		communities.click();
		conversation.click();
	}
	public void title(String desc) {
		description.sendKeys("knowledge with divine look");
	}
	public void movenment() {
		createFromButton.click();
	}
	public void converstionsTitle(String title) {
		conversationTitle.sendKeys(title);
	}
	public void startButton() {
		startButton.click();
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String use) {
		username.sendKeys(use);
		return new HomePage();
	}
	public HomePage password(String pwd) {
		password.sendKeys(pwd);
		return new HomePage();
	}
	public void SignInButton() {
		signIn.click();
	}
	public void nextButtonClick() {
		nextButton.click();	
	}
	public void submitButtonClick() {
		submitButton.click();
	}

}
