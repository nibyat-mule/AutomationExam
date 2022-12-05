package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	String ExpectedOption[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",

			"Aug", "Sep", "Oct", "Nov", "Dec" };

//PageFactory
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement ensertnewcatagory;
	@FindBy(css = "input[type='submit'][value='Add category']")
	WebElement addcatagory;
	@FindBy(xpath = "//div[@class='controls']//a")
	List<WebElement> catagorylist;
	@FindBy(css = "select[name='due_month']")
	WebElement dropedown;
	@FindBy(xpath = "//a[normalize-space()='Yes']")
	WebElement yes;
	

// First question

	public void addNewCatagoryAndValidateIt() {
		ensertnewcatagory.sendKeys("NewCatagory");
		addcatagory.click();
		// I used java streams Here!
		Boolean match = catagorylist.stream().anyMatch(catagory -> catagory.getText().equalsIgnoreCase("NewCatagory"));
		Assert.assertTrue(match);
		System.out.println("New Catagory Sucessfully Added");
	}

// Second Question
	public void duplicateCatagory() {
		ensertnewcatagory.sendKeys("NewCatagory");
		addcatagory.click();
		Boolean match = catagorylist.stream().anyMatch(catagory -> catagory.getText().equalsIgnoreCase("NewCatagory"));
		if(match.TRUE) {
			yes.click();
			Assert.fail("The category you want to add already exists: NewCatagory");
		}
	}

// Third Options
	public void ValidateTheMonthDropDownHasAllTheMonths() {
		dropedown.click();
		Select sel = new Select(dropedown);
		List<WebElement> Months = sel.getAllSelectedOptions();
		for (int i = 1; i < Months.size(); i++) {

			Assert.assertEquals(Months.get(i), ExpectedOption[i]);

		}
		System.out.println("The Drope Down Got All Months");
	}
}
