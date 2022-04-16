import methods.WebdriverPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AutomateDraft {

    @Test
    public void movingelements() {

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

        actions.dragAndDrop(titleC,titleA);
            actions.release().perform();


        }
}