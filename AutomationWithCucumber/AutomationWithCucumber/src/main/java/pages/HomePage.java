package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(css = "button[onclick='myFunctionSky()']")
	WebElement SetSkyBlueButton;
	@FindBy(css = ".darkreader.darkreader--fallback")
	WebElement bluebackground;
	@FindBy(xpath = "//body")
	WebElement background;
	@FindBy(css = "button[onclick='myFunctionSky()']")
	WebElement SetSkyBlueButtonExist;
	@FindBy(css = "button[onclick='myFunctionWhite()']")
	WebElement SetSkyWhiteButton;

	public void doesTheButtonExist() {
		Assert.assertTrue(SetSkyBlueButtonExist.isDisplayed());
		System.out.println();
	}

	public void clickOnSkyBlueButton() {
		SetSkyBlueButton.click();

	}

	public void vallidateTheBGC() {
		String color = background.getCssValue("background-color");
		System.out.println(color);
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		Assert.assertEquals("#87ceeb", hex);
	}

	public void doesTheSkyWhiteButtonExist() {
		Assert.assertTrue(SetSkyWhiteButton.isDisplayed());
		System.out.println();
	}

	public void clickOnSkyWhiteButton() {
		SetSkyWhiteButton.click();

	}

	public void vallidateTheWhiteBGC() {
		String color = background.getCssValue("background-color");
		System.out.println(color);
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		Assert.assertEquals("#ffffff", hex);
		System.out.println("The Background color is white now");
	}

}
