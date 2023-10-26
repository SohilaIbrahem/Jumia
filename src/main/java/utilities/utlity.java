package utilities;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class utlity {

    public static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        int randomNumbers = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        return randomNumbers;
    }

    // TODO: capture screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        Date currntDate = new Date();
        String screenshot = currntDate.toString().replace(" ", "-").
                replace(":", "-");
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE),
                    new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/"
                            + screenshot + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}






