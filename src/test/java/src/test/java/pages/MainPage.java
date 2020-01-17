package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import src.test.java.base.Base;

public class MainPage extends Base {
	
	By signInBtn = By.className("header_user_info");
	
	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clicSignin(){
		waitToBeClickable(signInBtn);
		clic(signInBtn);
	}

}
