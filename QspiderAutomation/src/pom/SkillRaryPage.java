package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPage {

	@FindBy(id="navbar-search-input")
	private WebElement SearchField;
	
	public SkillRaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchField() {
		return SearchField;
	}
	
	
		
}
