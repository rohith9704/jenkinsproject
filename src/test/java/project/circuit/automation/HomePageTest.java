package project.circuit.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomePageTest extends Page {
	WebDriver driver = null;
	HomePage homepage;
	public HomePageTest() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}
	@Test(priority = 0)
	public void signInTest() {
		homepage.SignInButton();
	}

	@Test(priority = 1)
	public void loginTest() {
		homepage = homepage.login(prop.getProperty("username"));
		homepage.nextButtonClick();
	}
	@Test(priority = 2)
	public void passwordTest() {
		homepage = homepage.password(prop.getProperty("password"));
		homepage.submitButtonClick();
	}
	@Test(priority = 3)
	public void conversation() {
		homepage.functionaility();
	}
	@Test(priority = 4)
	public void createFrom() {
		homepage.movenment();
	}
	@Test(priority = 5)
	public void enterTitle() {
		homepage.converstionsTitle("qabatch4");
	}
	@Test(priority = 6)
	public void enterDescription() {
		homepage.title("knowledge with divine look");		
	}
	@Test(priority = 8)
	public void startButtontest() {
		homepage.startButton();
	}
	@AfterTest
	public void closeHomePage() {
		driver.close();
	}
}
