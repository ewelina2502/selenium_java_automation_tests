package olx;

import methods.WebdriverPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OlxMethods extends OlxSelectors {

    public static void testLogToOlx() throws InterruptedException {

        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteOlx);
        driver.findElement(By.xpath(acceptCookies)).click();
        driver.findElement(By.xpath(myOlxButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(userEmail)).sendKeys("ewelina2502@o2.pl");
        driver.findElement(By.id(userPassword)).sendKeys("Testowy123");
        driver.findElement(By.id(zalogujSie)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        WebElement menuOption = driver.findElement(By.xpath(myOlxLogout));
        actions.moveToElement(menuOption).perform();
        WebElement subMenuOption = driver.findElement(By.xpath(wylogujSie));
        actions.moveToElement(subMenuOption).click().perform();
        driver.quit();

    }
}
