package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import src.test.java.base.Base;

public class IdentityPage extends Base{
	
	By succesfullyUpdatedMsg = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p");

	public IdentityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Boolean isDisplayedSuccesfullyUpdatedMsg() {
		waitToBeVisible(succesfullyUpdatedMsg);
		return isDisplayed(succesfullyUpdatedMsg);
	}
}
