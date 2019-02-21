package project.circuit.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	public static  WebDriver driver;
	public static  Properties prop;
	 
	 public Page() {
		 try {
			 prop = new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\rohithreddygaddam\\Desktop\\ellcipse files"
			 		+ "\\CircuitPOM\\src\\config.properties");
			 prop.load(ip);
		 } catch(FileNotFoundException e) {
			 e.printStackTrace();
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public static void initialization() {
		 
		 String browserName = prop.getProperty("browser");
		 if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\rohithreddygaddam\\Desktop\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		 }else if(browserName.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\rohithreddygaddam\\Desktop\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	 }
	

}