package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class StaticDropdown extends BaseTest {

    @Test
    public void verifyBooking() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertTrue(driver.getCurrentUrl().contains("dropdownsPractise"), 
                "Page URL does not match expected.");

        WebElement oneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
        if(!oneWay.isSelected()) {
            oneWay.click();
        }

        // From City
        WebElement fromDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
        Select fromSelect = new Select(fromDropdown);
        String fromCity = "Delhi (DEL)";
        fromSelect.selectByVisibleText(fromCity);

        // To City
        WebElement toDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
        Select toSelect = new Select(toDropdown);
        String toCity = "Mumbai (BOM)";
        toSelect.selectByVisibleText(toCity);

        // Verify
        Assert.assertEquals(fromSelect.getFirstSelectedOption().getText(), fromCity, "From city mismatch");
        Assert.assertEquals(toSelect.getFirstSelectedOption().getText(), toCity, "To city mismatch");
    }
}
