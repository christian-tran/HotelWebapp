package org.chris.HotelWebapp;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Test {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(ENavigateur.chrome);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void test() {
		driver.get("http://192.168.102.209:9999/HotelWebapp/");
		driver.manage().window().maximize();
		
		PageHotel page_hotel = PageFactory.initElements(driver, PageHotel.class);
		assertEquals(page_hotel.title.getText(), "Application Tutoriel pour la base de données des hotels");
		Select cities = new Select(page_hotel.city_list);
		cities.selectByVisibleText("Paris");
		page_hotel.btn_search.click();
		assertTrue(page_hotel.hotel_latin.isDisplayed());
		
		
	}

}
