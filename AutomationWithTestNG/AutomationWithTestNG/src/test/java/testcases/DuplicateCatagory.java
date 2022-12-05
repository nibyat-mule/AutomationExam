package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pageobjects.HomePage;

public class DuplicateCatagory extends BaseTest {

	HomePage homepage;

	@BeforeTest
	public void setUp() {
		initDriver();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}
	@Test
	public void doNotAddDuplicateValue() {
		homepage.duplicateCatagory();
	}
}
