package org.chris.HotelWebapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHotel {
	
	@FindBy (xpath="//h2")
	WebElement title ;
	
	@FindBy (xpath="//select[@name='ville']")
	WebElement city_list ;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement btn_search ;

	@FindBy (xpath="//td[text()='Hotel Latin']")
	WebElement hotel_latin ;

}
