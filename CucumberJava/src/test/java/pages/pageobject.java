package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobject{
	
	protected WebDriver driver;
	private By txt_username =By.id("email");
	private By txt_password = By.id("passwd");
	private By btn_sigin = By.id("SubmitLogin");
	
	public pageobject(WebDriver driver){
		this.driver =driver;
		
	}
	
	public void enterUsername(String username){
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword(String password){
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clicklogin(){
		driver.findElement(btn_sigin).click();
	}

}
