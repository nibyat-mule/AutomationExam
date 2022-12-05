package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import basetest.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class SkyWhiteStepDefinition extends BaseTest {
	HomePage homepage;

	@Before
	public void setUp() {
		initDriver();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^Set SkyWhite Background$")
	public void Set_SkyWhite_Background() {
		homepage.doesTheButtonExist();
	}

	@When("^I click on the button$")
	public void when_I_click_on_the_button() {
		homepage.clickOnSkyWhiteButton();
	}
	@Then("^the background color will change to White$")
	public void the_background_color_will_change_to_White() {
		homepage.vallidateTheWhiteBGC();
	}
}
//the background color will change to White
