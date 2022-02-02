package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo extends SelectorsGoogle{

    public static void main(String[] args) {

        System.setProperty(webDriverChromeDriver , chromeBrowserExePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(button_cookie)).click();
        driver.findElement(By.xpath(button_search)).sendKeys("pogoda", Keys.ENTER);
        assert driver.findElement(By.id(button_temp)).isEnabled();

        driver.quit();
        System.out.println("TEST PASSED");

    }
}
