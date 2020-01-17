package src.test.java.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import src.test.java.base.Base;

public class CreateAccountPage extends Base{

	private WebDriver driver;
	
	By titleRadioBtn = By.id("id_gender1");
	By firstNameField = By.id("customer_firstname");
	By lastNameField = By.id("customer_lastname");
	By passwordField = By.id("passwd");
	By daysDDL = By.id("days");
	By firstDay = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[2]");
	By monthsDDL = By.id("months");
	By yearsDDL = By.id("years");
	By receiveOffersCheckbox = By.id("optin");
	By companyField = By.id("company");
	By addresField = By.id("address1");
	By cityField = By.id("city");
	By stateDDL = By.id("id_state");
	By zipCodeField = By.id("postcode");
	By countryDDL = By.id("id_country");
	By mobilePhoneField = By.id("phone_mobile");
	By addresAliasField = By.id("alias");
	By registerBtn = By.id("submitAccount"); 
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void typeAccountInfo(String firstName, String lastName, String password, String days, String months, String years, String company, 
			String address, String city, String state, String zipcode, String country, String mobile, String alias) throws InterruptedException  {
		waitToBeClickable(titleRadioBtn);
		clic(titleRadioBtn);
		type(firstName, firstNameField);
		type(lastName, lastNameField);
		type(password, passwordField);
				
		clic(daysDDL);		
		WebElement daysDropdownList = findElement(daysDDL);
		List<WebElement> daysOptions = daysDropdownList.findElements(By.tagName("option"));
		for (int i = 0; i < daysOptions.size(); i++) {
			if (getText(daysOptions.get(i)).equals(days+"  ")) {
				clic(daysOptions.get(i));
			}
		}		
		
		clic(monthsDDL);
		WebElement monthsDropdownList = findElement(monthsDDL);
		List<WebElement> monthssOptions = monthsDropdownList.findElements(By.tagName("option"));
		for (int j = 0; j < monthssOptions.size(); j++) {
			if (getText(monthssOptions.get(j)).equals(months+" ")) {
				clic(monthssOptions.get(j));
			}
		}
		
		clic(yearsDDL);
		WebElement yearsDropdownList = findElement(yearsDDL);
		List<WebElement> yearsOptions = yearsDropdownList.findElements(By.tagName("option"));
		for (int j = 0; j < yearsOptions.size(); j++) {
			if (getText(yearsOptions.get(j)).equals(years+"  ")) {
				clic(yearsOptions.get(j));
			}
		}
		
		clic(receiveOffersCheckbox);
		type(company, companyField);
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
		//clic(registerBtn);
	}

}
