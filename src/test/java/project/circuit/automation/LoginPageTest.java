package project.circuit.automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginPageTest extends Page {
	public WebDriver driver = null; 
	LoginPage loginPage = null;

	@BeforeTest
	public void pageTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohithreddygaddam\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.circuit.com/");
		driver.findElement(By.cssSelector("a[href='https://na.yourcircuit.com/login?region=us']")).click();
	}
	@AfterTest
	public void closeAll() {
		driver.close();
		
	}
	@Test(priority = 1)
	public void loginId() {
		LoginPage email = PageFactory.initElements(driver, LoginPage.class);
		email.loginId("jupiter6093@gmail.com");
	}
	@Test(priority = 2)
	public void nextButton() {
		LoginPage next = PageFactory.initElements(driver, LoginPage.class);
		next.clickButton();
	}

}
