package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


import basetest.BaseTest;
import pageobjects.HomePage;

public class CheckBoxValidation extends BaseTest {

	HomePage homepage;

	@Before
	public void setup() {
		initDriver();
	homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void clickToggleAll() {

		homepage.isallselected();
		
	}
	@After
	public void closeDriver() {
		tearDown();
	}

}
