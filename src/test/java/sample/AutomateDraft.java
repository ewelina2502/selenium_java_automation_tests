package sample;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import java.io.File;
import java.io.IOException;

public class AutomateDraft  extends SelectorsAndGenerators {

    @Test
    public static void googleSearch() throws IOException, InterruptedException {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website_google);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(button_cookie)).click();
        driver.findElement(By.xpath(button_search)).sendKeys("pogoda", Keys.ENTER);
        assert driver.findElement(By.id(button_temp)).isEnabled();

        Thread.sleep(4000);
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("C:/Users/Ewelina/Desktop/screenshot01.png"));

        System.out.println("The Screenshot is captured.");

    }
}