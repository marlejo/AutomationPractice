package src.test.java.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import src.test.java.base.Base;

public class YourAddressesPage extends Base{
	
	By yoursAddressesMsg = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1");
	By addresField = By.id("address1");
	By cityField = By.id("city");
	By stateDDL = By.id("id_state");
	By zipCodeField = By.id("postcode");
	By countryDDL = By.id("id_country");
	By mobilePhoneField = By.id("phone_mobile");
	By addresAliasField = By.id("alias");
	By registerBtn = By.id("submitAccount");
	By saveBtn = By.id("submitAddress");
	

	public YourAddressesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean isDisplayedYourAddressesMsg() {
		return isDisplayed(yoursAddressesMsg);
	}
	
	public void registerNewAddress(String address, String city, String state, String zipcode, String country, String mobile, String alias ) {
		type(address, addresField);
		type(city, cityField);
		
		clic(stateDDL);
		WebElement statesDropdownList = findElement(stateDDL);
		List<WebElement> statesOptions = statesDropdownList.findElements(By.tagName("option"));
		for (int j = 0; j < statesOptions.size(); j++) {
			if (getText(statesOptions.get(j)).equals(state)) {
				clic(statesOptions.get(j));
			}
		}
		
		type(zipcode, zipCodeField);
		
		clic(countryDDL);
		WebElement countriesDropdownList = findElement(countryDDL);
		List<WebElement> countriesOptions = countriesDropdownList.findElements(By.tagName("option"));
		for (int j = 0; j < countriesOptions.size(); j++) {
			if (getText(countriesOptions.get(j)).equals(country)) {
				clic(countriesOptions.get(j));
			}
		}
		
		type(mobile, mobilePhoneField);
		type(alias, addresAliasField);
		clic(saveBtn);
	}

}
