package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Methods extends Selectors {

    public static void start() {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);

    }

    public static void googleSearch() {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website_google);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(button_cookie)).click();
        driver.findElement(By.xpath(button_search)).sendKeys("pogoda", Keys.ENTER);
        assert driver.findElement(By.id(button_temp)).isEnabled();
        driver.quit();

    }

    public static void testarena() {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testarena);
        driver.findElement(By.id(bar_testarena_email)).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id(bar_testarena_password)).sendKeys("sumXQQ72$L");
        driver.findElement(By.id(button_testarena_login)).click();
        assert driver.findElement(By.xpath(button_testarena_admin)).isEnabled();
        driver.findElement(By.xpath(button_testarena_admin)).click();
        driver.findElement(By.xpath(button_testarena_add)).click();
        driver.findElement(By.id(button_testarena_project_name)).sendKeys(generatorRandom());
        driver.findElement(By.id(button_testarena_project_prefix)).sendKeys(generatorRandom());
        driver.findElement(By.id(button_testarena_project_desc)).sendKeys("text");
        driver.findElement(By.id(button_testarena_save)).click();
        driver.findElement(By.xpath(correct_adding));
        System.out.println("TEST PASSED");
        driver.quit();

    }

    public static void testAutomationShop(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(email_selector)).sendKeys("seleniumwsh@gmail.com");
        driver.findElement(By.id(message_selector)).sendKeys("text message");
        driver.findElement(By.id(submit_button_selector)).click();
        assert driver.findElement(By.cssSelector(success_email_sent_selector)).isEnabled();
        driver.quit();

    }

}
