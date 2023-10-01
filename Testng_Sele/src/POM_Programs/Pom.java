package POM_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
   //declaretion//
	
	@FindBy(id="nav-search-submit-button")
	private WebElement amazon_search_button;

	//initialization//
	   Pom( WebDriver driver) 
	 {
	PageFactory.initElements(driver, this);
	}
	 public void amazon_button() {
		 
		 amazon_search_button.click();
	 } 
	 
}
