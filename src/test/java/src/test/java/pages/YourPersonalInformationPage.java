package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import src.test.java.base.Base;

public class YourPersonalInformationPage extends Base{
	
	By yourPersonalInformatioMsg = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1");
	By oldPasswordField = By.id("old_passwd");
	By newPasswordField = By.id("passwd");
	By confirmNewPasswordField = By.id("confirmation");
	By saveBtn = By.name("submitIdentity");

	public YourPersonalInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean isDisplayedYourPersonalInformationMsg() {
		return isDisplayed(yourPersonalInformatioMsg);
	}
	
	public void changePassword(String oldPass, String newPassw, String confirmPass) {
		waitToBeVisible(yourPersonalInformatioMsg);
		type(oldPass, oldPasswordField);
		type(newPassw, newPasswordField);
		type(confirmPass, confirmNewPasswordField);
		clic(saveBtn);
	}
	

}
