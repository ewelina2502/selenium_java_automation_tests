package other;

import methods.WebdriverPath;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static methods.Dates.dateHourAndSecounds;

public class OtherMethods extends OtherSelectors {

    public static void googleSearch() throws InterruptedException, IOException {
        String t = dateHourAndSecounds();
        WebdriverPath.startMethod();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website_google);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        File fa = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fa, new File("C:/Users/Ewelina/Desktop/" + t + "_googlescreen1.png"));

        driver.findElement(By.xpath(button_cookie)).click();
        driver.findElement(By.xpath(button_search)).sendKeys("pogoda", Keys.ENTER);
        assert driver.findElement(By.id(button_temp)).isEnabled();
        Thread.sleep(4000);
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("C:/Users/Ewelina/Desktop/" + t + "_googlescreen.png"));
        System.out.println("The Screenshot is captured.");
        driver.quit();
    }


    public static void testTravel() throws InterruptedException {
        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteTravels);

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        WebElement productMenu = driver.findElement(By.xpath(productButton));
        actions.moveToElement(productMenu).perform();
        WebElement startButton = driver.findElement(By.xpath(howToStartButton));
        actions.moveToElement(startButton).click().perform();
        driver.quit();
    }

    public static void testCheckboxes() {
        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(websiteCheckbox);
        driver.findElement(By.xpath(checkboxes)).click();
        driver.findElement(By.xpath(checkboxesOut)).click();
        driver.quit();
    }

    public static void testDownloadFile(){
        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteDownload);
        WebElement addFile = driver.findElement(By.xpath(downloadFile));
        addFile.sendKeys("/Users/Ewelina/Desktop/2021-11-02_15-13.png");
        driver.findElement(By.xpath(downloadFile)).click();
        driver.quit();
    }


    public static void movingelements() {

        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        WebElement cookies = driver.findElement(By.id("cookieChoiceDismiss"));
        WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
        cookies.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(titleA);
        actions.dragAndDrop(titleC, titleA);
        actions.release().perform();
        driver.quit();
    }
}
