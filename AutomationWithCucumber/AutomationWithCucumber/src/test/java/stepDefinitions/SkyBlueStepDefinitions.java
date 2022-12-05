package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import basetest.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class SkyBlueStepDefinitions extends BaseTest {
	HomePage homepage;

	@Before
	public void setUp() {
		initDriver();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^Set SkyBlue Background$")
	public void Set_SkyBlue_Background() {
		homepage.doesTheButtonExist();
	}

	@When("^I click on the button$")
	public void when_I_click_on_the_button() {
		homepage.clickOnSkyBlueButton();
	}
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		homepage.vallidateTheBGC();
	}
}
