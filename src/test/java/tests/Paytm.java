package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Paytm 
{
	
	@Test
	public void paytmTest() {

	    WebDriver driver = null;

	    try {
	        driver = new ChromeDriver();
	        driver.get("https://paytm.com/");
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        WebElement mobileRecharge =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Mobile Recharge']")));
	        mobileRecharge.click();

	        WebElement iframe =wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
	        driver.switchTo().frame(iframe);

	        WebElement prepaidButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio']")));

	        if (prepaidButton.isSelected()) 
	        {
	        	System.out.println("already selected");
	        } else {
	            prepaidButton.click();
	            System.out.println("prepaid is selected now");
	        }
	    }
	    finally {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

}
