package automationShop;

import methods.RandomsMethods;
import methods.WebdriverPath;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import static methods.Dates.dateHourAndSecounds;

public class AutomationShopMethods extends AutomationShopSelectors {

    public static void testAutomationShop() throws IOException {
        String t = dateHourAndSecounds();
        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(email_selector)).sendKeys(RandomsMethods.emailGenerator());
        driver.findElement(By.id(message_selector)).sendKeys(RandomsMethods.printGenerator());
        driver.findElement(By.id(submit_button_selector)).click();
        File fa = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fa, new File("C:/Users/Ewelina/Desktop/" + t + "automationShop.png"));
        assert driver.findElement(By.cssSelector(success_email_sent_selector)).isEnabled();
        driver.quit();
    }

    public static void testAutomationShopWithoutEmail(){
        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(message_selector)).sendKeys(RandomsMethods.printGenerator());
        driver.findElement(By.id(submit_button_selector)).click();
        assert driver.findElement(By.cssSelector(alert_message_selector)).isEnabled();
        driver.quit();
    }
}
