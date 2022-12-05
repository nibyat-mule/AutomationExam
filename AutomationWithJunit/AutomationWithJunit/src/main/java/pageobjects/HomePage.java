package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

//PageFactory
	@FindBy(how = How.NAME, using = "allbox")
	WebElement clickToggleAllCheckBox;
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkboxes;
	@FindBy(css = "div:nth-child(2) form:nth-child(1) ul:nth-child(2) li")
	List<WebElement> ItemLists;
	@FindBy(css = "input[type='text'][name='data']")
	WebElement insertnewcheckboxname;
	@FindBy(css = "input[type='submit'][value='Add']")
	WebElement addnewcheckbox;
	@FindBy(css = "input[type='submit'][value='Remove']")
	WebElement removebutton;

	public void isallselected() {

		if (ItemLists.isEmpty()) {

			System.out.println("There is no a Checkbox to select so add a new one");
			insertnewcheckboxname.sendKeys("newAddedCheckbox");
			addnewcheckbox.click();
			clickToggleAllCheckBox.click();
			for (int i = 0; i < checkboxes.size(); i++) {
				Assert.assertTrue(checkboxes.get(i).isSelected());
			}

		} else {
			clickToggleAllCheckBox.click();
			for (int i = 0; i < checkboxes.size(); i++) {
				Assert.assertTrue(checkboxes.get(i).isSelected());
			}
		}

	}

// for the second question

	public void removeSingleItemUsingRemoveButton() {
		int beforeDeletion = checkboxes.size();
		checkboxes.get(0).click();
		removebutton.click();
		int listnumbers = checkboxes.size();

		if (listnumbers < beforeDeletion) {

			System.out.println("the item sucessfully deleted");
		} else {
			Assert.fail("the list still not deleted");
		}

	}

	// for the third question
	public void removeAllCheckBoxes() {

		clickToggleAllCheckBox.click();
		removebutton.click();
		if (ItemLists.isEmpty()) {
			System.out.println("all checkboxes are deleted");
		} else {
			Assert.fail("all checkboxes are deleted");
		}

	}

}
