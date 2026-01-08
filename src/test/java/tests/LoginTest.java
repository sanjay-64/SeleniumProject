package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(invocationCount = 1, threadPoolSize = 20)
    public void Loginhrm() {
    	System.out.println("Thread ID: " + Thread.currentThread().getId());


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        userName.clear();
        userName.sendKeys("Admin");

        WebElement userPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        userPwd.clear();
        userPwd.sendKeys("admin123");

        WebElement loginButton = wait.until(xpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginButton.click();

        driver.quit();
    }
}
