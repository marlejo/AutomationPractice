package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import src.test.java.base.Base;

public class AuthenticationPage extends Base{
	
	By emailCreateField = By.id("email_create");
	By createAccountBtn = By.id("SubmitCreate");
	By emailSiginField = By.id("email");
	By passwordSigninField = By.id("passwd");
	By siginBtn = By.id("SubmitLogin");
	
	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void createAccount(String email) {
		waitToBeClickable(emailCreateField);
		type(email, emailCreateField);
		clic(createAccountBtn);
	}
	
	public void makeSingin (String email, String passw) {
		waitToBeClickable(siginBtn);
		type(email, emailSiginField);
		type(passw, passwordSigninField);
		clic(siginBtn);
	}

}
