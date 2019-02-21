package project.circuit.automation;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPage extends Page {
	@FindBy(css = "input[id='id_loginViewEmail']") 
	WebElement email;
	@FindBy(css = "button[u-localize='res_Next']")
    WebElement nextButton;
	
    public LoginPage(WebDriver driver) {
        super();
    }
     
    public void loginId(String Email) {
        email.sendKeys(Email);
    }
    public void clickButton() {
    	 nextButton.click();
    }
 
}
