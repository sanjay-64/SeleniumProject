package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    /**
     * Capture screenshot in project/screenshots folder
     * @param driver WebDriver instance
     * @param testName Name of test case
     * @return path of screenshot file
     */
    public static String captureScreenshot(WebDriver driver, String testName) {

        // Timestamp for unique filename
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Project folder + screenshots folder
        String folderPath = System.getProperty("user.dir") + "/screenshots";
        String filePath = folderPath + "/" + testName + "_" + timestamp + ".png";

        // Create screenshot folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File dest = new File(filePath);
            Files.copy(src.toPath(), dest.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;
    }
}
