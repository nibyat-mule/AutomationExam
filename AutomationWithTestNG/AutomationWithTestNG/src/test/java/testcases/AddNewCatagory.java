package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pageobjects.HomePage;

public class AddNewCatagory extends BaseTest {

	HomePage homepage;

	@BeforeTest
	public void setUp() {
		initDriver();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void addCatagoryAndValidate() {

		homepage.addNewCatagoryAndValidateIt();
	}

	@AfterTest
	public void shutDown() {
		tearDown();
	}
}
