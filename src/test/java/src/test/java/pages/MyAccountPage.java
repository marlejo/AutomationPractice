package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import src.test.java.base.Base;

public class MyAccountPage extends Base{
	
	By wellcomeMsg = By.xpath("/html/body/div/div[2]/div/div[3]/div/p");
	By myAdrressesMsg = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
	By myAdrressesBtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a");
	By addNewAddressBtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/a");
	By myPersonalInformatioBtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a");
	

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean isDisplayedWellcomeMsg() {
		waitToBeVisible(wellcomeMsg);
		return isDisplayed(wellcomeMsg);
	}
	
	public void goToMyAdrresses() {
		waitToBeVisible(myAdrressesBtn);
		clic(myAdrressesBtn);
	}
	
	public Boolean isDisplayedMyAddressesMsg() {
		waitToBeVisible(myAdrressesMsg);
		return isDisplayed(myAdrressesMsg);
	}
	
	public void clicAddNewAddress () {
		waitToBeVisible(addNewAddressBtn);
		clic(addNewAddressBtn);
	}
	
	public void clicMyPersonalInformatio() {
		waitToBeVisible(myPersonalInformatioBtn);
		clic(myPersonalInformatioBtn);
	}
}
