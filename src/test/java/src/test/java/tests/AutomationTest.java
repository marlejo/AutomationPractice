package src.test.java.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import src.test.java.pages.AuthenticationPage;
import src.test.java.pages.CreateAccountPage;
import src.test.java.pages.MainPage;
import src.test.java.pages.MyAccountPage;
import src.test.java.pages.YourAddressesPage;
import src.test.java.pages.YourPersonalInformationPage;
import src.test.java.pages.IdentityPage;

public class AutomationTest {

	private WebDriver driver;
	
	private static final String CREATE_EMAIL = "marlejo2@hotmail.com";
	private static final String SIGIN_EMAIL = "marlejo@hotmail.com";
	private static final String URL = "http://automationpractice.com/index.php";
	private static final String FIRST_NAME = "Mauricio";
	private static final String LAST_NAME = "Ramirez";
	private static final String PASSWORD = "123456789";
	private static final String NEW_PASSWORD = "qwerty";
	private static final String DAYS = "31";
	private static final String MONTHS = "May";
	private static final String YEARS = "1984";	
	private static final String COMPANY = "Freelance";
	private static final String ADDRESS = "Calle 19 # 25A - 12";
	private static final String CITY = "Texas";
	private static final String STATE = "Texas";
	private static final String ZIPCODE = "63000";
	private static final String COUNTRY = "United States";
	private static final String MOBILE_PHONE = "3007878477";
	private static final String ADDRESS_ALIAS = "My Home";
	
	MainPage mainPage;
	AuthenticationPage authenticationPage;
	CreateAccountPage createAccountPage;
	MyAccountPage myAccountPage;
	YourAddressesPage yourAddressPage;
	YourPersonalInformationPage yourPersonalInformationPage;
	IdentityPage identityPage;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		mainPage = new MainPage(driver);
		authenticationPage = new AuthenticationPage(driver);
		createAccountPage = new CreateAccountPage(driver);
		myAccountPage = new MyAccountPage(driver);
		yourAddressPage = new YourAddressesPage(driver);
		yourPersonalInformationPage = new YourPersonalInformationPage(driver);
		identityPage = new IdentityPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void createAccounttest() throws InterruptedException {
		mainPage.clicSignin();
		authenticationPage.createAccount(CREATE_EMAIL);
		createAccountPage.typeAccountInfo(FIRST_NAME, LAST_NAME, PASSWORD, DAYS, MONTHS, YEARS, COMPANY, ADDRESS, CITY, STATE, ZIPCODE, COUNTRY, MOBILE_PHONE, ADDRESS_ALIAS);
		assertTrue(myAccountPage.isDisplayedWellcomeMsg());
	}

	@Test
	public void LoginTest() {
		mainPage.clicSignin();
		authenticationPage.makeSingin(SIGIN_EMAIL, PASSWORD);
		assertTrue(myAccountPage.isDisplayedWellcomeMsg());
	}
	
	@Test
	public void addAdrressTest() {
		mainPage.clicSignin();
		authenticationPage.makeSingin(SIGIN_EMAIL, PASSWORD);
		assertTrue(myAccountPage.isDisplayedWellcomeMsg());
		myAccountPage.goToMyAdrresses();
		assertTrue(myAccountPage.isDisplayedMyAddressesMsg());
		myAccountPage.clicAddNewAddress();
		assertTrue(yourAddressPage.isDisplayedYourAddressesMsg());
		yourAddressPage.registerNewAddress(ADDRESS, CITY, STATE, ZIPCODE, COUNTRY, MOBILE_PHONE, ADDRESS_ALIAS);
		assertTrue(yourAddressPage.isDisplayedYourAddressesMsg());
	}
	
	@Test
	public void changePassword() {
		mainPage.clicSignin();
		authenticationPage.makeSingin(SIGIN_EMAIL, PASSWORD);
		assertTrue(myAccountPage.isDisplayedWellcomeMsg());
		myAccountPage.clicMyPersonalInformatio();
		assertTrue( yourPersonalInformationPage.isDisplayedYourPersonalInformationMsg());
		yourPersonalInformationPage.changePassword(PASSWORD, NEW_PASSWORD , NEW_PASSWORD);
		assertTrue(identityPage.isDisplayedSuccesfullyUpdatedMsg());
	}
}
