package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Dropdown extends BaseTest
{
	@Test
	public void verifyBooking() {

	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	    String fromCity = "Delhi";
	    String toCity = "Mumbai";

	    // ---------- PAGE VERIFICATION ----------
	    Assert.assertTrue(driver.getCurrentUrl().contains("dropdownsPractise"));

	    // ---------- TRIP TYPE ----------
	    WebElement oneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
	    if (!oneWay.isSelected()) {
	        oneWay.click();
	    }

	    // ---------- FROM CITY ----------
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();

	    int retry = 0;
	    while (retry < 2) {
	        try {
	            List<WebElement> fromCities = wait.until(
	                    ExpectedConditions.presenceOfAllElementsLocatedBy(
	                            By.xpath("//div[@id='dropdownGroup1']//a")));

	            for (WebElement city : fromCities) {
	                if (city.getText().contains(fromCity)) {
	                    wait.until(ExpectedConditions.elementToBeClickable(city));
	                    city.click();
	                    break;
	                }
	            }
	            break;

	        } catch (StaleElementReferenceException e) {
	            retry++;
	        }
	    }

	    // ---------- TO CITY ----------
	    retry = 0;
	    while (retry < 2) {
	        try {
	            List<WebElement> toCities = wait.until(
	                    ExpectedConditions.presenceOfAllElementsLocatedBy(
	                            By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1']//a")));

	            for (WebElement city : toCities) {
	                if (city.getText().contains(toCity)) {
	                    wait.until(ExpectedConditions.elementToBeClickable(city));
	                    city.click();
	                    break;
	                }
	            }
	            break;

	        } catch (StaleElementReferenceException e) {
	            retry++;
	        }
	    }
	}


}
