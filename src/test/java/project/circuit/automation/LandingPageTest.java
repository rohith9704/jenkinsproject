package project.circuit.automation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LandingPageTest extends Page{
	public WebDriver driver = null;
	LandingPage signInBut = null;
	LandingPage signUp = null;
	
	@BeforeTest
	public void LandingPage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohithreddygaddam\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.circuit.com/");

	}
	@Test(priority = 1)
	public void landingPage_A() {
		signInBut = PageFactory.initElements(driver, LandingPage.class);
		signInBut.signInButton();
	}
	@Test(priority = 2)
	public void landingPage_B() {
	    signUp = PageFactory.initElements(driver, LandingPage.class);
		System.out.println("driver" + driver);
		signUp.signInButton();
	}
	@AfterTest
	public void CloseAll() {
		driver.close();
	}
}
